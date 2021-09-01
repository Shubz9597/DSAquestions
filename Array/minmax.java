import java.util.*;
import java.io.*;
import java.lang.*;

public class minmax {
	public static void main(String args[])throws Exception{
		int n; String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length");
		n = Integer.parseInt(br.readLine());
		System.out.println("Enter the Array elements in one line");
		s = br.readLine();
		int[] a = new int[n];
		int min, max;
		String[] strs = s.trim().split("\\s+");

		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(strs[i]);
		}
		min = a[0]; max = a[0];
		for(int i = 1; i < n; i++) {
			if(a[i] > max) 
				max = a[i];
			if(a[i] < min)
				min = a[i];
		}

		System.out.println("Min: "+min+" Max: "+max);
	}
}		