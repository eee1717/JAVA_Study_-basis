package Ch22;

public class Employee {
	//속성
	public String name;
	public String addr;
	private String phone;
	
	//생성자
	public Employee(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	//기능
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	void ShowBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("연락처 : " + phone);
	}
	
	
	
}
