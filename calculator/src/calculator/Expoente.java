
package calculator;

class Expoente {

    static void potencia() {
        LeDados r=new LeDados();
        r.lerValores();
        System.out.println("Potência:"+Math.pow(r.valor1,r.valor2));
    }
    
}
