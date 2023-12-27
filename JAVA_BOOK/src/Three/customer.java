package Three;

public class customer {
	int cusMoney;
	int menuAmount;
	
	public customer(int cusMoney,int menuAmount) {
		this.cusMoney = cusMoney;
		this.menuAmount=menuAmount;
	}
	
	void order(restaurant rest,int money) {
		int amount = rest.orderReceive(money);
		cusMoney -= money;
		menuAmount += amount;
	}
	
	void showInfo() {
		System.out.println("보유금액 : "+cusMoney);
		System.out.printf("받은메뉴 : 김밥\n메뉴수량 : %d\n",menuAmount);
	}
}
