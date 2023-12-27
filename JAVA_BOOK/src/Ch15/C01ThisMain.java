package Ch15;

class C01Simple
{
	C01Simple(){
		System.out.println("위치 : " + this);
	}
	
}
public class C01ThisMain {

	public static void main(String[] args) {
		C01Simple ob1 = new C01Simple();
		System.out.println("ob1 : " + ob1);
		C01Simple ob2 = new C01Simple();
		C01Simple ob3 = new C01Simple();
		

	}

}
