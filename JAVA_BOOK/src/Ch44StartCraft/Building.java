package Ch44StartCraft;

public abstract class Building {
	//속성
	public int Health;
	public int Ammor;
	
	//기능
	public abstract void Construct();
	public abstract void UnderAttack(Unit u);
	
}
