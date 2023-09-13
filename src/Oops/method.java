package Oops;

public class method {
	//method overloading
	
	
	  public void display(int a) 
	  
	  { System.out.println(a); }
	  
	  public void display(double a) 
	  
	  { System.out.println(a); }
	  
	  public void display()
	  
	  { System.out.println(" HELLO "); }
	  
	  public void display(int x, String y)
	
	  { System.out.println(x+y); }
	  
	  public void display(String x, int y) 
	  
	  { System.out.println(x + y); }
	  
	  public static void main(String[] args) {
		  method m=new method(); 
		  m.display();
	  m.display(45);
	  m.display(10, " java");
	  m.display(45.6);
	  m.display("eknath ",  1); }
	  
	/*
	 * public void login(String EmailID, int password) {
	 * System.out.println("EmailID : "+EmailID);
	 * System.out.println("Password : "+password); }
	 * 
	 * public void login(int contactNO, int password) {
	 * System.out.println("contact NO :"+contactNO);
	 * System.out.println("password :"+password); }
	 * 
	 * public static void main(String[] args) { method m=new method();
	 * m.login("Eknathchinna524@gmail.com", 123123);
	 * 
	 * System.out.println("-------------------------------");
	 * 
	 * m.login(990118852, 1212312); }
	 * 
	 * 
	 */
	
	
	
	
}














