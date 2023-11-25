package Termo;

import java.util.*;

public class Verificacao {

  public Map<Integer, Boolean> verificarTamanho(String palavra, Integer tentativas) {

    Map<Integer, Boolean> result = new HashMap<Integer, Boolean>();

    if (palavra.length() == 5) {

      result.put(tentativas, false);

      return result;

    } else if (palavra.length() < 5) {

      System.out.println("Palavras com tamanho insficiente!");
      tentativas -= 1;

      result.put(tentativas, true);
      return result;

    }else if (palavra.length() > 5) {

      System.out.println("Palavras com tamanho excedente!");
      tentativas -= 1;

      result.put(tentativas, true);
      return result;

    }

    result.put(tentativas, true);
    return result;

  }

  public Boolean verificarLetras(String userPalavra, String systemPalavra) {

      if(Objects.equals(userPalavra, systemPalavra)){

        System.out.println("Parabens jogador! Você acertou a palavra secreta, toma aqui um biscoito :)");

        return true;

      }else {

        System.out.println("Que pena, não foi dessa vez");

        return false;

      }

  }

}