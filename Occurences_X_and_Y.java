package new_challenges;
import java.util.Scanner;

public class Occurences_X_and_Y {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		String key[] = sc.nextLine().split(" ");
		int x=0,y=0;
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(key[0])==arr[i]) {
				x++;
			}
			else {
				y++;
			}
		}
		
		System.out.print((x>=y)?"yes":"no");
	}
}

//ip:
//	5
//	8 8 3 8 3
//	8 3
//op:
//	Yes
//exp:
//	occurences of 8 is 3
//	occurences of 3 is 2
//	=> yes
//
//ip:
//	7
//	17 12 13 12 13 14 13
//	12 13 
//op:
//	No