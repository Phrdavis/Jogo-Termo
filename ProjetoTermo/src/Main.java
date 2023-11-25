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
        String userWord = null;
        Boolean acerto = true;
        Map<Integer, Boolean> verificacao = new HashMap<Integer, Boolean>();
        int MaxTentativas = 5;
        int tentativas = MaxTentativas;
        Boolean resultado = null;


        //Gerando uma palavra aleatória
        filtrar.filtrar(br, list);
        String palavra = palavraAleatoria.gerarPalavraAleatoria(rand, list);
        System.out.println(palavra);



        //Solicitando palavra ao usuário e fazendo verificação de quantidade de letras para atualização de tentativas
        while (tentativas > 0 || acerto) {
            System.out.printf("\nDigite uma palavra de %d caracteres: ", MaxTentativas);
            userWord = scan.nextLine();
            verificacao = verificar.verificarTamanho(userWord, tentativas);

            for (Map.Entry<Integer, Boolean> entry : verificacao.entrySet()){
                tentativas = entry.getKey();
                acerto = entry.getValue();

                System.out.println(tentativas );
                System.out.println(acerto);
            }
            resultado = verificar.verificarLetras(userWord, palavra, acerto);

            if(resultado){
                break;
            }
        }


        br.close();

    }
}