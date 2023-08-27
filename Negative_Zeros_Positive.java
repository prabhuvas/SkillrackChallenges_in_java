package new_challenges;
import java.util.Scanner;

public class Negative_Zeros_Positive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count=1;
		while(count<=3) {
			for(int i=n-1; i>=0; i--) {
				if(count==1) {
					if(arr[i]<0) {
						System.out.print(arr[i]+" ");
					}
				} else if(count==2) {
					if(arr[i]==0) {
						System.out.print(arr[i]+" ");
					}
				} else if(count==3) {
					if(arr[i]>0) {
						System.out.print(arr[i]+" ");
					}
				}
			}
			count++;
		}
	}
}

//ip:
//	7
//	10 -90 66 0 22 0 -14
//op:
//	-14 -90 0 0 22 66 10
//exp:
//	-ve integers from the end are -14 -90
//	there are two zeros
//	+ve integers from the end are 22 66 10
//	
//ip:
//	5
//	10 20 -88 98 -90
//op:
//	-90 -88 98 20 10