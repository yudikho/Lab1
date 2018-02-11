import java.util.Scanner;
public class ShoppingCartTest {
    public static void main(String[] args) {
        // instantiate a new shopping cart
        ShoppingCart sc = new ShoppingCart();

        // instantiate 2 product objects
        Product coffee = new Product(1, "coffee", 5.00);
        Product tea = new Product(2, "tea", 3.00);

        // instantiate 2 shopping cart line items
        ShoppingCartLineItem line1 = new ShoppingCartLineItem(coffee, 2);
        ShoppingCartLineItem line2 = new ShoppingCartLineItem(tea, 2);

        // add them to shopping cart
        sc.addLineItem(line1);
        sc.addLineItem(line2);

        //retrieve line item 1's product object
        Product p = line1.getProduct();

        // print this product's description
        System.out.println("Line 1 : " + p.getDescription()
                // print quantity of product ordered
                + " x " + line1.getQuantity()
                // print total price for this product line item
                + " = $" + line1.getLineTotal());

        //retrieve line item 2's product object
        p = line2.getProduct();

        // print this product's description
        System.out.println("Line 2 : " + p.getDescription()
                // print quantity of product ordered
                + " x " + line2.getQuantity()
                // print total price for this product line item
                + " = $" + line2.getLineTotal());

        // print shopping cart total
        System.out.println("Total is $" + sc.getCartTotal());
    }
}
