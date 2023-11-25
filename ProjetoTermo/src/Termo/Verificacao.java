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

  public Boolean verificarPalavra(String userPalavra, String systemPalavra, Boolean acerto) {

    if (!acerto) {
      if (Objects.equals(userPalavra, systemPalavra)) {

        System.out.println("Parabens jogador! Você acertou a palavra secreta, toma aqui um biscoito :)");

        return true;

      }
        return false;

    }else{

      return false;

    }


  }


  public void verificarLetras(String userPalavra, String systemPalavra){

      char[] listUser = userPalavra.toCharArray();
      char[] listSystem = systemPalavra.toCharArray();

      String[] resultados = new String[listSystem.length];

      for (int i = 0; i < listSystem.length; i++){

        resultados[i] = "vermelho";

      }

      for (int i = 0; i < listSystem.length; i++) {
        System.out.println(i);
        char user = listUser[i];

        for (int j = i; j < listUser.length; j++) {
          System.out.println(j);
            char system = listSystem[j];
            if (system == user) {

              resultados[i] = "amarelo";

              if (i == j){
                resultados[j] = "verde";
              }

              break;

            }
        }
        System.out.println(resultados[i]);
    }

  }

}