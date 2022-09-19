package calculator;

/**
 *
 * @author ftimoteo
 */
class Subtrai {

    static void subtrair() {
        LeDados r = new LeDados();
        r.lerValores("A Diferença entre","Com");
        System.out.println("Diferença:" + (r.valor1 - r.valor2));
    }

}
