package Termo;

import java.io.PrintStream;
import java.util.List;

public class Exibir {

    public PrintStream inicio(){

        System.out.printf("%60s\n", "------------------------------------------------------------------------------");
        System.out.printf("%60s\n", "                                JOGO DO TERMO                                 ");
        System.out.printf("%60s\n", "------------------------------------------------------------------------------");

        return null;
    }

    public PrintStream apresetacao(List<String> integrantes, int tentativas){


        System.out.printf("%60s\n\n", "                                 INTEGRANTES                                  ");

        for (String nome : integrantes){

            int tamanhoNome = nome.length();
            int calculo = (80 - tamanhoNome)/2;
            for (int i = 1; i < calculo; i++){
                System.out.printf("%s", " ");
            }
            System.out.printf("%s", nome);
            for (int i = 1; i < calculo; i++){
                System.out.printf("%s", " ");
            }
            System.out.println("");

        }

        System.out.printf("%60s\n", "------------------------------------------------------------------------------");
        System.out.printf("%60s\n\n", "                               Nº DE TENTATIVAS                               ");
        System.out.printf("%29s%2s%29s\n", "                                ", tentativas, " Tentativas                                ");

        System.out.printf("%60s\n\n", "------------------------------------------------------------------------------");
        System.out.printf("%60s\n", "                                 VAMOS COMEÇAR?                                 ");

        return null;

    }



}
