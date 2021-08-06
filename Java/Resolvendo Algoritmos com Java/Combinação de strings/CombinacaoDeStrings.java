import java.util.Scanner;

public class CombinacaoDeStrings {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String resultado;
		int maior = -1;
		int tam;
		int N = leitor.nextInt();
		leitor.nextLine();
		for (int i = 0; i < N; i++) {
			resultado = "";
			String[] strings = leitor.nextLine().split(" ");

			if (strings[0].length() > strings[1].length()) {
				tam = strings[1].length();
				maior = 0;
			} else {
				tam = strings[0].length();
				maior = 1;
			}
			for (int j = 0; j < tam; j++) {
				resultado += strings[0].charAt(j);
				resultado += strings[1].charAt(j);
			}
			resultado += strings[maior].substring(tam);
			System.out.println(resultado);
		}
		leitor.close();
	}

}
