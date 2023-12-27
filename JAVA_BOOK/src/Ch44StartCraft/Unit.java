package Ch44StartCraft;

public  abstract class Unit {
	//속성
	public String name;
	public int heath;
	
	public abstract void Move();
	public abstract void UnderAttack(Unit c);
	
}
