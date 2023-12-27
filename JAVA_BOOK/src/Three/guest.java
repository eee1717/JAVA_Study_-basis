package Three;

public class guest {
	int money;
	int ticket;
	
	guest(int money,int ticket){
		this.money=money;
		this.ticket=ticket;
	}
	
	void ticketing(movie name,int money) {
		this.money -= money;
		int cnt = name.receive(money);
		ticket += cnt;
	}
	
	void showInfo(movie ticket) {
		System.out.println("남은 돈 : "+money);
		System.out.println("제목 : "+ticket.name+"\n티켓수량 : "+this.ticket+"\n가격 : "+ticket.price*this.ticket+"\n");
	}
}
