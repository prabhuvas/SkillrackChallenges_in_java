package skillrack_challenges;
import java.util.Scanner;
public class Replace_ch1_by_ch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sen = new StringBuilder(sc.nextLine());
		String key[] = sc.nextLine().split(" ");
		for(int i=0; i<sen.length(); i++) {
			if(key[0].equals(Character.toString(sen.charAt(i)))) {
				System.out.print(key[1]);
			}
			else {
				System.out.print(sen.charAt(i));
			}
		}
	}

}

/*
 String sen = sc.nextLine();
 String ok[] = sc.nextLine().split(" ");
 System.out.print(sen.replace(ok[0], ok[1])); 

 ip:
 	prabhu
 	r q
 op:
 	pqabhu
*/
 