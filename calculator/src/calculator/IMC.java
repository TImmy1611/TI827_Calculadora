
package calculator;


class IMC {

    static void calculaIMC() {
        LeDados r=new LeDados();
        r.lerValores();
        float IMC = (r.valor1/(r.valor2*r.valor2));
        System.out.println("IMC:"+IMC);
        if (IMC<18.5){
            System.out.println("Abaixo do Peso");
        }
        if (IMC>18.5 && IMC<24.9){
            System.out.println("Peso Normal");
        }
        if (IMC>25 && IMC<29.9){
            System.out.println("SobrePeso");
        }
        if (IMC>30 && IMC<34.9){
            System.out.println("Obesidade Grau I");
        }
        if (IMC>35 && IMC<39.9){
            System.out.println("Obesidade Grau II");
        }
        if (IMC>=40){
            System.out.println("*Game Over");
        }
    }
    
}
