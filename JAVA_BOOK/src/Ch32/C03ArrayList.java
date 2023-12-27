package Ch32;

import java.util.*;

class Profile{
	String name;
	String addr;
	String phone;
	//모든 필드 받는 생성자
	public Profile(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	//toString 재정의 하세요.모든필드 출력될수있게~
	@Override
	public String toString() {
		return "Profile [name=" + name + ", addr=" + addr + ", phone=" + phone + "]";
	}
	
}
public class C03ArrayList {

	public static void main(String[] args) {
		List<Profile> list = new ArrayList();
		
		//리스트에 Profile객체 추가
		list.add(new Profile("홍길동","대구","010-222-3333"));
		list.add(new Profile("정우균","서울","010-333-4444"));
		list.add(new Profile("이태수","울산","010-555-3333"));
		
		//리스트 전체 조회
		for(Profile tmp : list) {
			//System.out.println(tmp.toString());
			System.out.println(tmp.name);
			System.out.println(tmp.addr);
			System.out.println(tmp.phone);System.out.println();
		}
		
	}

}
