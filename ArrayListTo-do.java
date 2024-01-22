import java.util.*;

public class TodoListProject {
    public static void main(String[] args) {

        /*
        Create a to-do list with ArrayLists. The to-do list should be able to:
        add items (at the end)
        remove items (from any spot in the list)
        print itself
         */

        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean program = true;
        while (program) {

            System.out.println("What would you like to do? (print/add/remove/quit)");
            String response = sc.next();

            if (response.equals("print")) {
                for (String i : list) {
                    System.out.println("* " + i);
                }
            } else if (response.equals("add")) {
                System.out.println("New Item:");
                String newItem = sc.next();
                list.add(newItem);
            } else if (response.equals("remove")) {
                for (int x = 0; x < list.size(); x++) {
                    System.out.println((x+1) + ") " + list.get(x));
                }
                System.out.println("Remove which item?");
                int removedItem = sc.nextInt();
                sc.nextLine();
                if (removedItem > 0 && removedItem < list.size()+1) {
                    list.remove(removedItem - 1);
                } else {
                    System.out.println("That item does not exist!");
                }
            } else {
                program = false;
            }
        }
        
        System.out.println("Thank you! Here is your final list:");
        for (String i : list) {
            System.out.println("* " + i);
        }
    }
}
