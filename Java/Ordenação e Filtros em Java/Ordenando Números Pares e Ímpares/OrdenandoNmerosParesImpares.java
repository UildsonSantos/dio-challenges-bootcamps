import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.StringTokenizer;

public class OrdenandoNmerosParesImpares {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int numLinhas = Integer.parseInt(st.nextToken());

    List<Integer> entrada = new ArrayList<Integer>();
    List<Integer> listNumPar = new ArrayList<Integer>();
    List<Integer> listNumImpar = new ArrayList<Integer>();

    for (int i = 0; i < numLinhas; i++) {
      st = new StringTokenizer(br.readLine());
      entrada.add(Integer.parseInt(st.nextToken()));

      if (entrada.get(i) % 2 == 0)
        listNumPar.add(entrada.get(i));
      else
        listNumImpar.add(entrada.get(i));
    }

    Collections.sort(listNumImpar);
    Collections.reverse(listNumImpar);

    Collections.sort(listNumPar);

    for (int numPar : listNumPar) {
      System.out.println(numPar);
    }

    for (int numImpar : listNumImpar) {
      System.out.println(numImpar);
    }

  }

}