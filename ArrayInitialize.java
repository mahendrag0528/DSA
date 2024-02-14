import java.lang.*;
import java.util.*;
public class ArrayInitialize{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//enter elements
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
			ar[i]=s.nextInt();
		}
		System.out.println("ArrayElements");
		for(int i=0;i<n;i++){
			System.out.print(ar[i]+" ");
		}
	}
}