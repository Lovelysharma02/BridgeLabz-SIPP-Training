import java.util.*;
public class harryage {
	public static void main (String[]args) {
		Scanner sc=new Scanner (System.in);
		int current_year=2025;
		System.out.println("Enetr birth year: ");
		int birth_year=sc.nextInt();
		int age= current_year- birth_year;
		if(age>0) {
			System.out.println("the age is"+age);
		}else {
			System.out.println("enter valid year");
		}
	}

}
