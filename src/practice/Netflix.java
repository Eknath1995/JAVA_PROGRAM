package practice;

public class Netflix {
	 void login(String emailID, int password) {
		 System.out.println("E-mail : "+ emailID);
		 System.out.println("password : "+ password);
	 }
	 
	 void login(long contactNO, int password) {
		 System.out.println("contact NO : "+ contactNO);
		 System.out.println("passwrod : "+password);
	 }
	 
	public static void main(String[] args) {
		Netflix n=new Netflix();
		
		n.login("ek@gmail.com", 12341);
		n.login(9901188524l, 98767890);
	}
}
