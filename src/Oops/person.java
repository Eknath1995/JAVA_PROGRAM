package Oops;

public class person {
	String name;
	long  phone;
	String email;
	String gender;
	int age;

	person(String n,long p, String e, String g, int a){
		name=n;
		phone=p;
		email=e;
		gender=g;
		age=a;

}
	public void displaydetails() {
		System.out.println(name);
		System.out.println(phone);
		System.out.println(email);
		System.out.println(gender);
		System.out.println(age);
	}
}