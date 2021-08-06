
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AbreviandoPostsDoBlog {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // insira sua solução aqui
        StringBuilder result = new StringBuilder();
        Map<String, ArrayList<String>> mapaNomes = new HashMap<>();

        String linha = "";
        while (true) {
            linha = br.readLine();

            if (linha.equals("."))
                break;

            st = new StringTokenizer(linha);

            while (st.hasMoreTokens()) {
                String aux = st.nextToken();
                result.append(aux).append(" ");
                if (aux.length() > 2)
                    if (mapaNomes.containsKey(aux.substring(0, 1))) {
                        mapaNomes.get(aux.substring(0, 1)).add(aux);
                    } else {
                        ArrayList<String> word = new ArrayList<>();
                        word.add(aux);
                        mapaNomes.put(aux.substring(0, 1), word);
                    }
            }

            mapaNomes.entrySet().forEach(letra -> {

                letra.getValue().sort(Comparator.comparing(aa -> {

                    return letra.getValue().stream()
                            .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()))
                            .get(aa) * 2

                            + letra.getValue().stream().mapToInt(String::length).sum()
                            - letra.getValue().stream().collect(
                                    Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()))
                                    .get(aa) * aa.length();
                }));
            });

            StringBuilder finalResult = result;
            mapaNomes.entrySet().forEach(me -> {
                replaceAll(finalResult, me.getValue().get(0) + " ", me.getKey() + ". ");

            });

            System.out.println(result.toString());

            System.out.println(mapaNomes.size());

            result = new StringBuilder();

            mapaNomes.entrySet().stream().forEach(me -> {
                System.out.println(me.getKey() + ". = " + me.getValue().get(0));

            });
            mapaNomes.clear();
        }
    }

    public static void replaceAll(StringBuilder builder, String from, String to) {
        String aux = builder.toString();
        aux = aux.replaceAll(from, to);
        builder.setLength(0);
        builder.append(aux);
    }
}
