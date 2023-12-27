package Ch19;


class Store{
	//속성
	static double sales;
	String storeName;
	int colaPrice;
	int coffeePrice;
	//생성자
	Store(String name,int colaprice,int coffeeprice){
		this.storeName=name;
		this.colaPrice = colaprice;
		this.coffeePrice = coffeeprice;
	}
	//기능
	void ShowInfo() {
		System.out.println("------- "+storeName+" -------");
		System.out.println("커피 가격 : " + (coffeePrice*(1-sales)));
		System.out.println("콜라 가격 : " + (colaPrice*(1-sales)));
		
	}
}
public class C03StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 편의점 공통 할인율 (할인율-static )
		Store.sales=0.20;
		
		Store GS감삼점 = new Store("GS감삼",1000,1000);
		Store GS반월당점 = new Store("GS반월당",2000,2000);
		Store GS동성로점 = new Store("GS동성로",1500,1500);
		GS감삼점.ShowInfo();
		GS반월당점.ShowInfo();
		GS동성로점.ShowInfo();
		
		
		
		 
	}

}
