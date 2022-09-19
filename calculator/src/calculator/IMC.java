package calculator;

class IMC {

    static void calculaIMC() {
        System.out.println("PESO/(ALTURA*ALTURA)");
        LeDados r = new LeDados();
        r.lerValores("Insira o peso em Kg", "Insira a altura em metros");
        float IMC = (r.valor1 / (r.valor2 * r.valor2));
        System.out.println("IMC:" + IMC);
        if (IMC < 18.5) {
            System.out.println("Abaixo do Peso");
        } else if (IMC < 24.9) {
            System.out.println("Peso Normal");
        } else if (IMC < 29.9) {
            System.out.println("SobrePeso");
        } else if (IMC < 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (IMC < 39.9) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("*Game Over");
        }
    }
}
