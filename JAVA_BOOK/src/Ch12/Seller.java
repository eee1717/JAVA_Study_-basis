package Ch12;

public class Seller {
	//속성
	int Mymoney;
	int AppleCnt;
	int price;
	
	//생성자
	public Seller(int mymoney, int appleCnt,int price) {
		Mymoney = mymoney;
		AppleCnt = appleCnt;
		this.price=price;
	}

	//기능
	//Receive();
	//돈을받아 -> 내보유금액에저장->사과개수계산->사과개수차감->사과개수 리턴
	int Receive(int money) {
		Mymoney+=money;			//내보유금액에저장
		int cnt= money/price;	//사과개수계산
		AppleCnt-=cnt;			//사과개수차감
		return cnt;				//사과개수 리턴
	}
	
	
	void ShowInfo() {
		System.out.println("보유금액 : " + Mymoney);
		System.out.println("사과개수 : " + AppleCnt);
	}
}
