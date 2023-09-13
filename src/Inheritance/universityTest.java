package Inheritance;

public class universityTest {
		
	public static void main(String[] args) {
		
		dept d=new dept();
		
		System.out.println(d.universityname);
		System.out.println(d.collegename);
		System.out.println(d.deptname);
		
		d.branch();
		d.conductexam();
		d.provoideplacement();
	}

}
