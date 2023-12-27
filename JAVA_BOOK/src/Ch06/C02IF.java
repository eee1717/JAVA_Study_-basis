package Ch06;

import java.util.Scanner;

public class C02IF {

	public static void main(String[] args) {
		 
		//Else IF 문
		
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age>=20) 
//		{
//			System.out.println("성인입니다ㅜㅜ");
//		}
//		else if(age>=8) {
//			System.out.println("취학아동입니다..힘내렴");
//		}
//		else
//		{
//			System.out.println("미취학아동입니다..어릴때가좋은거다~");
//		}
		
		
		
		//문제 
		//Score를 입력받아서
		//90점이상이면 'A'
		//90점미만 80점이상이면 'B'
		//80점미만 70점이상이면 'C'
		//70점미만 60점이상이면 'D'
		//60점미만이라면 'F'
		//출력
		
//		int score=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수 입력 : " );
//		score = sc.nextInt();
//		
//		if(score>=90)
//		{
//			System.out.println("A");
//		}
//		else if(score>=80)	//80 <=score<90
//		{
//			System.out.println("B");
//		}
//		else if(score>=70)	//70 <=score<80
//		{
//			System.out.println("C");
//		}
//		else if(score>=60)	//60 <=score<70
//		{
//			System.out.println("D");
//		}
//		else	//score<60
//		{
//			System.out.println("F");
//		}
		
		//문제
		//나이별로 요금을 부과하는 else if만드세요
		//8세미만  : 1000원
		//14세미만 : 2000원
		//20세미만 : 2500원
		//20세이상 : 3000원
		
//		int age=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수 입력 : " );
//		age=sc.nextInt();
		
		//1안
//		if(age<8)
//		{
//			
//		}
//		else if(age<14)	//8<= age <14
//		{
//			
//		}
//		else if(age<20)//
//		{
//			
//		}
//		else
//		{
//			
//		}
		
		//2안
//		if(age>=20)
//		{
//			
//		}
//		else if(age>=14)	 
//		{
//			
//		}
//		else if(age>=8) 
//		{
//			
//		}
//		else
//		{
//			
//		}
		
		
		
		int n1=0,n2=0,n3=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		if(n1>=n2&&n1>=n3)
		{
			System.out.println("큰 수 : " + n1);
		}
		else if(n2>=n1&&n2>=n3)
		{
			System.out.println("큰 수 : " + n2);
		}
		else if(n3>=n1&&n3>=n2)
		{
			System.out.println("큰 수 : " + n3);
		}
		
		
		
	}

}
