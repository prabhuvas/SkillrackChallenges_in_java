package skillrack_challenges;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		decimaltobinary(n);
	}
	public static void decimaltobinary(int n) {
		int[] binary = new int[1000];
		int i=0;
		while(n>0) {
			binary[i] = n % 2;
			n = n / 2;
			i++;
		}
		
		for(int j=i-1; j>=0; j--) {
			System.out.print(binary[j]);//original binary num
		}
		System.out.println();
		for(int k=0; k<=i; k++) {
			System.out.print(binary[k]);
		}
	}
}
