import Termo.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        //Criando Objetos
        File arquivo = new File("src/palavras.txt");
        List<String> list = new ArrayList<>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        Filtro filtrar = new Filtro();
        GerarPalavraAleatoria palavraAleatoria = new GerarPalavraAleatoria();
        Verificacao verificar = new Verificacao();
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        Map<Integer, Boolean> verificacao = new HashMap<Integer, Boolean>();
        RemoverAcentos removerAcentos = new RemoverAcentos();
        Exibir exibir = new Exibir();
        Colors colors = new Colors();
        Integrantes integrantes = new Integrantes();


        //Criando variaveis
        String userWord = null;
        Boolean acerto = true;
        int caracteres = 5;
        int tentativas = 7;
        Boolean resultado = null;

        integrantes.setIntegrante("Alexandre Butzke");
        integrantes.setIntegrante("Davi Pinheiro de Souza");
        integrantes.setIntegrante("Gabriel Madalena dos Santos");

        //Gerando uma palavra aleatória
        filtrar.filtrar(br, list, caracteres);
        String aleatoria = palavraAleatoria.gerarPalavraAleatoria(rand, list);
        String palavra = removerAcentos.removerAcentos(aleatoria).toUpperCase();

        //Gerando Cores para console
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_RESET = "\u001B[0m";

        //Adicionando cores a lista
        colors.setColor(ANSI_GREEN);     // -> Verde
        colors.setColor(ANSI_YELLOW);    // -> Amarelo
        colors.setColor(ANSI_RED);       // -> Verde

        colors.setColor(ANSI_RESET);     // -> Encerra as cores


        //Chamando apresentação do jogo
        exibir.inicio();
        exibir.integrantes(integrantes.getIntegrantes(), colors.getColors());
        exibir.apresetacao(tentativas);;



        //Solicitando palavra ao usuário e fazendo verificação de quantidade de letras para atualização de tentativas
        while (tentativas > 0) {

            while (acerto) {
                exibir.pedirPalavra(caracteres);
                userWord = scan.nextLine().toUpperCase();
                verificacao = verificar.verificarTamanho(userWord, tentativas);

                for (Map.Entry<Integer, Boolean> entry : verificacao.entrySet()) {
                    tentativas = entry.getKey();
                    acerto = entry.getValue();
                }
            }

            resultado = verificar.verificarPalavra(userWord, palavra, acerto);



            Map<Boolean, String[]> resultadoFinal = verificar.verificarLetras(userWord, palavra);

            Boolean resultadoBoolean = null;
            String[] resultadoLista = new String[0];

            for (Map.Entry<Boolean, String[]> entry : resultadoFinal.entrySet()) {

                resultadoBoolean = entry.getKey();
                resultadoLista = entry.getValue();

            }


            exibir.resultado(resultadoLista, userWord, colors.getColors());


            if (resultadoBoolean || tentativas == 0) {
                exibir.fimDoJogo(resultado);
                break;
            } else {
                acerto = true;
            }

            exibir.tentativas(tentativas);
            ;

        }


        br.close();

    }
}