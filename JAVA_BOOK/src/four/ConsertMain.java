package four;

public class ConsertMain {
	public static void main(String[] args) {
		ConcertSeller con = new ConcertSeller(100000, 50000, 40000, 30000, 10000, 100);
		
		purchaseTicket s = new purchaseTicket(300000, "50000", "40000", "30000", "10000", 0);
		
		
		int num = con.Receive(100000, 50000);

		
		
		
		s.Pay(con, 100000, "A");
		s.ShowInfo();
	}
	
}
