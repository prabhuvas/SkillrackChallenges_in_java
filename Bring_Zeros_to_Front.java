package skillrack_challenges;
import java.util.Scanner;
public class Bring_Zeros_to_Front {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			int mini = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[mini]) {
					mini = j;
				}
			}
			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
		}
		
		for(int k=0; k<n; k++) {
			System.out.print(arr[k]+" ");
		}

	}

}

//ip:
//	7
//	0 0 1 1 0 1 0
//op:
//	0 0 0 0 1 1 1
