package Termo;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class Filtro {

  public List<String> filtrar(BufferedReader br, List<String> list) throws IOException{

    String linha;
    while ((linha = br.readLine()) != null) {
      if (linha.length() == 5) {
        list.add(linha);
      }
    }

    return list;

  }

}