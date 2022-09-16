
package calculator;

/**
 *
 * @author ftimoteo
 */
class Subtrai {

    static void subtrair() {
        LeDados r=new LeDados();
        r.lerValores();
        System.out.println("Diferença:"+(r.valor1 - r.valor2));
    }
    
}
