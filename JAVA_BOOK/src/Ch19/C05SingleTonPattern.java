package Ch19;


class C05Company{
	int x;
	int y;
	int z;
	//싱글톤 패턴 코드 시작
	private static C05Company instance = new C05Company();
	private C05Company() {}
	public static C05Company getInstance() {
		if(instance==null)
			instance=new C05Company();
		return instance;
	}
	//싱글톤 패턴 코드 끝
	
	
}

public class C05SingleTonPattern {

	public static void main(String[] args) {
		C05Company com1 = C05Company.getInstance();
		C05Company com2 = C05Company.getInstance();
		System.out.println(com1 == com2);
		com1.x=10;com1.y=20;com1.z=30;
		System.out.println(com2.x + ","+ com2.y + ","+com2.z);
		

	}

}
