package exercise1;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		int array[] = new int[100];
		int sum=0;
		for(int i=1;i<=100;i++) {
			array[i-1]=i;
			sum+=i;
		}
		System.out.print((float)sum/100);
	}
}
