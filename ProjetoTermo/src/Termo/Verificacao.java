package Termo;

import java.util.*;

public class Verificacao {

  public Map<Integer, Boolean> verificarTamanho(String palavra, Integer tentativas) {

    Map<Integer, Boolean> result = new HashMap<Integer, Boolean>();

    if (palavra.length() == 5) {

      tentativas -= 1;
      result.put(tentativas, false);

      return result;


    }else {

      result.put(tentativas, true);
      return result;

    }



  }

  public Boolean verificarLetras(String userPalavra, String systemPalavra, Boolean acerto) {

    if (!acerto) {
      if (Objects.equals(userPalavra, systemPalavra)) {

        System.out.println("Parabens jogador! Você acertou a palavra secreta, toma aqui um biscoito :)");

        return true;

      } else {

        System.out.println("Que pena, não foi dessa vez");

        return false;

      }
    }

    return false;

  }

}