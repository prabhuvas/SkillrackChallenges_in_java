package skillrack_challenges;
import java.util.Scanner;

public class Binary_Representation_of_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		String temp="";
		for(int i=0; i<sen.length(); i++) {
			int num = Character.getNumericValue(sen.charAt(i));
			temp = "";
			if(num==0) {
				System.out.print("0000");
			}
			else {
				while(num!=0) {
					temp += num%2;
					num /= 2;
				}
				if(temp.length()==4) {
					for(int a=temp.length()-1; a>=0; a--) {
						System.out.print(temp.charAt(a));
					}
				}else {
					int rem=4-temp.length();
					while(rem!=0) {
						System.out.print(0);
						rem--;
					}
					for(int b=temp.length()-1; b>=0; b--) {
						System.out.print(temp.charAt(b));
					}
				}
			}
			System.out.println();
		}
		

	}

}

//ip:4653
//op:
//	0100
//	0110
//	0101
//	0011
