package Ch23;


class C02Super{
	int x;
}
class C02Sub extends C02Super{
	int y;
}
public class C02UpDownCasting 
{
	public static void main(String[] args) {
		//No Casting :클래스 자료형변환 
		C02Super ob1 = new C02Super();	//No casting
		ob1.x=10;
		C02Sub ob2 = new C02Sub();
		ob2.x=10;ob2.y=20;
		
		//UpCasting : 상위클래스 참조변수=하위클래스 객체 
		//자료형이 자동으로 형변환되는 과정
		//상위클래스형의 멤버까지만 사용할 수 있다
		C02Super ob3 = new C02Sub();
		ob3.x=10;
		//ob3.y=20;	//멤버는 존재하나 접근할 수 없다..
		
		
		//DownCasting : 하위클래스 참조변수=상위클래스
		//UPcasting 상태에서 확장(추가)된 멤버에 접근하기 위해 사용
		C02Sub down = (C02Sub)ob3;
		down.x=10;
		down.y=20;
		
		
		
		
		
		
		
		

	}

}
