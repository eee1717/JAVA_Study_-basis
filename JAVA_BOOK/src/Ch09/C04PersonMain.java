package Ch09;

//주의! 메인클레스가 아닌 다른클래스에는 접근한정자를 붙이지 않는다
class C04Person {
	//속성(=필드,멤버변수)
	String name;
	int age;
	float height;
	double weight;
	
	//기능(=멤버메서드,멤버함수)
	void talk() {
		System.out.println(name + "님이 말합니다");
	}
	void walk() {
		System.out.println(name + "님이 걷습니다");
	}
	
}
//주의! main메서드를 포함한 java파일명과 class 명은 일치해야한다
public class C04PersonMain {

	public static void main(String[] args) {
		C04Person obj = new C04Person();
		obj.name="홍길동";obj.age=35; //OK
		obj.talk();
		obj.walk();
		

	}

}
