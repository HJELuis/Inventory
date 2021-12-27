package productos;
import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array[][] = {{1, 2, 3}, {3, 2, 1}};
		System.out.println(array[1][1]);
		int tempNumber = 0;
		String tempName = "";
		int qty = 0;
		double price = 0.0d;
		int maxSize = -1;

		do {
			try {
				System.out.println("Enter the number of products you would like to add \n" +
								"Enter 0(zero) if you do not wish to add products:");
				maxSize = in.nextInt();
				in.nextLine();
				if (maxSize < 0) System.out.println("Incorrect introduced value");
			}
			catch (Exception e) {
				System.out.println("Incorrect data type introduced");
				maxSize = 1;
				in.nextLine();
			}
		} while (maxSize < 0);

		if (maxSize == 0) System.out.println("Don't require products");
		else {
			Product[] products = new Product[maxSize];
			for (int i = 0; i < maxSize; i++) {
				
				System.out.println("Enter the name of the item: ");
				tempName = in.nextLine();
				System.out.println("Enter the amount: ");
				qty = in.nextInt();
				System.out.println("Enter the price: ");
				price = in.nextDouble();
				System.out.println("Enter the identifier: ");
				tempNumber = in.nextInt();
				products[i] = new Product(tempName, qty, price, tempNumber);
				in.nextLine();
			}
			for (Product p : products) System.out.println(p.toString());
		}

		
	} // end principal

} // end ProductTester
