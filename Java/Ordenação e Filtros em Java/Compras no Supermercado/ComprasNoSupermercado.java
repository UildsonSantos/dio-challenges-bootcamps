import java.io.IOException;
import java.util.*;

public class ComprasNoSupermercado {

    public static void main(String[] args) throws IOException {
        List<SortedSet<String>> shoppingLists = new ArrayList<>();
        SortedSet<String> setList;

        Scanner keyboardReadout = new Scanner(System.in);

        int N = keyboardReadout.nextInt();
        keyboardReadout.nextLine();

        for (int i = 0; i < N; i++) {

            setList = new TreeSet<String>();

            String[] itemsShopping = keyboardReadout.nextLine().split(" ");
            for (String item : itemsShopping) {
                setList.add(item);
            }

            shoppingLists.add(setList);
        }

        keyboardReadout.close();

        Iterator<SortedSet<String>> shoppingList = shoppingLists.iterator();

        while (shoppingList.hasNext()) {
            String list = String.join(" ", shoppingList.next());
            System.out.println(list);
        }
    }

}