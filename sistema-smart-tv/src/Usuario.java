public class Usuario {


    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Apos alterar: " + smartTv.canal);

        smartTv.mudarCalnal(55);
        System.out.println("Apos alterar: " + smartTv.canal);



        System.out.println("Tv Ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual:  " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status da Tv: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status da Tv: " + smartTv.ligada);
    }
}
