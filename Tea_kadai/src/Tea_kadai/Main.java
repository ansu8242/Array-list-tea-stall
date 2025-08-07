package Tea_kadai;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<tea_kadai> teaList = new ArrayList<>();

        while (true) {
            System.out.println("Enter the number to choose your choice");
            System.out.println("1. Initialise the value in array");
            System.out.println("2. Display the array in foreach loop");
            System.out.println("3. Search Method");
            System.out.println("4. Exit the loop");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 1) {
                tea_kadai tea = new tea_kadai();

                System.out.println("Enter the Shop Name: ");
                String shopName = sc.nextLine();
                tea.setShopName(shopName);

                System.out.println("Enter the Location: ");
                String location = sc.nextLine();
                tea.setLocation(location);

                System.out.println("Enter the Famous Tea: ");
                String famousTea = sc.nextLine();
                tea.setFamousTea(famousTea);

                System.out.println("Enter the Snacks: ");
                String snacks = sc.nextLine();
                tea.setSnacks(snacks);

                teaList.add(tea);
            }
            else if (choice == 2) {
                for (tea_kadai t : teaList) {
                    System.out.println(t);
                }
            }
            else if (choice == 3) {
                System.out.println("Enter the Shop Name to search");
                String searchName = sc.nextLine();

                boolean found = false;
                for (tea_kadai t : teaList) {
                    if (t.getShopName().equalsIgnoreCase(searchName)) {
                        System.out.println(t);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Shop name not found");
                }
            }
            else if (choice == 4) {
                System.out.println("Exit successfully");
                sc.close();
                System.exit(0);
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}
