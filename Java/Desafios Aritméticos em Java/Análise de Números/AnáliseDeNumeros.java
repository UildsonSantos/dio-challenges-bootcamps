import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AnáliseDeNumeros {
	
    public static void main(String[] args) throws IOException {
      
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = "";

        StringTokenizer st;
        int qtd_impar = 0;
        int qtd_par = 0;
        int qtd_positivo = 0;
        int qtd_negativo = 0;


        for (int tentativas = 0; tentativas < 5; tentativas++) {
            if ((linha = br.readLine()) != null) {
                st = new StringTokenizer(linha);
                int valor = Integer.parseInt(st.nextToken());

                if (valor > 0) {
                    qtd_positivo += 1;
                }else if (valor < 0){
                    qtd_negativo += 1;
                }

                if (valor % 2 == 0) {
                    qtd_par += 1;
                }else{
                    qtd_impar += 1;
                }

            }
        }
        String sf1 = String.format("%d valor(es) par(es)", qtd_par);
        String sf2 = String.format("%d valor(es) impar(es)", qtd_impar);
        String sf3 = String.format("%d valor(es) positivo(s)", qtd_positivo);
        String sf4 = String.format("%d valor(es) negativo(s)", qtd_negativo);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
        System.out.println(sf4);
    }
	
}