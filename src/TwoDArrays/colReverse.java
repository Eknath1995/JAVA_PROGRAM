package TwoDArrays;

public class colReverse {
public static void main(String[] arigs) {
	int a[][]=read.ReadMatrix();
	ColReverse(a);
	read.DisplayMatrix(a);
			
}
	public static void ColReverse(int a[][]) {
		for(int i=0; i<a[0].length; i++) {
			for(int j=0; j<a.length/2; j++) {
				int temp=a[j][i];
				a[j][i]=a[a.length-1-j][i];
				a[a.length-1-j][i]=temp;
			}}
		}}
	