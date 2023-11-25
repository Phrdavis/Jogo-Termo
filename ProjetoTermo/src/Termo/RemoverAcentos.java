package Termo;

import java.text.Normalizer;

public class RemoverAcentos {

    public String removerAcentos(String palavra){

        return Normalizer.normalize(palavra, Normalizer.Form.NFD).replaceAll("\\p{M}", "");

    }

}
