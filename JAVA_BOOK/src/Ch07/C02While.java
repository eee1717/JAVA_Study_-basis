package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		// 전체구구단(가로)

//		int dan=2;
//		int i=1;
//		while(dan<=9)
//		{
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,(dan*i));
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		//전체 구구단을 역순출력합니다 
		//9 x 1 = 9
		//9 x 2 = 18
		//..
		//2 x 1 = 2
		//..
		//2 x 9 = 18
		
//		dan	i
//		9	1-9
//		8	1-9
//		7	1-9
//		.
//		2
//		---------------
//		dan=9	i=1,i++,i<=9
//		dan--
//		dan>1
		
//		int dan=9;
//		int i=1;
//		while(dan>1)
//		{
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		//전체 구구단을 역순출력합니다 
		//9 x 9 = 81
		//9 x 8 = 72
		//9 x 7 = 63
		//..
		//2 x 1 = 2
		
//		int dan=9;
//		int i=1;
//		while(dan>1)
//		{
//			i=9;
//			while(i>=1)
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		

		//단수를 입력받아(dan) dan-9단까지 출력합니다
		//조건 : dan안의 숫자는 9미만이어야 합니다
		
//		Scanner sc = new Scanner(System.in);
//		int dan=sc.nextInt();
//		if(dan>=9) {
//			System.out.println("단수를 잘못입력하셨습니다.");
//		}
//		else
//		{
//			int i=1;
//			while(dan<=9)
//			{
//				i=1;
//				while(i<=9)
//				{
//					System.out.printf("%d x %d = %d\n",dan,i,(dan*i));
//					i++;
//				}
//				System.out.println();
//				dan++;
//			}	
//		}
//		System.out.println("종료합니다.");
		
		
		// 전체구구단(가로)
		// 2 x 1 = 2 	3 x 1 = 3		... 	9 x 1 = 9
		// 2 x 2 = 4	3 x 2 = 6		...		9 x 2 = 18
		// ..
		// 2 x 9 = 18	3 x 9 = 27				9 x 9 = 81
		
//		바깥		안쪽
//		i		dan
//		1		2-9
//		2		2-9
//		3		2-9
//		4
//		..
//		9		2-9
//		------------------------
//		i=1		dan=2,dan++,dan<=9
//		i++
//		i<=9
		
//		int i=1;
//		int dan=2;
//		while(i<=9)
//		{
//			dan=2;
//			while(dan<=9)
//			{
//				System.out.printf("%d x %d = %2d  ",dan,i,dan*i);
//				dan++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
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
		
//		int i=0; //행
//		int j=0; //별
//		
//		while(i<4)
//		{
//			j=0;
//			while(j<5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		// *
		// **
		// ***
		// ****
		
//		i	j
//		0	0-0
//		1	0-1
//		2	0-2
//		3	0-3
//		------------
//		i=0	j=0,j++,j<=i
//		i++	
//		i<4
		
//		int i=0; //행
//		int j=0; //별
//		
//		while(i<4)
//		{
//			j=0;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		// 높이 : 3
		// *
		// **
		// ***
		
		
//		높이 : n
//		i	j
//		0	0-0
//		1	0-1
//		2	0-2
//		3	0-3
//		..
//		n-1	0-n-1
//		------------
//		i=0	j=0,j++,j<=i
//		i++	
//		i<n
		
//		int i=0; //행
//		int j=0; //별
//		System.out.print("높이 : " );
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		while(i<n)
//		{
//			j=0;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		// ****
		// ***
		// **
		// *
		
//		i		j
//		0		0-3
//		1		0-2
//		2		0-1
//		3		0-0
//		-----------------------
//		i=0		j=0
//		i++		j++
//		i<4		j<=3-i
		
//		int i=0;
//		int j=0;
//		while(i<4)
//		{
//			j=0;
//			while(j<=3-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		// 높이 : 3
		// ***
		// **
		// *
		
//		높이 : h
//		i		j
//		0		0-(h-1)
//		1		0-(h-1) -1
//		2		0-(h-1) -2
//		3		0-(h-1) -3
//		4		
//		..
//		h-1		0-0
//		-----------------------
//		i=0		j=0
//		i++		j++
//		i<h		j<=(h-1)-i
		
		
//		int i=0;
//		int j=0;
//		System.out.print("높이 :" );
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		while(i<h)
//		{
//			j=0;
//			while(j<=(h-1)-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		i	j(공백)		k(별)
//		0	0-2			0-0
//		1	0-1			0-2
//		2	0-0			0-4
//		3	x			0-6
//		-------------------------------
//		i=0	j=0			k=0
//		i++	j++			k++
//		i<4	j<=2-i		k<=2*i		
		
		
		//   *
		//  ***
		// *****
		//*******
		
//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		
//		while(i<4)
//		{
//			//공백
//			j=0;
//			while(j<=2-i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=2*i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		// 높이 : 3
		//   *
		//  ***
		// *****	
		
		
