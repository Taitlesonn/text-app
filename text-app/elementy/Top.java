package elementy;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


import java.nio.file.Paths;
import java.util.Optional;


public class Top {
    public String path_to_f;
    private final Wersje w;


    public Top(HBox paske, Centerap app, Left l, Wersje w){
        this.w = w;
        Button file = new Button("open file");
        file.setOnAction(e ->{

            TextInputDialog dialog = new TextInputDialog("Podaj  scieżkę do pliku");
            dialog.setTitle("Path");
            dialog.setHeaderText("Wpisz ścieżkę: ");
            dialog.setContentText("Path: ");

            Optional<String> wynik = dialog.showAndWait();
            wynik.ifPresent(path -> {
                Path sc = Path.of(path);

                if (Files.exists(sc)){
                    this.path_to_f = path;
                    app.load_text(path, 0, app.id);
                    l.add_info(app.id);


                }else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Informacja");
                    alert.setHeaderText("Błąd");
                    alert.setContentText("Nie ma takiego pliku :(");
                    alert.showAndWait(); // Czeka, aż użytkownik zamknie okno
                }

            });
        });

        Button seve = new Button("seve");
        seve.setOnAction(e -> {
            if(path_to_f != null){
                try {
                    Files.write(Paths.get(this.path_to_f), app.get_text());
                    l.add_info(app.id);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }else {
                TextInputDialog dialog = new TextInputDialog("Podaj  scieżkę do pliku");
                dialog.setTitle("Path");
                dialog.setHeaderText("Wpisz ścieżkę: ");
                dialog.setContentText("Path: ");

                Optional<String> wynik = dialog.showAndWait();
                wynik.ifPresent(ent ->{
                    Path sc = Path.of(ent);
                        this.path_to_f = ent;
                        try {
                            Files.createFile(sc);
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    try {
                        Files.write(Paths.get(this.path_to_f), app.get_text());
                        l.add_info(app.id);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                });
            }

        });



        paske.getChildren().addAll(file, seve);

    }
}
