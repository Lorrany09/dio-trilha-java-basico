import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroDois = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroUm = scanner.nextInt();
 
            try {
                contar(parametroUm, parametroDois);
            
            }catch (Exception e) {
            	System.out.println("O primeiro parâmetro deve ser maior que o segundo");
            }
        }
		
	}
	public static void contar(int parametroUm, int parametroDois ) throws Exception {
		
	    int contagem = parametroDois - parametroUm;
	    int teste = contagem;
            for (contagem = 1; contagem <=teste; contagem ++) {
                System.out.println("Imprimindo o número " + contagem);     

        }
    
    }
}
