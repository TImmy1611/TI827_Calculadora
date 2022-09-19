package calculator;

/**
 *
 * @author ftimoteo
 */
class Divide {

    static void dividir() {
        LeDados r = new LeDados();
        r.lerValores("Insira o Valor", "A dividir por");
        System.out.println("Quociente:" + (r.valor1 / r.valor2));
    }

}
