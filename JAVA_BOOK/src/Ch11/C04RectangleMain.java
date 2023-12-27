package Ch11;

class Rectangle
{
	//	- int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보
	int x;
	int y;
	int width;
	int height;
	//	- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
	Rectangle(int x, int y, int width, int height){
		this.x = x; this.y = y ; this.width=width; this.height=height;
		
	}
	//	- int square() : 사각형 넓이 리턴
	int square() {
		return width*height;
	}
//	- void show() : 사각형의 좌표와 넓이를 화면에 출력
	void show() {
		System.out.printf("좌표=(%d,%d), 넓이=%d\n",x,y,width*height);
	}


	//	- boolean contatins(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
	boolean contains(Rectangle r) {
		if(this.x<r.x && this.y<r.y) //이객체의x가 비교객체 x 작고
									 //이객체의y가 비교객체 y 작으냐?
		{
			if((this.x+this.width)>(r.x+r.width) && (this.y+this.height)>(r.y+r.height))
			//이객체의 끝x값이 비교객체의 끝x값보다 크고 이객체의 끝 y값이 비교객체의 끝y값보다 크냐?
			{
				return true;
			}
		}
		return false;
	}
//	- main() 메소드의 코드와 실행 결과는 다음과 같다
}
public class C04RectangleMain {
	 
	public static void main(String[] args) {
		 
		
		
		 Rectangle r = new Rectangle(2, 2, 8, 7);
		 Rectangle s = new Rectangle(5, 5, 6, 6);
		 Rectangle t = new Rectangle(1, 1, 10, 10);
		   
//		   r.show();
//		   System.out.println("s의 면적은 "+s.square());
		   
		   
		   if(t.contains(r)) { 
			   System.out.println("t는 r을 포함합니다.");
		   }
		   
		   if(t.contains(s)) {
			   System.out.println("t는 s를 포함합니다.");
		   }

	}

}
