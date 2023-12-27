package Ch21;

public class Computer {
	//속성
	public String SN;
	public String CPUSpec;
	public String RAMSpec;
	public String DISKSpec;
	//생성자
	public Computer(String sN, String cPUSpec, String rAMSpec, String dISKSpec) {
		SN = sN;
		CPUSpec = cPUSpec;
		RAMSpec = rAMSpec;
		DISKSpec = dISKSpec;
		System.out.println("Computer 생성자 호출!");
	}
	
	//기능
	public void PowerON() {
		System.out.println(SN+" 전원을 켭니다");
	}
	
	public void PowerOFF() {
		System.out.println(SN+" 전원을 끕니다");
	}
	public void ShowInfo() {
		System.out.printf("%s\t%s\t,s\t%s\n",SN,CPUSpec,RAMSpec,DISKSpec);
	}
}
