package One;

import java.util.Scanner;

public class BarMain {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------- B A R -------");
		System.out.println("1 맥주");
		System.out.println("2 소주");
		System.out.println("3 양주");
		System.out.println("4 소맥");
		System.out.println("------- B A R -------");
		System.out.print("주문번호 입력 : ");
		int menunum=sc.nextInt();
		int price = 0;	
		String menuname=null;
		switch(menunum) {
		case 1 : price=3000; System.out.println(price);menuname="맥주";break;
		case 2 : price=5000;System.out.println(price);menuname="소주";break;
		case 3 : price=10000;System.out.println(price);menuname="양주";break;
		default : System.out.println("없는 메뉴를 고르셨습니다.");
		}
		int StartMoney=2000;
		
		Bar b1 = new Bar(StartMoney ,menuname);
		BarCustomer 강현선 = new BarCustomer(price, menuname);
				
		강현선.pay(b1,price);
		
		
		
		b1.Showinfo();
		강현선.Showinfo();
		
		
		
		
	}
}
