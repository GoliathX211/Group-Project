import java.util.Scanner;

public class Cart {
    public Item[] items;
    public Cart() {
        this.items = new Item[0];
    }
    public void addItem(Item item) {
        Item[] newList = new Item[this.items.length + 1];
        for (int index = 0; index < this.items.length; index++) {
            newList[index] = this.items[index];
        }
        newList[items.length] = item;
        this.items = newList;
    }
    public void displayItems() {
        Double totalCost = 0.00d;
        System.out.println("Current Cart: \n");
        for (Item item : this.items) {
            System.out.println("$" + item.cost + "\t" + item.name);
            totalCost += item.cost;
        }
        System.out.println("\nTotal Cost:\n$" + totalCost);
    }
    public void checkout() {
        Scanner scanner = new Scanner(System.in);
        Double totalCost = 0.00d;
        Item[] warranties = new Item[0];
        for (Item item : this.items) {
            System.out.println("$" + item.cost + "\t" + item.name);
            System.out.print("Warranty? (Enter 'Yes' or 'Y'): ");
            String decision = scanner.nextLine();
            if (decision.equals("Yes") | decision.equals("Y")) {
                System.out.println("");
            }
            totalCost += item.cost;
        }
    }
}
