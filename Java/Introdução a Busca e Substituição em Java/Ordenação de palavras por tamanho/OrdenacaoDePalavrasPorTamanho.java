import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoDePalavrasPorTamanho {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int inputQtd = scanner.nextInt();
    scanner.nextLine();

    List<List<String>> conjuntoDePalavras = new ArrayList<>();

    for (int i = 0; i < inputQtd; i++) {
      List<String> palavras = Arrays.asList(scanner.nextLine().split(" "));

      conjuntoDePalavras.add(palavras);
    }

    scanner.close();

    for (List<String> itemWords : conjuntoDePalavras) {
      itemWords.sort(Comparator.comparingInt(String::length).reversed().thenComparing(String::compareTo));
      System.out.println(String.join(" ", itemWords));
    }

    // conjuntoDePalavras.forEach(item -> System.out.println(String.join(" ",
    // item)));
  }
}