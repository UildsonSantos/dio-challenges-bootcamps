import java.util.Scanner;

// 0 - pedra
// 1 - spock
// 2 - papel
// 3 - lagarto
// 4 - tesoura

public class PedraPapelTesouraLagartoSpock {
  
  public static void main(String[] args) {
	  
    Scanner scanner = new Scanner(System.in);
    int qtdCasos = scanner.nextInt();
    String[] escolhas;
    scanner.nextLine();

    for (int i = 0; i < qtdCasos; i++)
    {
      escolhas = scanner.nextLine().split(" ");

      var escolhaDeFernanda = nomeParaNumero(escolhas[0]);
      var escolhaDeMarcia = nomeParaNumero(escolhas[1]);

      resultadoDoJogo(escolhaDeFernanda, escolhaDeMarcia);
    }

      scanner.close();
    
	}



  public static int nomeParaNumero(String nome){

    if(nome.equals("pedra")) {
      return 0;
    }
    else if(nome.equals("spock")) {
      return 1;
    }
    else if (nome.equals("papel")) {
      return 2;
    }
    else if (nome.equals("lagarto")) {
      return 3;
    }
    else if (nome.equals("tesoura")) {
      return 4;
    }
    else {
      return -1;
    }
  }
    

  public static void resultadoDoJogo(int numeroDeFernanda, int numeroDeMarcia){
      
    // var diferenca = (numeroDeFernanda - numeroDeMarcia) % 5;
    var diferenca = Math.floorMod((numeroDeFernanda - numeroDeMarcia), 5);
    System.out.println(diferenca +" : diff");
    if(diferenca == 0)
      System.out.println("empate");
    else if(diferenca ==1 || diferenca == 2)
        System.out.println("fernanda");
    else if(diferenca == 3 || diferenca == 4)
      System.out.println("marcia");

  }
}