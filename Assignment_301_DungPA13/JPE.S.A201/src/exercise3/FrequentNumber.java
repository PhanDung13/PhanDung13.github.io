package exercise3;

import java.util.Scanner;

public class FrequentNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len= sc.nextInt();
		int array[] = new int[len];
		int i=0;
		array[i]=sc.nextInt();
		i++;
		String s;
		do{
			System.out.print("Do you want to continue?");
			String a = sc.nextLine();
			s=sc.nextLine();
			if(s.equals("Y")) {
				array[i]=sc.nextInt();
				i++;
			}
			else break;
		}
		while(i<len);
		int dem=0,x=0;
		int indexs[] =new int[len];
		int value = sc.nextInt();
		for(int j=0;j<i;j++) {
			if(array[j] == value) {
				dem++;
				indexs[x]=j;
				x++;
			}
		}
		System.out.println("Amount of frequence: "+dem);
		System.out.print("Index: ");
		for(int j=0;j<x;j++)
			System.out.print(indexs[j]+" ");
	}
}
