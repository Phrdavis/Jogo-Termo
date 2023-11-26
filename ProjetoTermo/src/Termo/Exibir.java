package Termo;

import java.io.PrintStream;
import java.util.List;
import java.util.Objects;

public class Exibir {

    private static final String ANSI_GREEN = "\u001B[42m";
    private static final String ANSI_RESET = "\u001B[0m";

    public PrintStream inicio(){

        System.out.printf("%60s\n", "------------------------------------------------------------------------------");
        System.out.printf("%60s\n", "                         BEM VINDO AO " + ANSI_GREEN + " JOGO DO TERMO "+ ANSI_RESET +"                                ");
        System.out.printf("%60s\n", "------------------------------------------------------------------------------");

        return null;
    }


    public PrintStream integrantes(List<String> integrantes, List<String> colors){
        System.out.printf("%60s\n\n", "                                 INTEGRANTES                                  ");

        int color = 0;

        for (String nome : integrantes){

            int tamanhoNome = nome.length();
            int calculo = (80 - tamanhoNome)/2;
            for (int i = 1; i < calculo; i++){
                System.out.printf("%s", " ");
            }
            System.out.printf("%s", colors.get(color) + nome + colors.get(colors.size() - 1));
            for (int i = 1; i < calculo; i++){
                System.out.printf("%s", " ");
            }
            System.out.println("");

            color++;
        }
        return null;
    }

    public PrintStream apresetacao(int tentativas){




        System.out.printf("%60s\n", "------------------------------------------------------------------------------");
        System.out.printf("%60s\n\n", "                               Nº DE TENTATIVAS                               ");
        System.out.printf("%29s%2s%29s\n", "                                ", tentativas, " Tentativas                                ");

        System.out.printf("%60s\n\n", "------------------------------------------------------------------------------");
        System.out.printf("%60s\n", "                                 VAMOS COMEÇAR?                                 ");

        return null;

    }

    public PrintStream tentativas(int tentativas){

        System.out.printf("%60s\n", "------------------------------------------------------------------------------");
        System.out.printf("%60s\n", "                           Nº DE TENTATIVAS RESTANTES                         ");
        System.out.printf("%29s%2s%29s\n", "                                ", tentativas, " Tentativas                                ");

        return null;
    }

    public PrintStream pedirPalavra(int caracters){

        System.out.printf("\n%29s%2s%29s\n", "                      DIGITE UMA PALAVRA DE ", caracters, " CARACTERES:                           ");

        return null;

    }

    public PrintStream resultado(String[] resultado, String palavra, List<String> colors){


        System.out.printf("%60s\n\n", "------------------------------------------------------------------------------");

        int i= 0;
        char[] palavraList = palavra.toCharArray();

        System.out.printf("%5s", "                      ");
        for (String result : resultado){

            String colorFinal = colors.get((colors.size() - 1));

            if (result.equals("vermelho")){

                System.out.printf("%15s", colors.get(2) + palavraList[i] + colorFinal);

            } else if (result.equals("amarelo")) {

                System.out.printf("%15s", colors.get(1) + palavraList[i] + colorFinal);
            }else{

                System.out.printf("%15s", colors.get(0) + palavraList[i] + colorFinal);
            }
            i++;
        }
        System.out.println("\n");


        return null;

    }

    public PrintStream fimDoJogo(Boolean resultado){

        if (resultado){

            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "  PARABENS JOGADOR! VOCÊ ACERTOU A PALAVRA SECRETA, TOMA AQUI UM BISCOITO :)  ");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");

        }else{

            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "         POH MEU AMIGO NÃO DESSA VEZ, MAS CALMA! NÃO SE DESANIMA NÃO          ");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "          NATAL E ANO NOVO TA CHEGANDO E SABE O QUE ISSO SIGNIFICA??          ");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");
            System.out.printf("%60s\n", "        E FICAMOS POR AQUI PESSOAL, NOS VEMOS NOS PROXIMOS CAPITULOS !!       ");
            System.out.printf("%60s\n", "------------------------------------------------------------------------------");

        }

        return null;
    }



}
