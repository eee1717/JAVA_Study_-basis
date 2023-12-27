package four;

public class purchaseTicket {
	int Mymoney;
	String A;
	String B;
	String C;
	String standing;
	int ticket;
	String seat;


	public purchaseTicket(int mymoney, String a, String b, String c, String standing, int ticket) {
		super();
		Mymoney = mymoney;
		A = a;
		B = b;
		C = c;
		this.standing = standing;
		this.ticket = ticket;
	}


	void Pay(ConcertSeller cs, int money, String seat) {
		try {
			Mymoney -= money;
			this.seat = seat;
			int cnt = cs.Receive(money, seat);
			this.ticket += cnt;
		}catch (NumberFormatException e) {
			
		}catch(Exception e1) {
			
		}
		
	}
	
	
	void ShowInfo() {
		System.out.println("보유 금액 : " + Mymoney);
		System.out.printf("%s석을 구매\n", seat);
		System.out.println("티켓 수 : " + this.ticket);
		
	}

}
