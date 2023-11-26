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


  public Boolean verificarLetras(String userPalavra, String systemPalavra){

      char[] listUser = userPalavra.toCharArray();
      char[] listSystem = systemPalavra.toCharArray();

      String[] resultados = new String[listSystem.length];

      for (int i = 0; i < listSystem.length; i++){

        resultados[i] = "vermelho";

      }

      for (int i = 0; i < listSystem.length; i++) {
        char user = listUser[i];

        for (int j = 0; j < listUser.length; j++) {
            char system = listSystem[j];
            System.out.println(user + "    " + system);
            if (system == user) {

              resultados[i] = "amarelo";

              if (i == j){
                resultados[i] = "verde";
              }
                System.out.println(j + "    " + i);
                break;

            }
        }
          System.out.println("\n");
      }

      for (String result : resultados){

          System.out.println(result);

      }


      Boolean correto = true;

      for (String result : resultados){

        if (!Objects.equals(result, "verde")){
          correto = false;
          break;
        }

      }

      return correto;

  }

}