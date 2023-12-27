package Two;



import java.util.Scanner;

class buyer22 {
	int Mymoney;
	buyer22(int Mymoney){
		this.Mymoney=Mymoney;
	}
	
	void Print() {
		System.out.println("현재 보유한 자금 : "+Mymoney);
		
	}
}
//list -> Store 로 변경
class Store{
		int 허니버터개수;
		int 포켓몬빵개수;
		int 콜라개수;
		public Store(int 허니버터개수, int 포켓몬빵개수, int 콜라개수) {
			super();
			this.허니버터개수 = 허니버터개수;
			this.포켓몬빵개수 = 포켓몬빵개수;
			this.콜라개수 = 콜라개수;
		}


		int change1 (String pick, int money) 
		{
			System.out.print(pick+"을 선택하셨습니다. " +money+"원을 내셨습니다.\n");
		int price = 0;
		switch (pick) {
		case "허니버터감자칩":
			price = 5000;
			break;
		case "포켓몬빵":
			price = 3000;
			break;
		case "콜라":
			price = 1500;
			break;
		default:
			System.out.println(pick+"은 없습니다.");
			break;
		}
		return money-price;
	}
}
public class ConvenienceStore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		list gg = new list();
		buyer22 혜지 = new buyer22(100000);
		혜지.Print();
		
		//메뉴 리스트 올리기
		int num=0;
		int onecnt=0;
		int twocnt=0;
		int threecnt=0;
		while(true)
		{
			System.out.println("--------M E N U--------");
			System.out.println("1 허니버터");
			System.out.println("2 포캣몬빵");
			System.out.println("3 콜라");
			System.out.println("4 주문확인");
			System.out.println("4 결제");
			System.out.println("5 종료");
			System.out.println("--------M E N U--------");
			System.out.println("번호 :");
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.print("개수 :");
				onecnt+=sc.nextInt();
		
				break;
			case 2:
				//price = 3000;
				break;
			case 3:
				//price = 1500;
				break;
			case 4:
				//price = 1500;
				break;
			default:
				//System.out.println(pick+"은 없습니다.");
				break;
			}
		}
		
		
//		System.out.println("무엇을 구매하시겠습니까? >>> 허니버터 감자칩, 포켓몬빵, 콜라");
//		String order = sc.next();
//		System.out.println("얼마를 내시겠습니까? ");
//		int pay =sc.nextInt();
//		int change = gg.change1(order,pay);
//		
//		System.out.println("잔돈은 "+change+"원입니다.");
		
		
		
	}

}
//편의점 에서 물건 구매 프로그램 만들기
//1. 편의점 물건 목록 (자유)
//2. 편의점이 기본으로 가지고 있는 금액은 100000원
//3. 손님이 가지고 있는 금액은 자유
//4. 손님이 돈을 지불하면 편의점 보유금액 +
//5. 손님은 돈을 지불했으니 -
//6. 손님이 물건을 구매했으니 편의점 재고 -
//7. EX
//편의점이 가지고 있는 물건 목록
//자금 100000
//허니버터 감자칩 : 5개
//개당 5000원
//포켓몬빵 : 2개
//개당 3000원
//콜라 : 10개
//개당 1500원
//손님 A 가 가지고있는돈 10000
//콜라 1개 허니버터 감자칩 1개 구매 
//5000 + 1500 = 6500
//10000 - 6500 = 3500
//손님 A 가 다녀간후 편의점 재고 와 자금
//자금 106500원
//허니버터 감자칩 : 4개
//개당 5000원
//포켓몬빵 : 2개
//개당 3000원
//콜라 : 9개
//개당 1500원