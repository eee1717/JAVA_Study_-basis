package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		 
		//문제
		//국어(kor) 영어(eng) 수학(mat) 점수를 Scanner로 입력받아
		//총합과 평균을 구해보세요
		//평균값은 소수점을 포함하여 출력합니다
		int kor; int eng; int mat;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("국영수 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		sum = kor + eng + mat;
		System.out.println("총합 : " + sum);
		System.out.println("총합 : " + (double)sum/3);
		
		
		
		
	}

}