//		높이 : h
//		i	j(공백)		k(별)
//		0	0-(h-2)		0-0
//		1	0-(h-2)-1	0-2
//		2	0-(h-2)-2	0-4
//		3	0-(h-2)-3	0-6
//		4	0-(h-2)-4	0-8
//		5	0-(h-2)-5	0-10
//		..				..
//		h-1	x			0-(h-1)*2
//		-------------------------------
//		i=0	j=0			k=0
//		i++	j++			k++
//		i<h	j<=(h-2)-i	k<=2*i
		
		
//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		System.out.print("높이 :" );
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		while(i<h)
//		{
//			//공백
//			j=0;
//			while(j<=(h-2)-i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=2*i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//*******
		// *****
		//  ***
		//   *
		
//		i	j(공백)		k(별)
//		0	x			0-6
//		1	0-0			0-4
//		2	0-1			0-2
//		3	0-2			0-0
//		--------------------------------
//		i=0	j=0			k=0
//		i++	j++			k++
//		i<4	j<=i-1		k<=6-(2*i)
		
//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		
//		while(i<4)
//		{
//			//공백
//			j=0;
//			while(j<=i-1) {  System.out.print(" "); j++; }
//			//별
//			k=0;
//			while(k<=6-(2*i)) {System.out.print("*"); k++;}
//			System.out.println();
//			i++;
//		}
		
		
		
		// 높이 : 3
		// *****
		//  ***
		//   *
		
//		높이 : h
//		i	j(공백)		k(별)
//		0	x			0-(h-1)*2
//		1	0-0			0-(h-1)*2 -2
//		2	0-1			0-(h-1)*2 -4
//		3	0-2			0-0
//		..
//		h-1
//		--------------------------------
//		i=0	j=0			k=0
//		i++	j++			k++
//		i<h	j<=i-1		k<=(h-1)*2-(2*i)
		
		
//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : " );
//		int h = sc.nextInt();
//		while(i<h)
//		{
//			//공백
//			j=0;
//			while(j<=i-1) {  System.out.print(" "); j++; }
//			//별
//			k=0;
//			while(k<=(h-1)*2-(2*i)) {System.out.print("*"); k++;}
//			System.out.println();
//			i++;
//		}
		
		
		
		//   *
		//  ***
		// *****
		//******* 
		// *****
		//  ***
		//   *
		
//		i		j			k
//		0		0-2			0-0
//		1		0-1			0-2
//		2		0-0			0-4
//		3		x			0-6
//		-----------------------------------
//				j=0			k=0
//				j++			k++
//				j<=2-i		k<=2*i
//
//		4		0-0			0-4
//		5		0-1			0-2
//		6		0-2			0-0
//		-----------------------------------
//				j=0			k=0
//				j++			k++
//				j<=i-4		k<=12-2*i
				
				
//		int i=0;	//행
//		int j=0;	//공백
//		int k=0; 	//별
//		
//		while(i<7)
//		{
//			if(i<4)
//			{
//				//공백(점점감소)
//				j=0;
//				while(j<=2-i) {System.out.print(" "); j++;}
//				//별(점점증가)
//				k=0;
//				while(k<=2*i) {System.out.print("*"); k++;}
//			}
//			else
//			{
//				//공백(점점증가)
//				j=0;
//				while(j<=i-4) {System.out.print(" "); j++;}
//				//별(점점감소)
//				k=0;
//				while(k<=6*2-2*i) {System.out.print("*");k++;}
//			}
//			System.out.println();
//			i++;
//		}


		// 높이(홀수값) : 3
		//  *
		// ***
		//  *

//		높이 h -> h/2
//		   *
//		  ***
//		 *****
//		******* 
//		 *****
//		  ***
//		   *
//		i		j(공백)		k(별)
//		0		0-(h/2-1)	0-0
//		1		0-(h/2-1)-1	0-2
//		2		0-(h/2-1)-2	0-4
//		3		x		0-6
//		..
//		h/2
//		--------------------------------------
//				j=0		k=0
//				j++		k++
//				j<=(h/2-1)-i	k<=2*i
//
//		4		0-0		0-4
//		5		0-1		0-2
//		6		0-2		0-0
//		..
//		h-1
//		--------------------------------------
//				j=0		k=0
//				j++		k++
//				j<=i-(h/2+1)	k<=(h-1)*2 -(2*i)
//				
		
		
		
//		int i=0;	//행
//		int j=0;	//공백
//		int k=0; 	//별
//		System.out.print("높이 : ");
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		while(i<h)
//		{
//			if(i<h/2)
//			{
//				//공백(점점감소)
//				j=0;
//				while(j<=(h/2)-1-i) {System.out.print(" "); j++;}
//				//별(점점증가)
//				k=0;
//				while(k<=2*i) {System.out.print("*"); k++;}
//			}
//			else
//			{
//				//공백(점점증가)
//				j=0;
//				while(j<=i-((h/2)+1)) {System.out.print(" "); j++;}
//				//별(점점감소)
//				k=0;
//				while(k<=(h-1)*2 -(2*i)) {System.out.print("*");k++;}
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//******* 
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//******* 		
		
		
		
	}

}
