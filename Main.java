
public class Main {
    public static void main(String[] args) {
        Item[] objects = new Item[2];
        objects[0] = new Item("Hammer", 5.99d);
        objects[1] = new Item("Screwdriver", 3.75d);
        Item selected = Item.shopping(objects);
        System.out.println(selected.name + selected.cost);
    }
}
