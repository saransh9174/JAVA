import java.util.Scanner;

class Order {
    private String customerName;
    private int customerNumber;
    private int quantityOrdered;
    private double unitPrice;
    private double totalPrice;

    // Constructor
    public Order(String customerName, int customerNumber, int quantityOrdered, double unitPrice) {
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.quantityOrdered = quantityOrdered;
        this.unitPrice = unitPrice;
        this.totalPrice = computePrice();
    }

    // Method to compute total price
    public double computePrice() {
        return quantityOrdered * unitPrice;
    }

    // Method to display order details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Quantity Ordered: " + quantityOrdered);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Price: $" + totalPrice);
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs from user
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter Customer Number: ");
        int customerNumber = sc.nextInt();
        System.out.print("Enter Quantity Ordered: ");
        int quantityOrdered = sc.nextInt();
        System.out.print("Enter Unit Price: $");
        double unitPrice = sc.nextDouble();

        // Create an object of Order class
        Order order = new Order(customerName, customerNumber, quantityOrdered, unitPrice);

        // Display order details
        System.out.println("Order Details:");
        order.displayDetails();

        sc.close();
    }
}
