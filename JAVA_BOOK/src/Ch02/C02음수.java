//package Ch02;
//
//
//컴퓨터는 기본적으로 감산처리를 할 수 없다
//해서 감산연산을 대체하는 보수개념을 도입해서
//보수값을 구한다음 덧셈처리를 하게된다
//ex
//7-3 = 4
//7+7 = 14 가되는데 증가하는 한자리는 버림으로써 감삼의 결과를 내어주게된다
//
//컴퓨터는 2진수를 사용하기 때문에
//2의보수값으로 치환을해서 더해주게된다
//
// 00000101 = 5
//+11111011 = -5(2의보수)
//---------------
//100000000 = 0(증가하는 앞자리수는 버림);
//
//그러나 2의보수를 구하기가 상대적으로 어렵기때문에 먼저 1의보수를 구한다음
//마지막 비트에 1을 더함으로써 2의보수값을 만든다
//
// 00000101 = 5
// 11111010 =-4 (1의보수)
//+11111011 =-5 (2의보수)
//---------------
//100000000 = 0(증가하는 앞자리수는 버림);
//
//음수값을 저장할 수 있는 공간에 11111011(-5)가 저장되면 제일 왼쪽비트(1)가되어
//음수값으로 인식한다(만약 왼쪽비트가 0이면 양수로 해석)
//
//
//[참고]
//00000000 = 0
//00000001 = 1
//00000010 = 2
//00000011 = 3
//..
//01111111 = 127
//10000000 = -128
//10000001 = -128+1 = -127
//10000010 = -128+2 = -126
//10000011 = -128+3 = -125
//11111111 = -128+127 = -1
//
////10진수 -> 2진수
//
//10진수			2진수
//10		-> 00001010
//-10		-> 11110110
//111		-> 01101111
//-111		-> 10010001
//96		-> 01100000
//-96		-> 10100000
//48		-> 00110000
//-48		-> 11010000
// 
////2진수		-> 10진수
//10101100	-> -128+32+8+4
//10111111	-> -128+32+16+8+4+2+1
//10011010	-> -128+16+8+2
//10001111	-> -128+8+4+2+1
//11000101	-> -128+64+4+1
//
//
//
//
//
//
//
//
//
//public class C02음수 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
