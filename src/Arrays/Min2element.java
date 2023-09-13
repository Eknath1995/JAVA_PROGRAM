package Arrays;
public class Min2element {
 public static void main(String[] args) {
	
	 int[] a=RA.Readarray();
	 int max=0, min=0;
		int min2=max;
	for(int i=0; i<a.length; i++) {
		if(a[i]>max)
			max=a[i];
		if(a[i]<min)
			min=a[i];
	}
	if(min==max)
		System.out.println("no seccend min number");
	else
		 min2=max;
	for(int i=0; i<a.length; i++) {
		if(a[i]<min2 && a[i]>min)
			min2=a[i];
	}
	System.out.println(min2);
}
}
