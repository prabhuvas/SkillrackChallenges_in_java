package new_challenges;
import java.util.Scanner;

public class Odd_Even_Position_Characters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		String even="",odd="";
		for(int i=0; i<sen.length(); i++) {
			if(i%2==0) {
				even += sen.charAt(i);
			}
			else {
				odd += sen.charAt(i);
			}
		}
		
		System.out.print(even+"\n"+odd);
	}

}
