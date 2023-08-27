package skillrack_challenges;
import java.util.Scanner;

public class Binary_Palindrome {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int rem=0;
      String ok="";
      String sum="";
      while(n!=0){
        rem = n%2;
        ok = Integer.toString(rem);
        sum += ok;
        n /= 2;
      }
      String str = sum;
      char[] ch = sum.toCharArray();
      String str2 = "";
      
      for(int i=sum.length()-1; i>=0; i--){
        str2 += ch[i];
      }
      
      System.out.println((str.equals(str2))?"yes":"no");
      System.out.println(str2);
      System.out.println(sum);
      
      
  }
}