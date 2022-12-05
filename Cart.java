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
        double totalCost = 0.00d;
        Item[] warranties = new Item[0];
        for (Item item : this.items) {
            System.out.println("$" + item.cost + "\t" + item.name);
            System.out.print("Warranty? (Enter 'Yes' or 'Y'): ");
            String decision = scanner.nextLine();
            if (decision.equals("Yes") | decision.equals("Y") | decision.equals("y")) {

                Item[] newWarranties = new Item[warranties.length + 1];
                for (int index = 0; index < warranties.length; index++) {
                    newWarranties[index] = warranties[index];
                }
                warranties = newWarranties;
                // Copy contents with larger size by 1.

                System.out.println("Choose a warranty: ");
                System.out.println("1: 1-month Warranty - $29.99");
                System.out.println("2: 6-month Warranty - $49.99");
                System.out.println("3: 1-year Warranty - $69.99");
                decision = scanner.nextLine();

                switch (decision) {
                    default -> warranties[warranties.length - 1] = new Item(item.name + " 1-month Warranty", 29.99d);
                    case "2" -> warranties[warranties.length - 1] = new Item(item.name + " 6-month Warranty", 49.99d);
                    case "3" -> warranties[warranties.length - 1] = new Item(item.name + " 1-year Warranty", 69.99d);
                }
            }
            totalCost += item.cost;
        }
        for (Item warranty : warranties) {
            totalCost += warranty.cost;
        }
        System.out.println("Net Sales Price: $" + String.format("%.2f", totalCost));

        Item[] totalList = new Item[items.length + warranties.length];
        for (int index = 0; index < items.length; index++) {
            totalList[index] = items[index];
        }
        for (int index = items.length; index < items.length + warranties.length; index++) {
            totalList[index] = warranties[index-items.length];
        }
        this.items = totalList;
    }
    public void printReceipt() {
        System.out.println("");
        Double finalCost = 0.00d;
        for (Item item : this.items) {
            System.out.println("$" + String.format("%.2f", item.cost) + "\t" + item.name);
            finalCost += item.cost;
        }
        System.out.println("\nNet Sales Cost:\n$" + String.format("%.2f", finalCost));
        finalCost *= 1.065d;
        System.out.println("Tax Adjusted Cost: $" + String.format("%.2f", finalCost));
    }
}
