package Termo;

import java.util.ArrayList;
import java.util.List;

public class Integrantes {

    private List<String> nome = new ArrayList<>();

    public String getIntegrante(int i) {
        return nome.get(i);
    }
    public List<String> getIntegrantes() {
        return nome;
    }

    public void setIntegrante(String nome) {
        this.nome.add(nome);
    }
}
