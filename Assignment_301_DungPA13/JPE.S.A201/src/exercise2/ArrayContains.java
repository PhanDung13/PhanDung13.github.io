package exercise2;

import java.util.Scanner;

public class ArrayContains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String c=sc.nextLine();
		String array[] = new String[n];
		for(int i=0;i<n;i++)
			array[i] = sc.nextLine();
		System.out.print("nhap chuoi sValue: ");
		String s = sc.nextLine();
		for(int i=0;i<n;i++)
			if(array[i].equals(s)) {
				System.out.print("Contained");
				return;
			}
		System.out.print("No Contain");
	}
}
