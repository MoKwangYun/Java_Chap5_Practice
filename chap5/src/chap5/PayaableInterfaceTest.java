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
		System.out.print("곡명 = " + name + ", 연도 = " + year);
	}
}

class Classic extends Music implements Payable{
	String composer;
	 public String play(){
		 return getName()+"을 연주합니다.";
	 }
	 
	 Classic(String name, int year, String composer){
		 super(name, year);
		 this.composer = composer;
	 }
	 
	 public void print() {
			super.print();
			System.out.println(", 작곡가 = " + composer);
		}
	 
}

class Pop extends Music implements Payable{
	String singer;
	 public String play(){
		 return getName()+"을 연주합니다.";
	 }
	 
	 Pop(String name, int year, String singer){
		 super(name, year);
		 this.singer = singer;
	 }
	 
	 public void print() {
			super.print();
			System.out.println(", 작곡가 = " + singer);
		}
	 
}

public class PayaableInterfaceTest {
	public static void main(String[] args) {
		Classic c = new Classic("캐논", 1732, "파헬벨");
		c.print();
		System.out.println(c.play());
		
		Pop p = new Pop("viva", 2015, "콜드플레이");
		p.print();
		System.out.println(p.play());	
		}
}
