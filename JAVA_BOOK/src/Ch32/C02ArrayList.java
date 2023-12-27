package Ch32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02ArrayList {

	public static void main(String[] args) {
		 
		int num = 0;
		List<String> list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=======M E N U =======");
			System.out.println("1 이름 등록");
			System.out.println("2 이름 조회");
			System.out.println("3 이름 삭제");
			System.out.println("4 전체 조회");
			System.out.println("5 종료");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();
			switch(num)
			{
			case 1:
				//이름 입력받아서 ArrayList 에  add
				System.out.println("이름 : ");
				String tmp1= sc.next();
				if(list.add(tmp1)) {
					System.out.println("저장 성공!");
				}				
				break;
			case 2:
				//이름 입력받아서 조회(있다,없다로 조회) 이름이 있으면 "있다" 없으면 "없다"..
				System.out.println("이름 : ");
				String tmp2 = sc.next();
				if(list.contains(tmp2)) {
					System.out.println(tmp2 +" 는 저장되어 있는 이름입니다");
				}else {
					System.out.println(tmp2+ " 는 저장되어 있지 않습니다");
				}
				break;
			case 3:
				//이름 입력받아서 삭제.. 삭제되었으면 "삭제완료" 삭제할 이름 없으면 "삭제실패" 
				System.out.println("이름 : ");
				String tmp3 = sc.next();
				list.remove(tmp3);
				break;
			case 4:
				for(String name : list) {
					System.out.println(name+" ");
				}
				break;
			case 5:
				System.exit(-1);
			default:
				System.out.println("다시 입력...");
			}
			
			
			
			
		}

	}

}
