package Ch12;

public class Buyer {
	//속성
	int Mymoney;
	int AppleCnt;
	//생성자
	Buyer(int money, int cnt){
		this.Mymoney=money;
		this.AppleCnt=cnt;
	}
	//기능
	void pay(Seller seller,int money) {	
		Mymoney-=money;	//내보유금액에서 차감
		int cnt=seller.Receive(money); //1 판매자(seller)에게 돈을 전달
		AppleCnt+=cnt;
	}
	
	void ShowInfo() {
		System.out.println("보유금액 : " + Mymoney);
		System.out.println("사과개수 : " + AppleCnt);
	}
	
	
}
