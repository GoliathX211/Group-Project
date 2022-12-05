import java.util.Scanner;

public class Item {
    public String name;
    public double cost;
    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    public static Item shopping(Item[] items) {
        int choice;
        for (int iterator = 0; iterator < items.length; iterator++) {
            System.out.println("Name: " + items[iterator].name + "\nCost: $" + items[iterator].cost + "\nIndex: " + iterator + "\n");
        }
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose an item by index: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 0 || choice > items.length) {
                    System.out.println("You have chosen an index out of bounds. Try again.");
                    continue;
                }
                break;
            } catch (Exception ignored) {
                System.out.println("Exception encountered:" + ignored + "\nTry again.");
            }
        }
        return items[choice];
    }
}
