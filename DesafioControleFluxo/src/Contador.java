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
            	//chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            
            }catch (Exception e) {
            	System.out.println("O primeiro parâmetro deve ser maior que o segundo");
            }
        }
		
	}
	public static void contar(int parametroUm, int parametroDois ) throws Exception {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	    int teste = contagem;
        for (contagem = 1; contagem <=teste; contagem ++) {
            System.out.println("Imprimindo o número " + contagem);     

        }
    
    }
}