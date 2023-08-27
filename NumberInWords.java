package skillrack_challenges;
import java.util.*;

public class NumberInWords {
	enum name{
		zero(0) ,one(1) ,two(2) ,three(3) ,four(4) ,five(5) ,six(6) ,seven(7) ,eight(8) ,nine(9);

		name(int digit){
		}
		public static void getName(int sdigit) {
			name numbers[]=name.values();
			System.out.print(numbers[sdigit]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		for(int a=0; a<sen.length(); a++) {
			name.getName(Character.getNumericValue(sen.charAt(a)));
		}
		
	}
}
