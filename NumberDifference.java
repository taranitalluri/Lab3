package lab3;
import java.util.*;
public class NumberDifference {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		n=sc.nextInt();
		String str=String.valueOf(n);
		int m=str.length();
		char c[]=new char[m];
		for(int i=0;i<m;i++) {
			c[i]=str.charAt(i);
		}
		if(m==1){
			System.out.println(c[0]);
		}else if(m==2){
			int a = Math.abs((int)(c[0])-(int)(c[1]));
			System.out.println(a);
		}else{
		int b[]=new int[m];
		int[] arr=new int[m];
		for(int i=0;i<m;i++) {
			arr[i]=(int)c[i];	
		}
		for(int i=0;i<m-1;i++) {
			b[i]=Math.abs(arr[i]-arr[i+1]);
			System.out.print(b[i]);
		}
		System.out.println(c[m-1]);
		}
	}
}
