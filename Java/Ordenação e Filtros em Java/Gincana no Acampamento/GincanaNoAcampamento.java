import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GincanaNoAcampamento {
    private String nome;
    private Integer valorDaFicha;

    public GincanaNoAcampamento(String nome, Integer valorDaFicha) {
        this.nome = nome;
        this.valorDaFicha = valorDaFicha;
    }

    public String getNome() {
        return nome;
    }

    public Integer getValorDaFicha() {
        return valorDaFicha;
    }

   

    public static int getNumeroPar(int valorFicha, int indiceCorrente, int tamVetor){
        int k = 0;
        while (k < valorFicha) {

            if (indiceCorrente > 0) {
                indiceCorrente = (indiceCorrente - 1) % tamVetor;
            } else {
                indiceCorrente = tamVetor - 1;
            }

            k++;
        }
        return indiceCorrente;
    }

    public static int getNumeroImpar(int valorFicha, int indiceCorrente, int tamVetor){
        int k = 0;
        while (k < valorFicha) {
            indiceCorrente = (indiceCorrente + 1) % tamVetor;
            k++;
        }
        return indiceCorrente;
    }

    public static void main(String[] args) {

        List<GincanaNoAcampamento> listaDeAlunos = new ArrayList<>();

        int numeroDeAlunos;
        String aluno;
        int valorFicha;
        int valorAtualFicha;
        int indiceAtual;
        int indiceAlunoEliminado;

        Scanner scanner = new Scanner(System.in);

        numeroDeAlunos = Integer.parseInt(scanner.next());

        while (numeroDeAlunos > 0) {

            for (int i = 0; i < numeroDeAlunos; i++) {

                aluno = scanner.next();
                valorFicha = Integer.parseInt(scanner.next());

                listaDeAlunos.add(new GincanaNoAcampamento(aluno, valorFicha));
            }

            indiceAtual = 0;
            indiceAlunoEliminado = 0;
            valorAtualFicha = listaDeAlunos.get(indiceAtual).getValorDaFicha();

            while (listaDeAlunos.size() > 1){

                if (valorAtualFicha % 2 == 0) {

                    indiceAlunoEliminado = getNumeroPar(valorAtualFicha, indiceAtual, listaDeAlunos.size());


                } else{
                    indiceAlunoEliminado = getNumeroImpar(valorAtualFicha, indiceAtual, listaDeAlunos.size());

                }
                valorAtualFicha = listaDeAlunos.get(indiceAlunoEliminado).getValorDaFicha();

                indiceAtual = (valorAtualFicha % 2 == 0) ? ((indiceAlunoEliminado <= listaDeAlunos.size() - 1) ? indiceAlunoEliminado : 0):
                        ((indiceAlunoEliminado - 1) % listaDeAlunos.size());
                listaDeAlunos.remove(indiceAlunoEliminado);


            }
            System.out.println("Vencedor(a): " + listaDeAlunos.get(0).getNome());
            listaDeAlunos.clear();

            numeroDeAlunos = Integer.parseInt(scanner.next());
        }

        scanner.close();

    }
}
