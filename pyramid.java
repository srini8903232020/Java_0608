import java.util.*;
public class pyramid
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=sc.nextInt();
	    
		for(int i=n;i>=1;i--){
            int j=n;
            while(j>=1){
                System.out.print("*");
                j--;
            }
            n--;
        
        System.out.println("\n"); 
    }
	}
}
