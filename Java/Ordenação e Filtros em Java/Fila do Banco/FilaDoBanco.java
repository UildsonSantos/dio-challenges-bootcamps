import java.io.IOException;
import java.util.*;

public class FilaDoBanco {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int numeroDeFilas = scanner.nextInt();
        scanner.nextLine();

        int qtdClientesEmFila;

        List<Integer> filaDeClientes;
        HashMap<Integer, Integer> mapeamentoSenhaCliente;
        int senhaDoCliente;
        int qtdTroca;

        for (int i = 0; i < numeroDeFilas; i++) {
            filaDeClientes = new ArrayList<>();
            mapeamentoSenhaCliente = new HashMap<>();
            qtdClientesEmFila = scanner.nextInt();
            qtdTroca = 0;

            for (int j = 0; j < qtdClientesEmFila; j++) {

                senhaDoCliente = scanner.nextInt();
                filaDeClientes.add(senhaDoCliente);
                mapeamentoSenhaCliente.put(senhaDoCliente, j);

            }

            Collections.sort(filaDeClientes, Collections.reverseOrder());

            for (int k = 0; k < filaDeClientes.size(); k++) {

                if (mapeamentoSenhaCliente.get(filaDeClientes.get(k)) != k) {
                    qtdTroca++;

                }

            }

            System.out.println(qtdClientesEmFila - qtdTroca);

        }

        scanner.close();

    }
}
