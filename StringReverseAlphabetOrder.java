package skillrack_challenges;
import java.util.Scanner;

public class StringReverseAlphabetOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Stringsort(str);
	}
	
	public static void Stringsort(String str) {
		char[] ch = str.toCharArray();
		int len = str.length();
		
		for(int i=0; i<len; i++) {
			int mini = i;
			for(int j=i+1; j<len; j++) {
				if(ch[j] < ch[mini]) {
					mini = j;
				}
			}
			char temp = ch[mini];
			ch[mini] = ch[i];
			ch[i] = temp;
		}
		
		for(int i=len-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
}
