package skillrack_challenges;
import java.util.*;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		productofdigit(arr,n);
	}
	public static void productofdigit(int[] arr,int n) {
		int rem=0,product=1;
		for(int i=0; i<n; i++) {
			while(arr[i]>0) {
				rem = arr[i]%10;
				product = product*rem;
				arr[i] /= 10;
			}
			System.out.print(product+" ");
			product=1;
		}
	}
}
