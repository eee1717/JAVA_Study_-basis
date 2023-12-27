package Three;

public class movieMain {
	public static void main(String[] args) {
		movie 아이언맨 = new movie("아이언맨",300,11000,0);
		movie 토르 = new movie("토르",200,9000,0);
		movie 캡틴아메리카 = new movie("캡틴아메리카",150,8000,0);
		
		guest guest1 = new guest(50000,0);
		guest guest2 = new guest(40000,0);
		guest guest3 = new guest(45000,0);
		guest guest4 = new guest(50000,0);
		guest guest5 = new guest(20000,0);
		guest guest6 = new guest(15000,0);
		guest guest7 = new guest(25000,0);
		guest guest8 = new guest(80000,0);
		guest guest9 = new guest(100000,0);
		guest guest10 = new guest(75000,0);
		
		guest1.ticketing(아이언맨, 22000);
		guest1.showInfo(아이언맨);
		
	}
}
