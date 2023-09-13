package practicArray;

public class largerNO {
public static void main(String[] args) {
	int a=71, b=90, c=54, d=9;
	
	if(a>b && a>c && a>d)
		System.out.println(a+" is largest no");
	
	else if(b>c && b>d)
		System.out.println(b+" is largest no");
	
	else if(c>d)
		System.out.println(c+" is largest no");
	
	else
		System.out.println(d+" is largest no");
}
}
