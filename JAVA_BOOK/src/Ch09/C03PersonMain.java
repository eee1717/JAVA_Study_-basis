package Ch09;

//주의! 메인클레스가 아닌 다른클래스에는 접근한정자를 붙이지 않는다
class C03Person {
	//속성(=필드,멤버변수)
	String name;
	int age;
	float height;
	double weight;
	
}
//주의! main메서드를 포함한 java파일명과 class 명은 일치해야한다
public class C03PersonMain {

	public static void main(String[] args) {
		C03Person obj = new C03Person();
		obj.name="홍길동";obj.age=35; //OK
		
		C03Person obj1 = new C03Person();
		obj1.name="김민수"; obj1.age=24;
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);

	}

}
