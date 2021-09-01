//This is the first program for dsa 450
//This program prints the reverse of an Array

import java.util.*;
import java.io.*;
import java.lang.*;

public class reverseArray {
	public static void main(String args[])throws Exception{
		int n; String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length");
		n = Integer.parseInt(br.readLine());
		System.out.println("Enter the Array elements in one line");
		s = br.readLine();
		int[] a = new int[n];
		int start = 0, end = n-1, t;
		String[] strs = s.trim().split("\\s+");

		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(strs[i]);
		}

		System.out.print("Original Array: [");
		for(int i = 0; i < n; i++) {
			if(i == n-1)
				System.out.print(a[i]);
			else
				System.out.print(a[i] + ", ");
		}
		System.out.println("]");

		//Now the reverse array logic

		System.out.print("Reversed Array: [");
		for(;end > start && end != start; start++, end--) {
			t = a[start];
			a[start] = a[end];
			a[end] = t;
		}

		for(int i = 0; i < n; i++) {
			if(i == n-1)
				System.out.print(a[i]);
			else
				System.out.print(a[i] + ", ");
		}
		System.out.println("]");
	}
}