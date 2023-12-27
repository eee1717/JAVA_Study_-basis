package Ch16;

public class C01StringMain {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println("str1==str2 ? " + (str1 == str2));
		System.out.println("str3==str4 ? " + (str3 == str4));
		System.out.println("str1==str3 ? " + (str1 == str3));
		System.out.println("str1==str4 ? " + (str1 == str4));
		System.out.println("str2==str4 ? " + (str2 == str4));
		System.out.println();
		//문자열 자체 비교시 기준객체.equals(비교 대상객체)
		System.out.println("str1==str2 ? " + (str1.equals(str2)));
		System.out.println("str3==str4 ? " + (str3.equals(str4)));
		System.out.println("str1==str3 ? " + (str1.equals(str3)));

		
		
		
		
	}
}
