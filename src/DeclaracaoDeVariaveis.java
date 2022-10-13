public class DeclaracaoDeVariaveis {
    public static void main(String[] args) {

        //declarar variáveis do primeiro jeito
        System.out.println("Aqui vamos declarar variáveis");

        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("A variável a é: " + a + ", a variável b é: " + b + ", a variável c é: " + c + ".");
        System.out.println("A soma entre as variáveis é: " + a + b + c + ".");

        // declarar variáveis do segundo jeito
        System.out.println("também podemos declarar variáveis assim: ");

        int x = 10, y = 100, z = 1000;

        System.out.println("A variável x é: " + x + ", e a variável y é: " + y);
        System.out.println("A multiplicação entre as variáveis (xyz) é: " + x * y * z);

        // declarar variáveis desses mesmos jeitos, mas como strings
        System.out.println("Com strings funciona basicamente do mesmo jt");

        String texto1 = "Olá, ", texto2 = "mundo";

        System.out.println(texto1 + texto2);

    }
}
