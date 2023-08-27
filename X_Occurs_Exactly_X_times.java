package new_challenges;
import java.util.Scanner;

public class X_Occurs_Exactly_X_times {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int count=0;
		for(int i=0; i<n; i++) {
			if(arr[0]==arr[i]) {
				count++;
			}
		}
		
		System.out.print(count==x?"yes":"no");
		
	}
}

//ip:
//	5
//	2 3 5 2 4
//	2
//op:
//	yes
//exp:
//	2 is occured 2 times
//
//ip:
//	8
//	5 7 5 6 5 8 10 5
//	5
//op:
//	no