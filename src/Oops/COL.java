package Oops;

public class COL {
	
		COL(){
			System.out.println("Hai");
		}
		
		COL(int age){
			System.out.println("age : "+age);
		}
		
		COL(String name){
			System.out.println("name : "+ name);
		}
		
		COL(String name, int id){
			System.out.println("name : "+ name +" id :"+ id);
		}
		
		public static void main(String[] args) {
			COL c=new COL();
			COL c1=new COL(26);
			COL c2=new COL("Eknath");
			COL c3=new COL("Eknath", 123345);
			
		
		}
}
