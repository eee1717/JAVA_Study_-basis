package Three;

public class movie {
	String name;
	int ticket;
	int price;
	int money;
	
	public movie(String name, int ticket, int price, int money) {
		this.name = name;
		this.ticket = ticket;
		this.price = price;
		this.money = money;
	}
	
	int receive(int money) {
		this.money += money;
		int cnt = money/price;
		ticket -= cnt;
		return cnt;
	}
	
	void showInfo() {
		System.out.println("영화제목 : "+name);
		System.out.println("표 가격 : "+price);
		System.out.println("남은수량 : "+ticket);
	}
}
