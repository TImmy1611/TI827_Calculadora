
package calculator;

import java.util.Scanner;


public class Calculator {

    public static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
    char op;
    do{
    System.out.println("--- Menu Calculadora ---");
    System.out.println("+ -Soma");
    System.out.println("- -Subtração");
    System.out.println("*- Multiplicação");
    System.out.println("/ -Divisão");
    System.out.println("e -Expoente");
    System.out.println("i -IMC");
    System.out.println("s - Sair");
    System.out.println("Selecione o operador");
    op = ler.next().charAt(0);
    switch(op){
        case 's': Expoente.potencia();break;
        case 'S': break;
        case '+': Soma.somar();break;
        case '-': Subtrai.subtrair();break;
        case '*': Multiplica.multiplicar();break;
        case '/': Divide.dividir();break;
        case 'e': Expoente.potencia();break;
        case 'E': Expoente.potencia();break;
        case 'i': IMC.calculaIMC();break;
        case 'I': IMC.calculaIMC();break;
        default: System.out.println("Operador Incorreto");
        
    }
    }while(op!='s' && op!='S');
    
}
}
