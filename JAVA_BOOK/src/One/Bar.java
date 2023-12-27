package One;

public class Bar {
	int Mymoney;
	String Menu;
	int change=0;
	
	Bar (int mymoney, String menu){
		this.Mymoney=mymoney;this.Menu=menu;
	}
	
	int Recieve(int price) {
		Mymoney+=price;
		change =Mymoney- price;
		return change;
		
	}
	void Showinfo() {
		System.out.println("Bar사장돈 : "+Mymoney);
		System.out.println("거스름돈 : " + change);
		}
	}
	
	

	

