package skillrack_challenges;
import java.util.Scanner;

public class step_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		int num = sc.nextInt();
		int j=0, temp=0, flag=-1;
		for(int i=0; i<sen.length(); i++) {
			if(j==0) {
				flag=0;
			}
			if(j==num-1) {//2
				flag=1;
			}
			temp = j;
			while(temp!=0) {
				System.out.print("*");
				temp--;
			}
			System.out.println(sen.charAt(i));
			if(flag==0) {
				j++;
			}
			else {
				j--;
			}
		}
	}
}
