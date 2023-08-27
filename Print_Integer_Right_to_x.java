package skillrack_challenges;
import java.util.Scanner;
public class Print_Integer_Right_to_x {
	
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int[] arr = new int[n];
	      for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	      }
	      int x = sc.nextInt();
	      
	      ans(n,arr,x);
	  }
	  
	    public static void ans(int n, int[] arr, int x){
	      for(int i=0; i<n; i++){
	        if(arr[i]==x){
	          while(i<n){
	            System.out.print(arr[i]+" ");
	            i++;
	          }
	          return;
	        }
	      }
	    }
	}

//IP:-
//6
//20 35 10 44 99 18 
//44
//
//OP:-
//44 99 18
