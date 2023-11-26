package Termo;

import java.util.ArrayList;
import java.util.List;

public class Colors {


    private List<String> color = new ArrayList<>();

    public String getColor(int i) {
        return color.get(i);
    }
    public List<String> getColors() {
        return color;
    }

    public void setColor(String color) {
        this.color.add(color);
    }
}
