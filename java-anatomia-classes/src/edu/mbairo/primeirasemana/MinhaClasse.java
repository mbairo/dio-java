package edu.mbairo.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Marcos";
        String ultimoNome = "Bairo";

        // String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
        // System.out.println(nomeCompleto);

        // Ou Direto
        System.out.println(nomeCompleto(primeiroNome, ultimoNome));
    }

    public static String nomeCompleto (String primeiroNome, String ultimoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(ultimoNome); 
    }   
}
