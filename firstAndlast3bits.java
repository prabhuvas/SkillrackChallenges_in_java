package skillrack_challenges;
import java.util.Scanner;

public class firstAndlast3bits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int first=0,last=0;
		String sen="";
		while(num!=0) {
			sen += num%2;
			num/=2;
		}//8421
		System.out.println(sen);
		System.out.print("The binary num is:");
		for(int j=sen.length()-1; j>=0; j--) {
			System.out.print(sen.charAt(j));//original binary num
		}
		System.out.println();
		int a=0;
		for(int i=0,j=sen.length()-3; i<3 && j<sen.length(); i++,j++) {
			first += Character.getNumericValue(sen.charAt(j))*Math.pow(2, a);
			last += Character.getNumericValue(sen.charAt(i))*Math.pow(2, a);
			a++;
		}
		
		System.out.print(first+" "+last);

	}

}
