
import java.io.IOException;
import java.util.Scanner;

public class EntrevistaEmbaraçosa {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String auxq;

        while (input.hasNext()) {

            auxq = input.next();

            if (auxq.length() == 1) {
                System.out.println(auxq);
                continue;
            }

            for (int i = 0; i < auxq.length(); i++) {

                if (!auxq.substring(0, auxq.length() - i).contains(auxq.substring(auxq.length() - i))) {
                    System.out.println(auxq.substring(0, auxq.length() - i + 1));
                    break;
                }
            }
        }
        input.close();
    }
}
