package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




public class LibraryManagment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, String> books = new HashMap<>();

        while (true) {

            System.out.println("\n1.Add Book");
            System.out.println("2.Search Book");
            System.out.println("3.Update Book");
            System.out.println("4.Remove Book");
            System.out.println("5.Display All Books");
            System.out.println("6.Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    books.put(id, title);
                    System.out.println("Book Added");
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    if (books.containsKey(id)) {
                        System.out.println("Book Title = " + books.get(id));
                    } else {
                        System.out.println("Book Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    if (books.containsKey(id)) {
                        System.out.print("Enter New Title: ");
                        title = sc.nextLine();

                        books.put(id, title);
                        System.out.println("Book Updated");
                    } else {
                        System.out.println("Book Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    books.remove(id);
                    System.out.println("Book Removed");
                    break;

                case 5:
                    for (Map.Entry<Integer, String> entry : books.entrySet()) {
                        System.out.println(entry.getKey() + " = " + entry.getValue());
                    }
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }

}