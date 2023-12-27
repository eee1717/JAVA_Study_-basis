//package Ch31;
//
//
//class caramel{
//	public String toString() {
//		return "캬라멜";
//	}
//}
//class onion{
//	public String toString() {
//		return "어니언";
//	}
//}
//class PopCorn <T>{
//	private T meterial;
//
//	public T getMeterial() {
//		return meterial;
//	}
//
//	public void setMeterial(T meterial) {
//		this.meterial = meterial;
//	}
//	public void Fry() {
//		System.out.println(meterial.toString() + " 맛 팝콘을 만듭니다");
//		//->"---" 맛의 캬라멜팝콘을 만듭니다 가 출력!!(meterial의 toString()을 쓸것)
//	}
//	//-meterial : Generic <T>   //->Getter and Setter 함수도 추가합니다
//	//+ Fry() :void				//->"---" 맛의 캬라멜팝콘을 만듭니다 가 출력!!(meterial의 toString()을 쓸것)
//		
//}
//
//
//public class C03GenericMain {
//	public static void main(String[] args) {
//		PopCorn<caramel> corn1 = new PopCorn<caramel>();
//		corn1.setMeterial(new caramel());
//		corn1.Fry();
//		
//		PopCorn<onion> corn2 = new PopCorn<onion>();
//		corn2.setMeterial(new onion());
//		corn2.Fry();
//
//	}
//
//}
