import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ConjuntosBonsOuRuins {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int number1;
        boolean contemSubstring;
        List<String> nomes;

        while (true){
            contemSubstring = false;
            nomes = new ArrayList<>();
            number1 = input.nextInt();
            input.nextLine();
            if (number1 == 0) {
                break;
            }
            for (int i = 0; i < number1; i++) {
                nomes.add(input.next());
            }
            nomes.sort(Comparator.comparingInt(String::length));

            while (nomes.size()>0){
                String nome = nomes.remove(0);
                for (String item : nomes){
                    if (item.contains(nome)){
                        contemSubstring = true;
                        break;
                    }
                }
                if (contemSubstring){
                    break;
                }
            }

            if (contemSubstring){
                System.out.println("Conjunto Ruim");
            }else{
                System.out.println("Conjunto Bom");
            }


        }
    }
}