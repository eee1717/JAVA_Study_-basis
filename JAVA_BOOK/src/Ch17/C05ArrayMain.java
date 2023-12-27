package Ch17;

import java.util.Scanner;

public class C05ArrayMain {

	public static void main(String[] args) {
		//문제
		//5명의 학생의 국/영/수학 점수를 입력받아 출력합니다
		//2차원 배열 을 사용합니다
		//int score[][] = new int[5][3]
		//학생별 총점과 평균
		//국/영/수학별 총점과 평균도 함께 출력
		//[출력예]
		//1 학생 점수입력(국/영/수 순서) : 100 70 60
		//2 학생 점수입력(국/영/수 순서) : 99 88 77
		//3 학생 점수입력(국/영/수 순서) : 10 20 30
		//4 학생 점수입력(국/영/수 순서) : 100 55 66
		//5 학생 점수입력(국/영/수 순서) : 88 77 66
		
		
		int[][] score = new int [5][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d 학생 점수입력(국/영/수) : " , (i+1));
			score[i][0] = sc.nextInt(); //i번째 학생의 국어점수 입력
			score[i][1] = sc.nextInt(); //i번째 학생의 영어점수 입력
			score[i][2] = sc.nextInt(); //i번째 학생의 수학점수 입력		
		}
		

		
		
		//1 학생 총점 : ? 평균 ?
		//2 학생 총점 : ? 평균 ?
		//3 학생 총점 : ? 평균 ?
		//4 학생 총점 : ? 평균 ?
		//5 학생 총점 : ? 평균 ?
		
		//학생별 총점
		int [] students = new int[5];//학생별 국영수점수 총점 저장용 배열 
		double avg=0.0;
		for(int i=0;i<score.length;i++)	//행이동
		{
			for(int j=0;j<score[i].length;j++)//열이동 
			{
				students[i]+=score[i][j]; // 학생별 국영수 총점 넣기
			}
		}
			
		//국어 총점 : ? 평균 : ?
		//영어 총점 : ? 평균 : ?
		//수학 총점 : ? 평균 : ?
		
		//과목별 총점
		int subjects[] = new int[3]; //과목별 총점 저장(0:국어,1:영어,2:수학)
		for(int i=0;i<score.length;i++)
		{
				subjects[0]+=score[i][0];
				subjects[1]+=score[i][1];
				subjects[2]+=score[i][2];
		}
		
		//결과 출력
		
		//Score 결과 출력 시작-------------------
		int div=score.length;
		System.out.println("\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<score.length;i++) {
			System.out.printf("%2d 학생\t",i+1);
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(students[i]+"\t"+(double)students[i]/3);
		}
		System.out.printf("   %s\t%d\t%d\t%d\n","총점",subjects[0],subjects[1],subjects[2]);
		System.out.printf("   %s\t%.2f\t%.2f\t%.2f\n","평균",(double)subjects[0]/div,(double)subjects[1]/div,(double)subjects[2]/div);
		//Score 결과 출력 끝--------------------
		

	}

}
