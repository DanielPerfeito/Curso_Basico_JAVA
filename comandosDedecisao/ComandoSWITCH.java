// Este código verifica em qual posição o atleta terminou a corrida, e com base nisso, determina se ele sobe ao pódio, qual a posição do pódio e qual o premio a ser recebido.

package cursoJava.comandosDedecisao;

public class ComandoSWITCH {

    public static void main (String[] args){

       // OPRERADORES LÓGICOS EM JAVA:
        // == Igual a...
        // != Diferente de...
        // > Maior que...
        // < Menor que...
        // >= Maior ou igual a...
        // <= Menor ou igual a...
        // OBS: O retorno de qualquer comparação realizada por esses operadores
        // retornará os valores booleanos TRUE ou FALSE.

        int posicao=6; // posição de chegada do corredor.

        switch(posicao){

           case 1:
                System.out.println("Primeiro lugar. Medalha de ouro!");
                break;

            case 2:
                System.out.println("Segundo lugar. Medalha de prata!");
                break;
            
            case 3:
                System.out.println("Terceiro lugar. Medalha de bronze!");
                break;

            case 4: case 5: case 6:
                System.out.println("Não subiu ao podio. Premio de participação.");
                break;

            default:
                System.out.println("Não subiu ao podio. Sem premio.");
                break;
        }
    }
}