package Ch05;

import java.util.Scanner;

public class C01Arithmethic {

	public static void main(String[] args) {
		
		//기본 산술연산자
	
//		int a = 10,b=3;
//		System.out.println("a + b = "+(a + b));
//		System.out.println("a - b = "+(a - b));
//		System.out.println("a * b = "+(a * b));
//		System.out.println("a / b = "+(a / b));
//		System.out.println("a % b = "+(a % b)); // 짝홀수 / 배수구분 /범위제한 / 자리수
		
		//대입연산자
		
		// 공간=값(먼저처리)
		

		//복합대입연산자
		
//		int a = 10,b=4;
//		System.out.println(a + b);
//		System.out.println("a+=b ? " + (a+=b));	//a = a + b 
//		System.out.println("a-=b ? " + (a-=b));	//a = a - b
//		System.out.println("a*=b ? " + (a*=b));	//a = a * b
//		System.out.println("a/=b ? " + (a/=b));	//a = a / b
		
		
		//비교연산자(대소관계 비교, true/false를 반환)
		//참(true)	:프로그래머가 원하는 결과값이 나오는 경우 
		//거짓(false):x

//		int a = 10; int b = 20;
//		
//		System.out.println("a == b ? " + (a == b)); // a=b , a==b
//		System.out.println("a >  b ? " + (a >  b));
//		System.out.println("a >= b ? " + (a >= b));
//		System.out.println("a <  b ? " + (a <  b));
//		System.out.println("a <= b ? " + (a <= b));
//		System.out.println("a != b ? " + (a != b));
		
		//논리연산자

		//		int a = 10; int b= 20;int c=15;
//		
//		//AND 연산자(&&) : 둘다 true 여야지 true를 반환
//		System.out.println((a>=b)&&(b>=c));	//false && true;
//		System.out.println((a<=b)&&(b<=c));	//true 	&& false
//		System.out.println((a<=b)&&(b>=c)); //true 	&& true 
//		System.out.println((a>=b)&&(b<=c)); //false && false
//		System.out.println();
//		//OR 연산자(||) : 둘중 하나만 true라도 true를 반환
//		System.out.println((a>=b)||(b>=c));	//false || true;
//		System.out.println((a<=b)||(b<=c));	//true 	|| false
//		System.out.println((a<=b)||(b>=c)); //true 	|| true 
//		System.out.println((a>=b)||(b<=c)); //false || false
//		System.out.println();
//		//! :논리 부정연산자
//		boolean flag = false;
//		System.out.println("!flag = " + !flag);
		
	
		
		//증감 연산자(++ : 1증가, -- : 1감소)
		
		//전치 연산자 : ++a,--a  : 변수안의 값을 1증가(or 1감소)를 먼저 연산한다음 다른 연산 처리
		//후치 연산자 : a++,a--; : 다른 연산처리를 다 완료한다음 1증가(or 1감소)
		
//		int a= 10 , b = 20, c= 15,d=0;
//		boolean flag;
//		flag = (++a<b) && (++b>c);	 
//	 
//		System.out.println(a +" " + b + " " + c  + " " + d);
		
		
		
		//삼항 연산자
		
//		int score = 85;
//		char grade = (score>90) ? 'A':'B';
//		
//		System.out.println("grade ? " + grade);
		
		
		//문제
		
		//조건식 : 국어>=40&&영어>=40&&수학>=40&&평균>=70 -> 합격
		//키보드로 국어/영어/수학 점수를 입력받아 각각의부분점수가 40점이상이고
		//총점수 평균이 70점이상이면 '합격'
		//미만이면 '불합격'을 출력합니다
		
//		int kor=0,eng=0,mat=0;
//		double avg=0.0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국영수 점수 입력 : " );
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		mat = sc.nextInt();
//		avg = (double)(kor+eng+mat)/3;
//		
//		String result = (kor>=40&&eng>=40&&mat>=40&&avg>=70)
//				?"합격"
//				:"불합격";
//		System.out.println(result);
		
		
		
		
		//비트 연산자
		//시프트 연산자
		
		int num1 = 15;			//00000000 00000000 00000000 00001111
		int num2 = 20;			//00000000 00000000 00000000 00010100
		int num3 = num1&num2;	//00000000 00000000 00000000 00000100
		int num4 = num1|num2;	//00000000 00000000 00000000 00011111
		int num5 = num1^num2;	//00000000 00000000 00000000 00011011
		int num6 = ~num1;		//11111111 11111111 11111111 11110000
		
		int num7 = num1<<2;		//00000000 00000000 00000000 00111100
		int num8 = num1>>3;		//00000000 00000000 00000000 00000001
		
		System.out.println("AND 비트 연산 : "  + num3);
		System.out.println("OR 비트 연산 : "  + num4);
		System.out.println("XOR 비트 연산 : "  + num5);
		System.out.println("NOT 비트 연산 : "  + num6);
		System.out.println("<< 시프트 연산 : "  + num7);
		System.out.println(">> 비트 연산 : "  + num8);
		
		
		
		

	}

}
