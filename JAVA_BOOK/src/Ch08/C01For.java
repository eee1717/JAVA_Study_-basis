package Ch08;

public class C01For {

	public static void main(String[] args) {
		
//		int i=1; //1) 탈출용 변수
//		while(i<=10) //2) 탈출 조건식
//		{
//			System.out.println("Hello World");
//			i++; //3) 탈출 연산식
//		}
		
		for(int i=1;i<=10;i++) {
			System.out.println("Hello World");
		}
		
		
		//02 1부터 10까지의 합을 구하기

		//문제
		//1부터 n(키보드로 입력받습니다)까지의 합을 구합니다	
		//n부터 m까지수의 합을 구합니다(n,m은 키보드로 입력받습니다)
		//구구단 2단 출력합니다
		//단수를 하나 입력받아서 해당 단수를 출력합니다
		//1부터 10까지 수 중의 3의배수의 합만 출력
		//1부터 10까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력
		//1부터 n까지 수 중의 3의배수의 합만 출력
		//1부터 n까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력
		//n부터 m까지 수 중의 3의배수의 합만 출력
		//n부터 m까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력	

		
		
		

		
		//전체 구구단을 역순출력합니다 
		//9 x 1 = 9
		//9 x 2 = 18
		//..
		//2 x 1 = 2
		//..
		//2 x 9 = 18

		
		//전체 구구단을 역순출력합니다 
		//9 x 9 = 81
		//9 x 8 = 72
		//9 x 7 = 63
		//..
		//2 x 1 = 2
		

		//단수를 입력받아(dan) dan-9단까지 출력합니다
		//조건 : dan안의 숫자는 9미만이어야 합니다
		
		// 전체구구단(가로)
		// 2 x 1 = 2 	3 x 1 = 3		... 	9 x 1 = 9
		// 2 x 2 = 4	3 x 2 = 6		...		9 x 2 = 18
		// ..
		// 2 x 9 = 18	3 x 9 = 27				9 x 9 = 81
		
//	
		
		// *****
		// *****
		// *****
		// *****
//		i(행)		j(별)
//		0			0-4
//		1			0-4
//		2			0-4
//		3			0-4
//		----------------------
//		i=0			j=0,j++,j<5
//		i++
//		i<4
		

		
		// *
		// **
		// ***
		// ****

		
		// 높이 : 3
		// *
		// **
		// ***
		
	
		
		
		// ****
		// ***
		// **
		// *
	
		
		// 높이 : 3
		// ***
		// **
		// *
		

		
		//   *
		//  ***
		// *****
		//*******

		
		// 높이 : 3
		//   *
		//  ***
		// *****	
		
	
		
		
		//*******
		// *****
		//  ***
		//   *
	
		
		// 높이 : 3
		// *****
		//  ***
		//   *

		
		
		//   *
		//  ***
		// *****
		//******* 
		// *****
		//  ***
		//   *

		// 높이(홀수값) : 3
		//  *
		// ***
		//  *

		
	}

}
