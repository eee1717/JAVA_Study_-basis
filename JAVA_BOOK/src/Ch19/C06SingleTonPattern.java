package Ch19;

class Calculator {
	
	int x;
	int y;
	
	//싱글톤 패턴 적용할 것
	private static Calculator instance=new Calculator();
	private Calculator() {}
	public static Calculator getInstance() {
		if(instance==null) {
			instance=new Calculator();
		}
		return instance;
	}
	
	//void Sum()  //x+y를 화면에 print
	//void Sub()  //x-y를 화면에 print
	//void Mul()  //x*y를 화면에 print
	//void Div()  //x/y를 화면에 print
	void Sum() {
		System.out.println("합 : " + (x+y));
	}
	void Div() {
		System.out.println("나누기 : " + ((double)x/y));
	}
}

public class C06SingleTonPattern {
	public static void main(String[] args) {
		Calculator cal1 = Calculator.getInstance();
		Calculator cal2 = Calculator.getInstance();
		
		cal1.x=10;
		cal2.y=20;
		cal1.Sum();
		cal2.Div();
	
		
		
		
		
		

	}

}
