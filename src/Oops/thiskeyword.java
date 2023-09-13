package Oops;

public class thiskeyword {
	int penprice;
	String penbrand;
	
	thiskeyword(){
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		thiskeyword t=new thiskeyword();
		System.out.println(t);
		t.penprice=150;
		t.penbrand="camlin";
		System.out.println(t.penprice);
		System.out.println(t.penbrand);
	}
	
}
