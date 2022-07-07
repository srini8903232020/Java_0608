import java.util.*;
class nested {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
		int age = sc.nextInt();
	    System.out.println("Enter your weight");
		int weight = sc.nextInt();
		if (age>=18){
			if(weight>50){
				System.out.println("You are eligible to donate blood");
			}
		}
}}