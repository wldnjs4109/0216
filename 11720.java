import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int[] num = new int[N];
		int sum=0;
 
		for(int i=0;i<N;i++) {
			num[i]=S.charAt(i)-'0';
			sum+=num[i];
		}
		System.out.println(sum);
	}
}
