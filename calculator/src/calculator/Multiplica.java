package calculator;

/**
 *
 * @author ftimoteo
 */
class Multiplica {

    static void multiplicar() {
        LeDados r = new LeDados();
        r.lerValores("Insira o valor","A multiplicar por");
        System.out.println("Produto:" + (r.valor1 * r.valor2));
    }

}
