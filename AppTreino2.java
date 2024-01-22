import java.util.Scanner;
import java.util.Locale;


public class AppTreino2 {
    public static void main(String[] args) {
      
        Scanner scanner = new  Scanner(System.in).useLocale(Locale.US);

            System.out.println("CALCULADORA");

            
                System.out.println("Adição digite:  + ");
                System.out.println("Subtração digite:  - ");
                System.out.println("Multiplicação digite:  X ");
                System.out.println("Divisão digite:  / ");

            System.out.println("Escolha uma operação: ");
            String usuario = scanner.next();
           
            System.out.println("Digite seu primeiro numero? ");
                int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo numero");
                int numero2 = scanner.nextInt();


            switch (usuario) {
                case "+":{
                    int soma = numero1+numero2;
                    System.out.println("O resultado da sua soma é: "+soma);
                    break;
                }
                case "-":{
                    int soma = numero1-numero2;
                    System.out.println("O resultado da sua subtração é:  "+soma);
                    break;
                }
                case "x":{
                    int soma = numero1*numero2;
                    System.out.println("O resultado da sua multiplicação é:  "+soma);
                    break;
                }
                case "/":{
                    int soma = numero1/numero2;
                    System.out.println("O resultado da sua divisão é:  "+soma);
                }
                    
                    break;
            
                default:
                    break;
            }
                
        
    }
}
