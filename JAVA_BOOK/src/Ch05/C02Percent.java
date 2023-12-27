package Ch05;

import java.util.Scanner;

public class C02Percent {

	
	public static void main(String[] args) {
		
		// 1 짝/홀수(N%2)	
		
//		System.out.println(10%2==0); 	//짝수는 나머지 0
//		System.out.println(11%2==0);	//홀수는 나머지 1
//		System.out.println(12%2==0);	//짝수
//		System.out.println(13%2==0);	//홀수
//		System.out.println(14%2==0);	//짝수
		
		// 2 배수(3의배수 는 N%3==0 , 4의배수는 N%4==0...)
		
//		System.out.println(10%3==0); 	 
//		System.out.println(11%3==0);	 
//		System.out.println(12%3==0);	 
//		System.out.println(13%3==0);	 
//		System.out.println(14%3==0);	 	
//		System.out.println(15%3==0);	 	
//		System.out.println(16%3==0);	 
//		System.out.println(17%3==0);	 	
		
		
		//미니문제
		//키보드로 부터 정수값 2 를 입력받아
		//두수의 합이 짝수이면 "짝수입니다"
		//홀수이면 "홀수입니다" 를 출력하세요~
		
		
		//2) N%2==0 && N%3==0인경우 --출력

//		int n1=0,n2=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 2개 값 입력 : " );
//		n1=sc.nextInt();
//		n2=sc.nextInt();
//		int sum=n1+n2;
//		
//		String result=(sum%2==0&&sum%3==0)? "짝수&3의배수입니다":"짝수x or 3의배수 x or 둘다 x";
//		System.out.println("결과 : " + result);
		

		// 3 범위제한
		// N%2 => 0-1
		// N%3 => 0-2
		// N%4 => 0-3
		// N%10 =>0-9
		// N%100=>0-99
		
//		Scanner sc = new Scanner(System.in);
//		int tmp=0;
//		while(true)
//		{
//			System.out.print("값입력 : " );
//			tmp = sc.nextInt();
//			System.out.println("값확인 : " + (tmp%10)); //0-9까지의 수만 출력됨!
//			
//		}
		
	
		// 4 자리수 추출
		
//		System.out.println(12345%10);
//		System.out.println(12345%100);
//		System.out.println(12345%1000);
//		System.out.println(12345%10000);
//		System.out.println();
//		System.out.println(12345/10000);
//		System.out.println(12345/1000);
//		System.out.println(12345/100);
//		System.out.println(12345/10);
	
		
	}

}
