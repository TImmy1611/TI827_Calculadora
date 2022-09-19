package calculator;

class Soma {

    static void somar() {
        LeDados r = new LeDados();
        r.lerValores("A soma de","Com");
        System.out.println("Soma:" + (r.valor1 + r.valor2));
    }

}
