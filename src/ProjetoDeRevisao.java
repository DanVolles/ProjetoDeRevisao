public class ProjetoDeRevisao {
    // Método main
    public static void main(String[] args) {

        // Método (println) para printar uma linha de texto em java
        System.out.println("Este é um programa desenvolvido como uma revisão " +
                "de grande parte do que já aprendi da linguagem Java!");

        // Método (print) para printar uma linha de texto em java sem pular uma linha
        System.out.print("Com o método print posso printar um texto sem pular linha");

        // Para printar números não precisamos das aspas
        System.out.println(15000);
        System.out.println(20 + 50);

        // variáveis
        System.out.println("Aqui nós podemos ver os tipos de variáveis que compõem Java");

        // String guarda texto
        String texto = "Exemplo de texto";
        System.out.println(texto);

        // int guarda números inteiros
        int x = 20;
        System.out.println(x);

        // float e double guardam números reais
        float y = 225.90f;
        double z = 349.90;
        System.out.println(y);
        System.out.println(z);

        // char guarda caracteres únicos, como A, B, C, D etc.
        char caractere = 'C';
        System.out.println(caractere);

        // boolean guarda valores booleanos (verdadeiro ou falso)
        boolean souLindo = true;
        boolean minhaNoivaTbm = true;
        boolean souInfeliz = false;
        System.out.println(souLindo);
        System.out.println(minhaNoivaTbm);
        System.out.println(souLindo && minhaNoivaTbm);
        System.out.println(minhaNoivaTbm || souInfeliz);

    }
}
