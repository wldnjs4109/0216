import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		int R;
		String S;
		char P;
 
 
		for(int i=0;i<T;i++) {
			R=sc.nextInt();
			S=sc.next();
			char[] L=new char[S.length()];
			for(int j=0;j<S.length();j++) {
				L[j]=S.charAt(j);
				for(int k=0;k<R;k++) {
					P=L[j]; 
					System.out.print(P);	
				}
 
			}
			System.out.println();
		}
 
	}
}
