package calculadora;
import java.util.Scanner;
public class Calculadora {
 public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro valor:");
        num1 = input.nextInt();

        System.out.println("Segundo valor");
        num2 = input.nextInt();
     
        Scanner op = new Scanner(System.in);

        System.out.println("Operação a realizar:");
        System.out.println("+,-,/,*");
        operation = op.next();

        if (operation.equals("+"))
        {
            System.out.println("Resultado: " + (num1 + num2));
        }
        if  (operation.equals("-"))
        {
            System.out.println("Resultado:" + (num1 - num2));
        }

        if (operation.equals("/"))
        {
            System.out.println("Resultado:" + (num1 / num2));
        }
        if (operation.equals("*"))
        {
            System.out.println("Resultado:" + (num1 * num2));
        }

    }
        
}


