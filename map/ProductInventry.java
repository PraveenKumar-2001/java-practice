package map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;




public class ProductInventry {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
        Map<String, Integer> products = new HashMap<>();

        while (true) {
            System.out.println("\n1.Add Product");
            System.out.println("2.Search Product");
            System.out.println("3.Update Quantity");
            System.out.println("4.Delete Product");
            System.out.println("5.Display All Products");
            System.out.println("6.Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    products.put(pname, qty);
                    System.out.println("Product Added");
                    break;

                case 2:
                    System.out.print("Enter Product Name: ");
                    pname = sc.nextLine();

                    if (products.containsKey(pname)) {
                        System.out.println("Quantity = " + products.get(pname));
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Product Name: ");
                    pname = sc.nextLine();

                    if (products.containsKey(pname)) {
                        System.out.print("Enter New Quantity: ");
                        qty = sc.nextInt();
                        products.put(pname, qty);
                        System.out.println("Quantity Updated");
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product Name: ");
                    pname = sc.nextLine();

                    products.remove(pname);
                    System.out.println("Product Deleted");
                    break;

                case 5:
                    for (Map.Entry<String, Integer> entry : products.entrySet()) {
                        System.out.println(entry.getKey() + " = " + entry.getValue());
                    }
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }

}