package skillrack_challenges;
import java.util.Scanner;

public class ToogleCaseVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		String vow = "aeiouAEIOU";
		for(int i=0; i<sen.length(); i++) {
			if(vow.indexOf(sen.charAt(i))>=0) {
				if(sen.charAt(i)>='A' && sen.charAt(i)<='Z') {
					System.out.print((char)(sen.charAt(i)+'a'-'A'));
				}
				else {
					System.out.print((char)(sen.charAt(i)+'A'-'a'));
				}
			}
			else {
				System.out.print(sen.charAt(i));
			}
		}
		
		System.out.println(vow.indexOf("iou"));
	}
}
