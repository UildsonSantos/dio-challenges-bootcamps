
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MelhorAmigoDoPablo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();
        List<ParticipanteSim> participantesSim = new ArrayList<>();
        List<String> participantesNao = new ArrayList<>();
    
        while (!linha.equals("FIM")) {
            
          var entrada = linha.split(" ");

          if (entrada[1].equals("SIM")){
            var participanteExistente = participantesSim.stream()
            .filter(p -> p.getNome().equals(entrada[0]))
            .findFirst()
            .orElse(null);
            
            if(participanteExistente == null) {
              participantesSim.add(new ParticipanteSim(entrada[0], entrada[1].length(), participantesSim.size()));
            }
           
            }else{
              participantesNao.add(entrada[0]);
            }
           
            linha = br.readLine();
          
        }
    
        
        List<ParticipanteSim> escolhido = participantesSim.stream()
        .sorted(Comparator.comparing(ParticipanteSim::getqtdLetras)
        .thenComparing(ParticipanteSim::getOrdemInscricao))
        .collect(Collectors.toList());
    
        
        List<ParticipanteSim>  participantesSimOrdNome = participantesSim.stream()
        .sorted(Comparator.comparing(ParticipanteSim::getNome))
        .collect(Collectors.toList());

        List<String>  participantesNaoOrdNome = participantesNao.stream()
        .sorted(Comparator.comparing(String::toString))
        .collect(Collectors.toList());
      
        
        participantesSimOrdNome.forEach(p -> {
          System.out.println(p.getNome());
        });

        participantesNaoOrdNome.forEach(System.out::println);
        
    
        System.out.println("");
        System.out.println("Amigo do Pablo:");
        System.out.println(escolhido.get(0).getNome());
    }
    
    public static class ParticipanteSim {
        private String nome;
        private int qtdLetras;
        private int ordemInscricao;
        
        public ParticipanteSim(String nome, int qtdLetras, int ordemInscricao) {
          this.nome = nome;
          this.qtdLetras = qtdLetras;
          this.ordemInscricao = ordemInscricao;
        }

        public String getNome() {
          return nome;
        }
              
        public int getqtdLetras() {
          return qtdLetras;
        }
        
        
        public int getOrdemInscricao() {
          return ordemInscricao;
        }
    
    }
}