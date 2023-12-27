package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
	
		//01 반복문 탈출 조건

//		int i=1; //1) 탈출용 변수
//		while(i<=10) //2) 탈출 조건식
//		{
//			System.out.println("Hello World");
//			i++; //3) 탈출 연산식
//		}
		 
		//02 1부터 10까지의 합을 구하기
		
//		int i=1;	//탈출용 변수
//		int sum=0;	//누적용 변수
//		while(i<=10)
//		{
//			System.out.println("i = " + i);
//			sum+=i; //sum = sum + i;
//			i++;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		//문제
		//1부터 n(키보드로 입력받습니다)까지의 합을 구합니다
		
		//초기값 / 조건식 /증감연산
		
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int i=1;	//탈출용
//		int sum=0;	//누적용
//		while(i<=n)
//		{
//			//i=1,2,3,4,5,6,7...n
//			sum+=i;//sum=sum+i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지의 합 : %d\n",1,n,sum);
		
		
		//n부터 m까지수의 합을 구합니다(n,m은 키보드로 입력받습니다)
		
//		Scanner sc = new Scanner(System.in);
//		int n=0,m=0,sum=0;
//		System.out.print("n,m 입력 : " ); //3 , 10
//		n=sc.nextInt();
//		m=sc.nextInt();
//		
//		
//		//n>m 인경우 n,m 값을 교체
//		if(n>m)
//		{
//			int tmp=n;
//			n=m;
//			m=tmp;
//		}
//		
//		int i=n;
//		while(i<=m)
//		{
//			sum+=i;	//증가하는 i값을 sum에 누적
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지의 합 : %d\n", n,m,sum);
		
		
	
		//구구단 2단 출력합니다
		//단수를 하나 입력받아서 해당 단수를 출력합니다
		
//		int i=1;
//		while(i<=9)
//		{
//			System.out.printf("%d x %d = %d\n",2,i,(2*i));
//			i++;
//		}
		
		
		
		//1부터 10까지 수 중의 3의배수의 합만 출력
		
//		int i=1;int sum=0;
//		while(i<=10)
//		{
//			if(i%3==0) {
//				System.out.println("i = " + i);
//				sum+=i;
//			}	
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지중 3의 배수 합 : %d\n" ,1,10,sum);
		
		
		//1부터 10까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력

//		int i=1;int oddsum=0,evensum=0;
//		while(i<=10)
//		{
//			if(i%2==0) {
//				System.out.println("짝수 i = "+i);
//				evensum+=i;
//			}else {
//				System.out.println("홀수 i = "+i);
//				oddsum+=i;
//			}
//			i++;
//		}
//		System.out.printf("짝수 합=%d,홀수 합=%d\n",evensum,oddsum);
		
		
		//1부터 n까지 수 중의 3의배수의 합만 출력
		//1부터 n까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력
		//n부터 m까지 수 중의 3의배수의 합만 출력
		//n부터 m까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력		
	

	}

}
