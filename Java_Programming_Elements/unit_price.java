import java.util.*;
public class unit_price {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        int unitPrice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + 
            " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }

}
