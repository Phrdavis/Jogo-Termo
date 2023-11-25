package Termo;

import java.util.List;
import java.util.Random;

public class GerarPalavraAleatoria {

  public String gerarPalavraAleatoria(Random rand, List<String> list) {

    int indiceAleatorio = rand.nextInt(list.size());

    String palavra = list.get(indiceAleatorio);

    return palavra;
  }

}