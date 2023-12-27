package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
			
		//단순 IF
		
//		int age = 9;
//		
//		if(age >=8) 
//			System.out.println("취학 아동입니다");
//		
//		System.out.println("첫번째 IF 벗어남..");
//		
//		if(age <8) 
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("두번째 IF 벗어남..");
		
		//
		
		//IF - ELSE 
		
//		int age = 9;
//		
//		if(age >=8) 
//		{
//			System.out.println("취학 아동입니다");
//		}
//		else 	// if(age <8) 
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("두번째 IF 벗어남..");
		
		
		//정수 3개값을 입력받아
		//입력받은 수의 모든합이 짝수이면 "N은 짝수입니다"
		//홀수 이면 "N은 홀수입니다"를 if-else 문을 이용해서 출력
		
//		int n1=0,n2=0,n3=0,sum=0;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 3개 입력 : ");
//		n1=sc.nextInt();
//		n2=sc.nextInt();
//		n3=sc.nextInt();
//		sum = n1+n2+n3;
//		
//		if(sum%2==0)//짝수냐?
//		{
//			System.out.println(sum + " 은 짝수입니다");
//		}
//		else //홀수냐?
//		{
//			System.out.println(sum + " 은 홀수입니다");
//		}
//		sc.close();
		
		
		
		//짝수이면서 3의배수 -> 출력
		//홀수이면서 5의배수 -> 출력

//		int n=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		n=sc.nextInt();
//		
//		if(n%2==0) //짝수냐?
//		{
//			//짝수인경우6
//			if(n%3==0) //3의배수냐?(짝수이면서 3의배수냐?)
//			{
//				System.out.println(n+" 은 짝수이면서 3의배수");
//			}
//		}
//		else	//홀수냐?
//		{
//			//홀수인경우
//			if(n%5==0) //5의배수냐?(홀수이면서 5의배수냐?)
//			{
//				System.out.println(n+" 은 홀수이면서  5의배수");
//			}
//		}
//		System.out.println("프로그램을 종료합니다이~");
		
		
		
		//두수를 입력받아 큰수를 출력하세요

//		int n1=0,n2=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 2개 입력 : ");
//		n1=sc.nextInt();
//		n2=sc.nextInt();
//		if(n1>n2)
//		{
//			System.out.println("큰수 : " + n1);
//		}
//		else
//		{
//			//n1=<n2
//			System.out.println("큰수 : " + n2);
//		}
		
		
		
		//세 수를 입력받아 가장 큰수를 출력하세요
		
		int n1=0,n2=0,n3=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		//n1이 제일큰경우 n1>n2&&n1>n3
		//n2이 제일큰경우 n2>n1&&n2>n3
		//n3이 제일큰경우 n3>n1&&n3>n2
		if(n1>=n2&&n1>=n3)
		{
			System.out.println("큰 수 : " + n1);
		}
		if(n2>=n1&&n2>=n3)
		{
			System.out.println("큰 수 : " + n2);
		}
		if(n3>=n1&&n3>=n2)
		{
			System.out.println("큰 수 : " + n3);
		}

		
		
		
		
		
		//문제
		//위 코드의 조건식과 if문을 and연산자 기호를 써서 바꿔보세요
		

	}

}
