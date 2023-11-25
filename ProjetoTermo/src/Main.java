import Termo.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

//        System.out.println("Diretório atual: " + System.getProperty("user.dir"));

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


        //Criando variaveis
        String userWord = null;
        Boolean acerto = true;
        int caracteres = 5;
        int tentativas = 5;
        Boolean resultado = null;


        //Gerando uma palavra aleatória
        filtrar.filtrar(br, list);
        String aleatoria = palavraAleatoria.gerarPalavraAleatoria(rand, list);
        String palavra = removerAcentos.removerAcentos(aleatoria);
        System.out.println(palavra);


        exibir.inicio();
        exibir.apresetacao();

        //Solicitando palavra ao usuário e fazendo verificação de quantidade de letras para atualização de tentativas

        while (tentativas > 0){

            while (tentativas > 0 || acerto) {
                System.out.printf("\nDigite uma palavra de %d caracteres: ", caracteres);
                userWord = scan.nextLine();
                verificacao = verificar.verificarTamanho(userWord, tentativas);

                for (Map.Entry<Integer, Boolean> entry : verificacao.entrySet()){
                    tentativas = entry.getKey();
                    acerto = entry.getValue();
                }
            }

            if (!acerto){
                break;
            }

            resultado = verificar.verificarPalavra(userWord, palavra, acerto);

            if(resultado){
                break;
            }


            verificar.verificarLetras(userWord, palavra);

        }


        br.close();

    }
}