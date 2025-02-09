package elementy;

import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Centerap {
    private final TextArea in;
    private final Wersje w;
    public int id = 1;


    public Centerap(TextArea text, Wersje w){
        this.in = text;
        this.in.setStyle("-fx-control-inner-background: grey; -fx-text-fill: white;");
        this.in.setFont(Font.font(18));
        this.w = w;

    }

    public void load_text(String pat, int type, int id){
        in.clear();
        switch (type){
            case 0 -> {
                //Otwieranie pliku do odczytu
                try {
                    String zawartosc = Files.readString(Path.of(pat));
                    in.setText(zawartosc);
                    w.add_wersja(zawartosc, this.id);
                    //this.id++;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            case 1 -> {
                in.setText(pat);
                //this.id++;
                w.add_wersja(pat, this.id);
            }
        }
    }

    public byte[] get_text(){
        this.id++;
        return this.in.getText().getBytes();
    }



}
