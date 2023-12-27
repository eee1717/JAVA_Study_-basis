package Ch21;

public class NoteBook extends Computer{
	//속성
	public int battery;
	
	NoteBook(String SN,String CPU,String RAM, String DISK,int battery){
		super(SN,CPU,RAM,DISK);	//상위클래스(Computer) 생성자 호출
		this.battery=battery;
		System.out.println("Notebook 생성자 호출!");
	}
	
	//기능
	public void Move() {
		System.out.println(SN+" 노트북이 이동됩니다");
	}
	
}
