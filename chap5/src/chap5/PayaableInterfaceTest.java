package chap5;

interface Payable{
	String play();
}

abstract class Music implements Payable{
	String name;
	int year;
	Music(String name, int year){
		this.name = name;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
	public void print() {
		System.out.print("��� = " + name + ", ���� = " + year);
	}
}

class Classic extends Music implements Payable{
	String composer;
	 public String play(){
		 return getName()+"�� �����մϴ�.";
	 }
	 
	 Classic(String name, int year, String composer){
		 super(name, year);
		 this.composer = composer;
	 }
	 
	 public void print() {
			super.print();
			System.out.println(", �۰ = " + composer);
		}
	 
}

class Pop extends Music implements Payable{
	String singer;
	 public String play(){
		 return getName()+"�� �����մϴ�.";
	 }
	 
	 Pop(String name, int year, String singer){
		 super(name, year);
		 this.singer = singer;
	 }
	 
	 public void print() {
			super.print();
			System.out.println(", �۰ = " + singer);
		}
	 
}

public class PayaableInterfaceTest {
	public static void main(String[] args) {
		Classic c = new Classic("ĳ��", 1732, "���ﺧ");
		c.print();
		System.out.println(c.play());
		
		Pop p = new Pop("viva", 2015, "�ݵ��÷���");
		p.print();
		System.out.println(p.play());	
		}
}