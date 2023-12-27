package Ch27;




class Simple{
	int x;
	int y;
	int z;
	public Simple(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Simple [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}
public class TESTMAIN {
	public static void main(String[] args) {
		Simple tmp = new Simple(10,20,30);
		System.out.println(tmp.toString());

	}

}
