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
        for (int index = 0; index < this.items.length; index++) {
            System.out.println("$" + this.items[index].cost + "\t" + this.items[index].name);
            totalCost += this.items[index].cost;
        }
        System.out.println("\nTotal Cost:\n$" + totalCost);
    }
}
