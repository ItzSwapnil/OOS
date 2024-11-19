// Grocery store by extending classes

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: ₹" + price);
    }
}

class Fruit extends Product {
    private String color;

    public Fruit(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}

class Vegetable extends Product {
    private String type;

    public Vegetable(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}

public class Extending_Classes {
    public static void main(String[] args) {
        Product apple = new Fruit("Apple", 20, "Red");
        Product carrot = new Vegetable("Carrot", 5, "Root");

        apple.displayInfo();
        System.out.println();
        carrot.displayInfo();
    }
}

/*
Output:
Product: Apple, Price: ₹20.0
Color: Red

Product: Carrot, Price: ₹5.0
Type: Root

 */