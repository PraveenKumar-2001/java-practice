package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




public class MovieRating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Double> movies = new HashMap<>();

        while (true) {

            System.out.println("\n1.Add Movie");
            System.out.println("2.Search Movie");
            System.out.println("3.Update Rating");
            System.out.println("4.Delete Movie");
            System.out.println("5.Display All Movies");
            System.out.println("6.Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Movie Name: ");
                    String movie = sc.nextLine();

                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();

                    movies.put(movie, rating);
                    System.out.println("Movie Added");
                    break;

                case 2:
                    System.out.print("Enter Movie Name: ");
                    movie = sc.nextLine();

                    if (movies.containsKey(movie)) {
                        System.out.println("Rating = " + movies.get(movie));
                    } else {
                        System.out.println("Movie Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Movie Name: ");
                    movie = sc.nextLine();

                    if (movies.containsKey(movie)) {
                        System.out.print("Enter New Rating: ");
                        rating = sc.nextDouble();
                        movies.put(movie, rating);
                        System.out.println("Rating Updated");
                    } else {
                        System.out.println("Movie Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Movie Name: ");
                    movie = sc.nextLine();

                    movies.remove(movie);
                    System.out.println("Movie Deleted");
                    break;

                case 5:
                    for (Map.Entry<String, Double> entry : movies.entrySet()) {
                        System.out.println(entry.getKey() + " = " + entry.getValue());
                    }
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }

}