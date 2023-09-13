package ObjectClass;

public class encapsultion {
   // for student
	
		
	
	private int id;
	private String name;
	private String Email;
	private long phone;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email=Email;
	}
	public long getphone() {
		return phone;
	}
	public void setphone(long phone) {
		this.phone=phone;
	}
	public static void main(String[] args) {


		encapsultion s1=new encapsultion();
		s1.setid(123);
		s1.setname("eknath");
		s1.setEmail("eknathchinna524@gmail.com");
		s1.setphone(9901188524l);
	System.out.println(s1.getid());
	System.out.println(s1.getname());
	System.out.println(s1.getEmail());
	System.out.println(s1.getphone());
}
}