package Ch09;

class C06Simple
{
	//속성
	int x;
	int y;
	//기능
	void ShowXY() {
		System.out.println("X = "+x + ",Y = " + y);
	}
}
public class C06SimpleMethod {
	public static void AddmemberXY(C06Simple obj,int x,int y) {
		obj.x = x;
		obj.y = y;
	}
	public static int SubMemberXY(C06Simple obj) {
		//다른 지역으로부터 객체의 위치를 받아 Simple객체 멤버의 차를
		//return 해보세요~
		if(obj.x>obj.y)
		{
			return obj.x-obj.y;
		}else
		{
			return obj.y-obj.x;
		}	
	}
	public static void main(String[] args) {
		C06Simple testobj = new C06Simple();
		AddmemberXY(testobj,10,20);
		testobj.ShowXY();
		
		int result = SubMemberXY(testobj);
		System.out.println("두수의 차 : " + result);
	}

}
