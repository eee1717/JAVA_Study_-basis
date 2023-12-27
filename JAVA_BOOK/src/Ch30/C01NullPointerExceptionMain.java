package Ch30;

public class C01NullPointerExceptionMain {

	public static void main(String[] args) {
		
		try {
		String tmp=null;
		tmp.charAt(10);	//예외발생!NullPointerException..
		}catch(NullPointerException e) {
			//System.out.println("예외처리!!");
			System.out.println(e.getCause());
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
		
		System.out.println("실행되어야 하는코드1");
		System.out.println("실행되어야 하는코드2");
		

	}

}
