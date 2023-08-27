package skillrack_challenges;
import java.util.Scanner;

public class Not_Ending_with_5_or_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n = sc.nextLine().split(" ");
		String[] arr = sc.nextLine().split(" ");
		String num = "56";
		int count=0;
		for(int i=0; i<arr.length; i++) {
			int temp = (int) Math.pow(Integer.parseInt(arr[i]), 2) + Integer.parseInt(n[1]);
			String last = String.valueOf(temp%10);
			if(num.indexOf(last)<0) {
				System.out.print(temp+" ");
				count=1;
			}
		}
		
		if(count==0) {
			System.out.print(-1);
		}
	}

}


//ip:
//	4 10
//	3 1 4 7
//op:
//	19 11 59
//exp:
//	3 square is 9, 9+10= 19 => not ending with 5 or 6
//	1 square is 1, 1+10= 11 => not ending with 5 or 6
//	4 square is 16, 16+10= 26 => ending with 5 or 6
//	7 square is 49, 49+10= 59 => not ending with 5 or 6
//	
//	if all value is ending with 5 or 6 then it print -1 as output