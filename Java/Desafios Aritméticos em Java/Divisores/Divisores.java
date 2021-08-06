import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisores {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		br.close();

		int menorValor = -1;

		if (C % A == 0) {
			for (int i = 1; i <= C / A; i++) {
				int n = A * i;
				if (n % B != 0 && D % n != 0 && C % n == 0) {
					menorValor = n;
					break;
				}
			}
		}
		System.out.println(menorValor);
	}
}

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class minhaClasse {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());

// //declare suas variaveis
//         int   = Integer.parseInt(st.nextToken());
//         int   = Integer.parseInt(st.nextToken());
//         int   = Integer.parseInt(st.nextToken());
//         int   = Integer.parseInt(st.nextToken());
//         br.close();   

//         //declare suas variaveis com o valor correto 
//         int  = 0       

// //continue o codigo
//         if ( %  ==  ){
//             int sqrt = (int)Math.sqrt(  );
//             for(int i =  ; i <=  ; i = ){                
//                 if (   ){
                    
//                 }         
//                 if (i == sqrt){
//                      = ;
                
//                 }
//             }
//         }
//         System.out.println();        
//     }    
// }