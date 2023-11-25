import Termo.Filtro;
import Termo.GerarPalavraAleatoria;
import Termo.Verificacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

//        System.out.println("Diretório atual: " + System.getProperty("user.dir"));

        File arquivo = new File("src/palavras.txt");
        List<String> list = new ArrayList<>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        Filtro filtrar = new Filtro();
        GerarPalavraAleatoria palavraAleatoria = new GerarPalavraAleatoria();
        Verificacao verificar = new Verificacao();

        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);

        filtrar.filtrar(br, list);
        String palavra = palavraAleatoria.gerarPalavraAleatoria(rand, list);

        System.out.println(palavra);

        Map<Integer, Boolean> verificacao = new HashMap<Integer, Boolean>();
        String userWord = null;
        Boolean acerto = true;
        int tentativas = 5;

        while (tentativas > 0 && acerto) {
            System.out.println("\nDigite uma palavra de 5 caracteres: ");
            userWord = scan.nextLine();
            verificacao = verificar.verificarTamanho(userWord, tentativas);

            for (Map.Entry<Integer, Boolean> entry : verificacao.entrySet()){
                tentativas = entry.getKey();
                acerto = entry.getValue();
            }
        }

        Boolean resultado = verificar.verificarLetras(userWord, palavra);





        br.close();

    }
}