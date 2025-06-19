import java.util.*;
public class calculator {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number: ");
		float num_1=sc.nextFloat();
		System.out.println("enter second number: ");
		float num_2=sc.nextFloat();
		System.out.println("The addition  value of 2 numbers"+ (num_1+num_2) );
		System.out.println("The  subtraction is: "+ (num_1-num_2));
		System.out.println("The  multiplication is: "+ (num_1*num_2));
		System.out.println("The  division is: "+ (num_1/num_2));
		
		
	}

}
