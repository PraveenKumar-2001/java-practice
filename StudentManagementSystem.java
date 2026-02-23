import java.util.*;

class StudentManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> studentIds = new HashSet<>();
        HashMap<Integer, String> studentMap = new HashMap<>();

        int choice;

        do
        {
            
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Display Total Student Count");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    if(studentIds.contains(id))
                    {
                        System.out.println("Duplicate ID not allowed!");
                    }
                    else
                    {
                        studentIds.add(id);
                        studentMap.put(id, name);
                        System.out.println("Student Added Successfully!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID to Remove: ");
                    int removeId = sc.nextInt();

                    if(studentIds.remove(removeId))
                    {
                        studentMap.remove(removeId);
                        System.out.println("Student Removed!");
                    }
                    else
                    {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    if(studentMap.containsKey(searchId))
                    {
                        System.out.println("Student Name: " + studentMap.get(searchId));
                    }
                    else
                    {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    for(Integer sid : studentMap.keySet())
                    {
                        System.out.println("ID: " + sid + " Name: " + studentMap.get(sid));
                    }
                    break;

                case 5:
                    System.out.println("Total Students: " + studentIds.size());
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 6);
    }
}