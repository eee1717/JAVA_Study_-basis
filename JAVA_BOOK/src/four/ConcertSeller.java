package four;

public class ConcertSeller {
	int Mymoney;
	int A;
	int B;
	int C;
	int standing;
	int count;
	public ConcertSeller(int mymoney, int a, int b, int c, int standing, int count) {
		Mymoney = mymoney;
		A = a;
		B = b;
		C = c;
		this.standing = standing;
		this.count = count;
	}
	
	
	int Receive(int money, String seat) {
		Mymoney += money;
		System.out.println(money);
		System.out.println(seat);
		int price=0;
		if(seat.equals("A")) {
			price=50000;
		}else if(seat.equals("B")) {
			
		}
		int cnt = money/price;
		System.out.println(cnt);
		count -= cnt;
		System.out.println(count);
		return cnt;
		
	}
	
	
	
	
}
