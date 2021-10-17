import java.util.Scanner;

public class Discount_Of_product {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		float discount, product_pr;
		System.out.println("Enter the product price : ");
		product_pr =sc.nextFloat();
		
		System.out.println("Enter the discount in percent (Eg. 14) : ");
		discount =sc.nextFloat();
		float dis_amt = discount/100;
//		System.out.println("Discount amount : " + dis_amt);

		
		float final_pr;
		final_pr =(product_pr * dis_amt);
		
		System.out.println("Discounted product price : " + (product_pr - final_pr));
		sc.close();

		

	}

}
