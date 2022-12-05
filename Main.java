import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        Item[] objects = new Item[12];
        objects[0] = new Item("70 inch TV ", 448.00d);
        objects[1] = new Item("43 inch TV ", 189.99d);
        objects[2] = new Item("50 inch TV ", 299.99d);
        objects[3] = new Item("MacBook ", 799.99d);
        objects[4] = new Item("Chromebook ", 109.00d);
        objects[5] = new Item("SurfacePro ", 999.99d);
        objects[6] = new Item("Iphone 1 ", 799.00d);
        objects[7] = new Item("Galaxy S22 ", 478.00d);
        objects[8] = new Item("Moto G Power ", 109.99d);
        objects[9] = new Item("PlayStation 5 ", 499.99d);
        objects[10] = new Item("XBox Series X ", 499.99d);
        objects[11] = new Item("Nintendo Switch ", 299.99d);
        while (true) {

            cart.addItem(Item.shopping(objects));
            System.out.println("Item added to shopping cart.\n");
            System.out.println("End? (Enter 'Yes'): ");
            String decision = scanner.nextLine();
            if (decision.equals("Yes")) {
                cart.checkout();
                break;
            }

        }
        cart.printReceipt();
    }
}
