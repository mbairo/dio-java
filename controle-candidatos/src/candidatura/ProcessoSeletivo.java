package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("\n*** Processo Seletivo ***");
        
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO", "GUSTAVO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};        
        String [] arrayCandidatosSelecionados = new String[5];
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;

        while (candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou de salário: R$" +  salarioPretendido);

            if (salarioPretendido <= salarioBase && candidatosSelecionados <5) {

                arrayCandidatosSelecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;                
            }

            candidatoAtual++;     
        }

        
  
        System.out.println("\n\n*** Lista dos candidatos selecionados ***");
        for (String candidato : arrayCandidatosSelecionados) {            
                if (candidato != null) {
                System.out.println(candidato);                 
                }
            
        }

        System.out.println("\n\n*** Entrando em contato com os candidatos selecionados ***");

        for (String candidatoSelecionado : arrayCandidatosSelecionados) {

            if (candidatoSelecionado != null) {
                entrandoEmContato(candidatoSelecionado);    
            }        
        }
    }

        static void entrandoEmContato (String candidatoSelecionado) {
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if (continuarTentando) {
                    tentativasRealizadas ++;
                } 
            } while (continuarTentando && tentativasRealizadas < 3);
            
            if (atendeu) {
                System.out.println("CONSEGUIMOS CONTATO COM " + candidatoSelecionado + " na " + tentativasRealizadas + "° tentativa");
            } else {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidatoSelecionado + " - NÚMERO MÁXIMO DE TENTATIVAS REALIZADAS: " + tentativasRealizadas);
                
            }
        }


        //método auxiliar
        static boolean atender() {
            return new Random().nextInt(3) == 1;
        }



    // Salario randomico dos candidatos
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000;

        if (salarioPretendido >= 3500) {
            System.out.println("Terceira opção:");
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");            
        } else if (salarioPretendido > salarioBase){
            System.out.println("Segunda opção:");
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else  {
            System.out.println("Primeira opção:");
            System.out.println("LIGAR PARA O CANDIDATO");
        }
    }
}
