import java.lang.reflect.Parameter;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        int parametroUm, parametroDois;

        System.out.println("\n*** Contador ***");
        System.out.print("Informe o primeiro parâmetro: ");
        parametroUm = scanner.nextInt();
        System.out.print("Informe o segundo parâmetro: ");
        parametroDois = scanner.nextInt();       
        
        try {
            contar(parametroUm, parametroDois);    
        } catch (Exception e) {
            System.out.println("O segundo parâmentro deve ser maior que o primeiro!");
        }        
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametroUm > parametroDois) {
            System.out.println("Exception: ");
            throw new ParametrosInvalidosException();
            
        } else {
            int contagem = parametroDois - parametroUm;
            
            System.out.println("\nImprimindo os números referente a diferença entre o segundo e o primeiro parâmetro: ");
            for (int i = 1; i <= contagem; i++) {
                System.out.println(i);                
            }
        }               
    }
}
