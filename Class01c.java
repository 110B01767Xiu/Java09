class CRectangle {
	int width;
	int height;
	
	public CRectangle(int w, int h) {
		width = w;
		height = h;
    }
    public CRectangle() {
	    this(10, 8);
    }
    public void show() {
	    System.out.println("width = " + width);
	    System.out.println("height = " + height);
    }
}

public class Main {
	public static void main(String args[]) {
		CRectangle c = new CRectangle();
		c.show();
    }
}
