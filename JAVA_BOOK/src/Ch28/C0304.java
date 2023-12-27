package Ch28;

import java.util.Scanner;
abstract class Converter {
   Scanner scanner = new Scanner(System.in);
   abstract protected double convert(double src); // 추상 메소드
   abstract protected String getSrcString(); // 추상 메소드
   abstract protected String getDestString(); // 추상 메소드
   protected double ratio; // 비율
   public void run() {   
      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
      System.out.print(getSrcString()+"을 입력하세요>> ");
      double val = scanner.nextDouble();
      double res = convert(val);
      System.out.println("변환 결과: "+res+getDestString()+"입니다");
   }
   public void close() {
	   scanner.close();
   }
}
class Won2Dollar extends Converter{
	Won2Dollar(int ratio){
		this.ratio = ratio;
	}
	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	@Override
	protected String getSrcString() {
		return "원화";
	}
	@Override
	protected String getDestString() {
	
		return "달러";
	}	
}

class Km2Mile extends Converter{

	Km2Mile(double ratio){
		this.ratio = ratio;
	}
	@Override
	protected double convert(double src) {	 
		return src/ratio;
	}
	@Override
	protected String getSrcString() {
		return "Km";
	}
	@Override
	protected String getDestString() {
		return "Mile";
	}
	
}

public class C0304 {

	public static void main(String[] args) {
		//03
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
		
		//04
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run();
		   

	}

}
