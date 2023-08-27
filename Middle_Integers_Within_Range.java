package new_challenges;
import java.util.Scanner;

public class Middle_Integers_Within_Range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag=false;
		for(int i=1; i<n-1; i++) {
			if(arr[0] <= arr[i] && arr[n-1] >= arr[i]) {
				flag = true;
			}
			else {
				flag = false;
			}
		}
		
		System.out.print(flag==true?"yes":"no");
	}
}

//ip:
//	5
//	10 20 12 18 90
//op:
//	yes
//exp:
//	all three integers 20 12 18 is greaterthan 10 and lesserthan 90