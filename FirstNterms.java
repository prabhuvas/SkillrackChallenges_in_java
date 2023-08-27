package skillrack_challenges;
import java.util.Scanner;

public class FirstNterms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();
		int start=1, count=1, result=0;
		for(;start<=end;start++) {
			for(int a=1; a<=start; count++, a++) {
				result += count;
			}
			System.out.print(result+" ");
			result=0;
		}
	}
}


//ip:5
//
//op:1 5 15 34 65
//
//1 = 1
//5 = 2+3
//15 = 4+5+6
//34 = 7+8+9+10
//65 = 11+12+13+14+15