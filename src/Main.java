
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Ќапишете програма, ко€то намира сбора на всичките четни елементи в
		// масив.

		Scanner scan = new Scanner(System.in);


		int[] a = {1,3,2,6,4,8,5,7};
		int x=0;
		for(int i=0; i<a.length; i++){
			if(i%2==0){
				
				x=x+ a[i];
			}
		}
		System.out.println(x);
	}
}
