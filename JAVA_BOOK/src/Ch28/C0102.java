package Ch28;

class TV{
	   private int size;
	   public TV(int size) { this.size = size; }
	   protected int getSize() { return size; }
	}

class ColorTV extends TV{
	private int color;
	public ColorTV(int size,int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.printf("%d인치 %d컬러\n",getSize(),color);
	}
}

public class C0102 {

	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();

	}

}
