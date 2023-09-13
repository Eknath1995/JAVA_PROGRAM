package Arrays;

import java.util.Scanner;

public class posneg {
public static void main(String[] args) {
	
	int a[]=RA.Readarray();

int pcount=0;
int ncount=0 ;
  for(int i=0; i<a.length; i++) {
	if(a[i]>=0)
		pcount++;
	else
		ncount++;
}
  System.out.println(pcount+" numbers are positive no");
  System.out.println(ncount+" numbers are nagetive no");
}}