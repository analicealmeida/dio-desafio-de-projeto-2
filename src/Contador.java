
import java.util.Scanner;

public class Contador extends ParametrosInvalidosException {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch ( ParametrosInvalidosException exception ) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
    

            //inacabado...
        }
        
	}
}