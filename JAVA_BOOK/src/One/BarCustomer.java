package One;

public class BarCustomer {
	int Mymoney;
	String Menu;
	String menuname;
	BarCustomer(int mymoney, String menu) {
		this.Mymoney=mymoney;this.Menu=menu;
	}
	

	 void pay(Bar bar , int money) { 
		 Mymoney-=money;	//내돈차감
		 int tmp = bar.Recieve(money);	//바에 돈주고 거스름돈 tmp
		 Mymoney+=tmp; //tmp 를 Mymoney 에 누적
		 
		 
		 }
	 
	 void Showinfo() {
		 System.out.println("손님이 낼 금액 : " + Mymoney);

	 	}
	 }
	
	
	


