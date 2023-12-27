package Three;

public class restaurant {
	int price;
	int restMoney;
	int menuAmount;
	
	public restaurant(int restMoney, int menuAmount,int price) {
		this.price=price;
		this.restMoney = restMoney;
		this.menuAmount=menuAmount;
	}
	
	int orderReceive(int money) {
		restMoney += money;
		int amount = money/price;
		menuAmount -= amount;
		return amount;
	}
	
	void showInfo() {
		System.out.println("보유금액 : "+restMoney);
		System.out.printf("메뉴 : 김밥\n메뉴재고 : %d\n메뉴가격 : %d\n",menuAmount,price);
	}
	
}
