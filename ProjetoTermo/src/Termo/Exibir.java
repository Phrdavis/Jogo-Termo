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

    public PrintStream apresetacao(List<String> integrantes){

        System.out.printf("%60s\n", "                                 INTEGRANTES                                  ");

        for (String nome : integrantes){

            int tamanhoNome = nome.length();
            int calculo = (60 - tamanhoNome)/2;
            for (int i = 1; i < tamanhoNome; i++){
                System.out.println();
            }
            System.out.printf("%60s\n", "                               Alexandre Butzke                               ");

        }

        System.out.printf("%60s\n", "                               Alexandre Butzke                               ");
        System.out.printf("%60s\n", "                            Davi Pinheiro de Souza                            ");
        System.out.printf("%60s\n", "                          Gabriel Madalena dos Santos                         ");

        return null;

    }


}
