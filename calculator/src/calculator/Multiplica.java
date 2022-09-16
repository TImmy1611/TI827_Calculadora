
package calculator;

/**
 *
 * @author ftimoteo
 */
class Multiplica {

    static void multiplicar() {
        LeDados r=new LeDados();
        r.lerValores();
        System.out.println("Produto:"+(r.valor1*r.valor2));
    }
    
}
