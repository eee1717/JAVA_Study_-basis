package Ch40Thread;

public class C01main {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			System.out.println("TASK1");
			try {Thread.sleep(500);}catch(Exception e){}
		}
		for(int i=0;i<5;i++) {
			System.out.println("TASK2");
			try {Thread.sleep(500);}catch(Exception e){}
		}
		

	}

}
