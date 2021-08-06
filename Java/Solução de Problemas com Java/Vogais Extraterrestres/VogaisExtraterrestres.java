import java.util.Scanner;

public class VogaisExtraterrestres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alfabetoAlienigena;
        String frase;
        int quantidade = 0;
        
        while (scanner.hasNextLine()) {
            quantidade = 0;
            alfabetoAlienigena = scanner.nextLine();
            frase = scanner.nextLine();
    
            for (int i = 0; i < alfabetoAlienigena.length() ; i++) {
                for (int j = 0; j < frase.length(); j++) {
                    if (frase.charAt(j) == alfabetoAlienigena.charAt(i)) {
                        quantidade++;
                    }
                }
            }
            
            System.out.println(quantidade);
        }
        scanner.close();
    }
}