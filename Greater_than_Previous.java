package new_challenges;
import java.util.Scanner;

public class Greater_than_Previous {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int prev = arr[0];
		System.out.print(prev+" ");
		for(int i=1; i<n; i++) {
			if(arr[i]>prev) {
				System.out.print(arr[i]+" ");
			}
			prev=arr[i];
		}
	}
}

//ip:
//	7
//	10 -90 66 0 22 0 -14
//op:
//	10 66 22
//	
//ip:
//	5
//	10 20 30 24 40
//op:
//	10 20 30 40