package Ch19;

class Client{
	String name;
	String phone;
	Client(String name,String phone){
		this.name = name;
		this.phone = phone;
	}
}
class Restorant{
	String Storename;
	int roomcnt;					//지점 room개수	
	static int totalroomcnt;		//전체 room개수
	Client list[];					//예약 손님 정보 저장용 배열참조변수
	int idx;						//list배열에 저장될 객체 위치idx
	
	Restorant(String name,int roomcnt){
		Storename=name;				//지정명 저장
		this.roomcnt=roomcnt;		//방개수 저장
		totalroomcnt+=roomcnt;		//전체 방개수 누적
		list=new Client[roomcnt];	//예약손님정보 저장용 배열
		idx=0;
	}
	
	void SetReserve(Client client) {
		if(roomcnt!=0) {
			roomcnt--;//roomcnt--(0인경우..)
			totalroomcnt--;//totalroomcnt--	
			list[idx]=client;//배열참조변수에 client 객체 연결
			idx++;		//다음위치로 이동
		}
		else //잔여room 수 부족 
		{
			System.out.println("예약이 꽉차서 예약이 불가능합니다..");
		}
		
	}
	void ShowClientInfo() {
		System.out.println("===============================");
		System.out.println("지점명 : " + Storename);
		for(int i=0;i<idx;i++) {
			System.out.printf("%d . %s : %s\n",(i+1),list[i].name,list[i].phone);
		}
		System.out.println("===============================");
	}
	
	void Showinfo() {
		System.out.println("===============================");
		System.out.println("지점명 : " + Storename);
		System.out.println("지점 잔여 Room : " + roomcnt);
		System.out.println("전체 잔여 Room : " + totalroomcnt);
		System.out.println("===============================");
	}
	
}
public class C04StaticMain {

	public static void main(String[] args) {
		Restorant 서가앤쿡반월당 = new Restorant("반월당점",10);	//지점명,roomcnt
		서가앤쿡반월당.SetReserve(new Client("홍길동1","010-222-3333"));
		서가앤쿡반월당.SetReserve(new Client("홍길동2","010-222-3333"));
		서가앤쿡반월당.SetReserve(new Client("홍길동3","010-222-3333"));
		
		Restorant 서가앤쿡감삼점 = new Restorant("감삼점",5); 	//지점명,roomcnt
		서가앤쿡감삼점.SetReserve(new Client("남길동1","010-222-3333"));
		서가앤쿡감삼점.SetReserve(new Client("남길동2","010-222-3333"));
		서가앤쿡감삼점.SetReserve(new Client("남길동3","010-222-3333"));
		서가앤쿡감삼점.SetReserve(new Client("남길동4","010-222-3333"));
		서가앤쿡반월당.Showinfo();서가앤쿡반월당.ShowClientInfo();
		서가앤쿡감삼점.Showinfo();서가앤쿡감삼점.ShowClientInfo();
		//서가앤쿡반월당.Showinfo();
		//서가앤쿡감삼점.Showinfo();
			
	}

}
