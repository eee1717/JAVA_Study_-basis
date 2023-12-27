package Ch09;

import java.util.Scanner;

class C05Simple{
	//속성
	Scanner sc = new Scanner(System.in);
	
	//기능
	//반환o , 매개변수o
	int sum1(int x, int y) {
		return x+y;
	}
	//반환o , 매개변수x
	int sum2() {
		System.out.print("정수 2개 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	//반환x , 매개변수o
	void sum3(int x, int y) {
		System.out.printf("sum3(%d , %d)=%d\n",x,y,x+y);
	}
	//반환x , 매개변수x
	void sum4() {
		System.out.print("1값 입력 : ");
		int x = sc.nextInt();
		System.out.print("2값 입력 : ");
		int y = sc.nextInt();
		System.out.printf("%d + %d = %d\n",x,y,x+y);
	}
}
//SubClass 를 선언하고
//sub1,sub2,sub3,sub4멤버 메서드를 만들어서 실행해봅니다(두수의 차계산함수)
//sub1(int x,int y) : int
//sub2() : void
//sub3(int x,int y) : void
//sub4() : int 

class SubClass{
	Scanner sc = new Scanner(System.in);
	
	int sub1(int x, int y) {
		if(x>y) {
			return x-y;
		}
		else {
			return y-x;
		}
		
	}
	
	
	void sub2() {
		System.out.print("두 정수를 입력하세요");
		int x =sc.nextInt();
		int y =sc.nextInt();
		if(x>y) {
			 System.out.println(x-y);
		}
		else {
			System.out.println(y-x);
		}
	}
	
	void sub3(int x, int y) {
		if(x>y) {
			System.out.println(x-y);
		}
		else {
			System.out.println(y-x);
		}
	}
	
	int sub4() {
		System.out.println("두 정수를 입력하세요");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x>y) {
			return x-y;
		}
		else {
			return y-x;
		}
	}
	
}




















//class subclass
//{
//	//속성
//	Scanner sc = new Scanner(System.in);
//	//기능
//	int sub1(int x,int y) {
//		if(x>y) {
//			return x-y;
//		}else {
//			return y-x;
//		}
//	}
//	void sub2() {
//		System.out.print("두 수 입력 : " );
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		if(x>y) {
//			System.out.println(x-y);
//		}else {
//			System.out.println(y-x);
//		}
//	}
//	void sub3(int x,int y) {
//		if(x>y) {
//			System.out.println(x-y);
//		}else {
//			System.out.println(y-x);
//		}
//	}
//	int sub4() {
//		System.out.print("두 수 입력 : " );
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		if(x>y) {
//			return (x-y);
//		}else {
//			return (y-x);
//		}
//	}
//	
//}


public class C05SimpleMethod 
{
	public static void main(String[] args) 
	{
//		C05Simple obj = new C05Simple();
//		
//		int result1 = obj.sum1(10,20);	//10,20 인자
//		System.out.println("result1 = " + result1);
//		
//		int result2 = obj.sum2();
//		System.out.println("result2 = " + result2);
//		
//		obj.sum3(111,222);
//		
//		obj.sum4();

		SubClass obj = new SubClass();
		
		int result1 = obj.sub1(20, 30);
		System.out.println(result1);
		
		obj.sub2();
		
		obj.sub3(20, 40);
		
		int result2 = obj.sub4();
		System.out.println(result2);
		
	}

}
