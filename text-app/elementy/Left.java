package elementy;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.scene.control.ChoiceDialog;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Left {
    private final VBox pasek;
    private final Centerap app;
    private final Wersje w;

    public Left(VBox left, Centerap app, Wersje w1){
        this.pasek = left;
        this.app = app;
        this.w = w1;
    }

    public void add_info(int id) {
        LocalTime teraz = LocalTime.now();
        String godzina = teraz.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        Button info = new Button("nr zmiany: " + id + " o godzinie: " + godzina);

        info.setOnAction(e -> {
            List<String> opcje = Arrays.asList("Tak", "Nie");
            ChoiceDialog<String> wybor = new ChoiceDialog<>("Tak", opcje);
            wybor.setTitle("Wczytywanie wersji");
            wybor.setHeaderText("Czy na pewno chcesz wczytać tę wersję?");
            wybor.setContentText("Wybierz opcję:");

            Optional<String> wynik = wybor.showAndWait();
            wynik.ifPresent(opcja -> {
                if (opcja.equals("Tak")) {
                    app.load_text(w.get_text(id), 1, id);
                }
            });
        });

        pasek.getChildren().add(info);
    }

}
