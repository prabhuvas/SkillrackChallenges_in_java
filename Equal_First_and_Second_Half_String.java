package new_challenges;
import java.util.Scanner;

public class Equal_First_and_Second_Half_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		int n = sen.length();
		String Fhalf="",Shalf="";
		for(int i=0; i<n/2; i++) {
			Fhalf += sen.charAt(i);
		}
		for(int i=n/2; i<n; i++) {
			Shalf += sen.charAt(i);
		}
		
		System.out.print(Fhalf.equals(Shalf)?"yes":"no");
	}
}

//ip:
//	dumdum
//op:
//	yes
//exp:
//	1st half = dum, 2nd half = dum
//	therefore, yes is printed
//
//ip:
//	tellet
//op:
//	no