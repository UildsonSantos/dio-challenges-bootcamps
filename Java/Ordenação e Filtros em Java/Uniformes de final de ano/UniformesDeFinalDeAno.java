import java.util.*;

public class UniformesDeFinalDeAno {
    private String nome;
    private String tamanho;
    private String cor;

    public UniformesDeFinalDeAno(String nome, String tamanho, String cor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return cor + " " + tamanho + " " + nome;
    }

    public static void main(String[] args) {

        String inputNome, inputCor, inputTamanho;
        String[] aux;

        Scanner scanner = new Scanner(System.in);
        int inputQtd = scanner.nextInt();
        scanner.nextLine();

        List<UniformesDeFinalDeAno> uniformesAlunos = new ArrayList<>();

        for (int i = 0; i < inputQtd; i++) {
            inputNome = scanner.nextLine();
            aux = scanner.nextLine().split(" ");
            inputCor = aux[0];
            inputTamanho = aux[1];

            uniformesAlunos.add(new UniformesDeFinalDeAno(inputNome, inputTamanho, inputCor));

        }

        inputQtd = scanner.nextInt();

        if (inputQtd == 0) {
            scanner.close();
        }

        uniformesAlunos.sort(Comparator.comparing(UniformesDeFinalDeAno::getCor).reversed()
                .thenComparing(UniformesDeFinalDeAno::getTamanho).reversed()
                .thenComparing(UniformesDeFinalDeAno::getNome));

        uniformesAlunos.forEach(System.out::println);
    }
}
