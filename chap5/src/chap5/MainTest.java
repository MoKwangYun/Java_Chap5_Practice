package chap5;

class MyPoint{
	private int x,y;
	protected MyPoint() {
		this.x = 100;
		this.y = 200;
	}
	protected void disp() {
		System.out.println("��(x, y) = ("+x+","+y+")");
	}
}

class Circlee extends MyPoint{
	int r;
	Circlee(){
		r = 50;
	}
	
	public void disp() {
		super.disp();
		System.out.println("������ r = "+ r);
	}
}

class Rectt extends MyPoint{
	int w,h;
	Rectt(){
		w =200;
		h =300;
	}
	public void disp() {
		super.disp();
		System.out.println("�� = " + w + ", ���� = "+h);
	}
}
public class MainTest {
	public static void main(String[] args) {
		Circlee c = new Circlee();
		c.disp();
		Rectt r = new Rectt();
		r.disp();
	}
}
