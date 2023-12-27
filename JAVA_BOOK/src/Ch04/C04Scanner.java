package Ch04;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		
		//문제
		//
		//이름을 입력하세요?홍길동				<--이름은 키보드로 입력받습니다
		//홍길동 님의 나이를 입력하세요? 33		<-- 나이는 키보드로 입력받습니다,이름은서식문자로출력
		//홍길동 님의 나이는 33살입니다			<--서식문자로 이름과 나이를 출력합니다
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요?");
//		String name = sc.nextLine();
//		System.out.print(name + " 님의 나이를 입력하세요?");
//		int age = sc.nextInt();
//		System.out.println(name + " 님의 나이는 "+age+"살입니다");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 이름 : " );
		String name = sc.nextLine();
		System.out.print("2. 주민번호 6자리 : " );
		String id = sc.nextLine();
		System.out.print("3. 전화번호 : " );
		String phone = sc.nextLine();
		
		System.out.println("[결과]");
		System.out.println("1. 이름 : " + name );
		System.out.println("2. 주민번호 6자리 : " + id );
		System.out.println("3. 전화번호 : " + phone );
		
	}

}
