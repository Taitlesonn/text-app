package elementy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wersje {
    private List<String> wersja = new ArrayList<>(Collections.nCopies(256, ""));

    private int il_wersji = 0;

    public void add_wersja(String text, int id){
        wersja.set(id, text);
        il_wersji++;
    }

    public String get_text(int id){
        return wersja.get(id);
    }
}
