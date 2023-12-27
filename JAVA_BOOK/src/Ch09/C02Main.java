package Ch09;

public class C02Main {

	public static void main(String[] args) {
		
		C02Car hong = new C02Car();
		hong.owner = "홍길동";
		hong.speed =  0;
		hong.fuel = 100;
		System.out.printf("%s %d %d\n", hong.owner,hong.speed,hong.fuel);
		
	}

}
