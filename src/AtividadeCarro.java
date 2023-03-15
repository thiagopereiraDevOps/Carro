public class AtividadeCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Siena";
        carro1.cor = "Branco";
        carro1.velocidade = 40.0;
        carro1.status();
        carro1.frear();
        carro1.acelerar();
        carro1.acenderFarol();
        System.out.println(" ");

        Carro carro2 = new Carro();
        carro2.modelo = "Corsa";
        carro2.cor = "Prata";
        carro2.velocidade = 1.0;
        carro2.status();
        carro2.acenderFarol();
        carro2.frear();
        carro2.acelerar();
        System.out.println(" ");

        Carro carro3 = new Carro();
        carro3.modelo = "Audi";
        carro3.cor = "Amarelo";
        carro3.velocidade = 80.0;
        carro3.status();
        carro3.acenderFarol();
        carro3.frear();
        carro3.acelerar();
        System.out.println(" ");
    }
}
