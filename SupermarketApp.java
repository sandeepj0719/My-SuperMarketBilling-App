import java.util.Scanner;
public class SupermarketApp {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Show Cart");
            System.out.println("3. Calculate Total");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    Product product = new Product(name, price, quantity);
                    cart.addProduct(product);
                    break;
                case 2:
                    System.out.println("Cart Contents:");
                    for (Product item : cart.getItems()) {
                        System.out.println(item.getName() + " - $" + item.getPrice() + " x " + item.getQuantity());
                    }
                    break;
                case 3:
                    double total = cart.calculateTotal();
                    System.out.println("Total: $" + total);
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");

                    scanner.close();
            }
        }
    }
}