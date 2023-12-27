package Ch15;

class C04Person{
	//멤버변수
	String name;
	String addr;
	int age;
	//생성자메서드
	C04Person(){
		this("없음","없음",0);
	}
	C04Person(String n, String a){
		this(n,a,0);
	}
	C04Person(String name,String addr, int age){
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	
//	1) Person()
//	-> this("없음","없음",0) 사용해서 3) 생성자 호출  
//	2) Person(String n,String a)
//	-> this(n,a,0)으로 3) 생성자 호출
//	3) Person(String n,String a, int n)
//	-> 각각 name,addr,age 에 값 저장
	
}

public class C04Main {

	public static void main(String[] args) {
		C04Person kim = new C04Person();
		C04Person Lee = new C04Person("이지성","서울특별시");
		C04Person Son = new C04Person("손민수","대구광역시",20);

	}

}
