package Ch23;

class Super1
{
	int x;
	void Func() {
		System.out.println("TEST");
	}
}
class Sub1 extends Super1{
	int y;	//추가
	
	//오버라이딩
	void Func() {
		System.out.println("Sub Class Test");
	}
	void ShowXY()	//추가 
	{
		System.out.printf("x = %d , y = %d\n",x,y);
	}
}
public class C04UpcastingOverridding {
	public static void main(String[] args) {
		Super1	ob1	= new Super1();	//NoCasting
		Sub1	ob2	= new Sub1();	//NoCasting
		Sub1	ob3	= new Sub1();	//NoCasting
		//업캐스팅
		Super1	ob4	= new Sub1();
		//ob4.y=10; 
		//ob4.ShowXY();
		ob4.Func();
		
		

	}

}
