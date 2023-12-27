package Ch21;

public class Main01 {

	public static void main(String[] args) {
			NoteBook MyLgGram = new NoteBook("1-2-3-4","I7","16G","1T",100);
			// SN,CPUSpec,RAMSpec,DISKSpec,battery 을 인자로 받습니다
			MyLgGram.PowerON();
			MyLgGram.Move();
			MyLgGram.PowerOFF();
			System.err.println("TEST");

	}

}
