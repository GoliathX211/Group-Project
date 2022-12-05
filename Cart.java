public class Cart {
    public Item[] items;
    public Cart() {
        this.items = new Item[0];
    }
    public void addItem(Item item) {
        Item[] newList = new Item[items.length + 1];
        for (Item itemCopy : this.items) {
            newList.clone()
        }

    }
}
