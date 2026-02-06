public class MenuItem {
    private String itemName;

    public MenuItem(String name) {
        this.itemName = name;
    }

    public String identifyRole() {
        return "I am the MenuItem Class. I store the specific names of food or drinks available.";
    }

    public String itemDetails() {
        return "Item: " + itemName;
    }
}
