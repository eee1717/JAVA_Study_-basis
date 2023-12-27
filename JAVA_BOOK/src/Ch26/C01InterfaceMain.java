package Ch26;

interface Remocon{

	int MAXVOL=100;				//public static final
	int MINVOL=0;				//public static final
	void On();					//추상메서드
	void Off();					//추상메서드
	void SetVol(int num);		//추상메서드
}
class TV implements Remocon{
	int volumn;
	@Override
	public void On() {
		System.out.println("TV 를 켭니다");
	}
	@Override
	public void Off() {
		System.out.println("TV 를 끕니다");	
	}
	@Override
	public void SetVol(int num) {
		if(MAXVOL<num)  
			volumn=MAXVOL;
		 else if(MINVOL<num)  
			volumn=MINVOL;
		 else
			volumn = num;	
	}

}
class Radio implements Remocon{
	int volumn;
	@Override
	public void On() {
		System.out.println("라디오를 켭니다");
	}
	@Override
	public void Off() {
		System.out.println("라디오를 끕니다");
	}
	@Override
	public void SetVol(int num) {
		if(MAXVOL<num)  
			volumn=MAXVOL;
		 else if(MINVOL<num)  
			volumn=MINVOL;
		 else
			volumn = num;	
	}
}

public class C01InterfaceMain {

	public static void 아빠의오른팔(Remocon controller,int num) 	// Remocon controller = new TV()
													 			// Remocon controller = new Radio()
	{
		controller.On();
		controller.SetVol(num);
		controller.Off(); 
		System.out.println();
	}
	public static void main(String[] args) {
		아빠의오른팔(new TV(),101);
		
		아빠의오른팔(new Radio(),10);

	}

}
