import java.util.Scanner;

class Salesperson {
    private String name;
    private double basicSalary;
    private int salesUnits;
    private double incentive;

    // Constructor
    public Salesperson(String name, double basicSalary, int salesUnits) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.salesUnits = salesUnits;
        this.incentive = calculateIncentive();
    }

    // Method to calculate incentive
    public double calculateIncentive() {
        if (salesUnits > 500) {
            return 0.2 * basicSalary;
        } else {
            return 0.1 * basicSalary;
        }
    }

    // Method to display incentive
    public void displayIncentive() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Sales Units: " + salesUnits);
        System.out.println("Incentive: $" + incentive);
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array to store salespersons
        Salesperson[] salespersons = new Salesperson[5];

        // Input salesperson details
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Salesperson " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Basic Salary: $");
            double basicSalary = sc.nextDouble();
            System.out.print("Sales Units: ");
            int salesUnits = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            salespersons[i] = new Salesperson(name, basicSalary, salesUnits);
            System.out.println();
        }

        // Display incentives
        System.out.println("Incentives for Salespersons:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Salesperson " + (i + 1) + ":");
            salespersons[i].displayIncentive();
            System.out.println();
        }

        sc.close();
    }
}
