package Three;

public class main0 {
	public static void main(String[] args) {
		restaurant kimbabHeaven = new restaurant(1000000,100,3500);
		customer 이동관 = new customer(20000,0);
		
		kimbabHeaven.showInfo();
		System.out.println();

		이동관.order(kimbabHeaven, 10500);
		
		이동관.showInfo();
		System.out.println();
		kimbabHeaven.showInfo();
		System.out.println();
		
		이동관.order(kimbabHeaven, 7000);
		
		이동관.showInfo();
		System.out.println();
		kimbabHeaven.showInfo();
		
		
	}
}
