import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ValidadorDeSenhasComRequisitos {
    public final static int MAX = 200;

    public static void main(String[] args) {
        // String8 senha = new String8(MAX);

        // insira sua resolução aqui
        int achouNumero = 0;
        int achouMaiuscula = 0;
        int achouMinuscula = 0;
        int achouSimbolo = 1;

        BufferedReader inReader;
        inReader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        try {
            while ((line = inReader.readLine()) != null) {
                if (line.length() >= 6 && line.length() <= 32) {
                    achouNumero = 0;
                    achouMaiuscula = 0;
                    achouMinuscula = 0;
                    achouSimbolo = 1;
                    for (char c : line.toCharArray()) {
                        if (c >= '0' && c <= '9') {
                            achouNumero += 1;
                        } else if (c >= 'A' && c <= 'Z') {
                            achouMaiuscula += 1;
                        } else if (c >= 'a' && c <= 'z') {
                            achouMinuscula += 1;
                        } else {
                            achouSimbolo = 0;
                        }

                    }

                    if ((achouNumero == 0 || achouMaiuscula == 0 || achouMinuscula == 0 || achouSimbolo == 0)) { // complete
                                                                                                                 // o if
                                                                                                                 // de
                                                                                                                 // acordo
                                                                                                                 // com
                                                                                                                 // suas
                                                                                                                 // variaveis
                        System.out.println("Senha invalida.");
                    } else {
                        System.out.println("Senha valida.");
                    }
                } else {
                    System.out.println("Senha invalida.");
                }
            }

            inReader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

}
