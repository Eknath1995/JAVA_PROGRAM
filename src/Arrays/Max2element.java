package Arrays;

public class Max2element {
public static void main(String[] args) {
	int[] a=RA.Readarray();

	int max=a[0], min=a[0];
	int max2=min;
	for(int i=0; i<a.length; i++) {
		if(a[i]>max)
			max=a[i];
		if(a[i]<min)
			min=a[i];
	}
	if(min==max)
		System.out.println("no second largest number");
	else
	    max2=min;
	
	for(int i=0; i<a.length; i++) {
		if(a[i]>max2 && a[i]<max)
			max2=a[i];
	}
	System.out.println(max2);
}

}
