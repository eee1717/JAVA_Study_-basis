package Ch18;

import java.util.Scanner;

class Book
{
	String BookCode;
	String Bookname;
	String Publisher;
	String Amount;
	public Book(String bookCode, String bookname, String publisher, String amount) {
		BookCode = bookCode;
		Bookname = bookname;
		Publisher = publisher;
		Amount = amount;
	}
	
}
public class C02ClassArrayMain {

	public static void main(String[] args) {
		//배열만들것
		Book list[] = new Book[5];
		int idx=0; //현재 저장된 책 idx 저장  
		Scanner sc = new Scanner(System.in);
		int num=0;
		while(true) {
			System.out.println("---------BOOKStore---------");
			System.out.println("1.도서 등록");
			System.out.println("2.도서 검색");
			System.out.println("3.전체 도서 확인");
			System.out.println("4.종료");
			System.out.println("---------BOOKStore---------");
			System.out.print("번호 : ");
			num=sc.nextInt();
			switch(num)
			{
			case 1:
				if(idx<list.length)	//idx가 배열의 마지막인덱스번호 보다작으면
				{
					System.out.print("코드|제목|출판사|수량> ");
					String code=sc.next();
					String name=sc.next();
					String publisher=sc.next();
					String amount=sc.next();
					list[idx]=new Book(code,name,publisher,amount);
					idx++;
				}else {
					System.out.println("더 이상 등록할수가 없습니다");
				}
				//도서등록
				break;
			case 2:
				//도서검색-도서명을 받아서 검색 할 것( String의 equals 함수 이용)
				
					System.out.print("도서명 : ");
					String keyword=sc.next();
					
					for(int i=0;i<idx;i++) {
						if(list[i].Bookname.contains(keyword)) {
							System.out.printf("%s\t%s\t%s\t%s\n", list[i].BookCode,list[i].Bookname,list[i].Publisher,list[i].Amount);
						}
					}
				break;
			case 3:
				//전체도서 출력
				for(int i=0;i<idx;i++) {
					System.out.printf("%s\t%s\t%s\t%s\n", list[i].BookCode,list[i].Bookname,list[i].Publisher,list[i].Amount);
				}
				break;
			case 4:
				System.exit(-1);
				break;
			}
			
		}

	}

}
