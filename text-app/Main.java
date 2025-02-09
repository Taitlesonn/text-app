import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;


import elementy.*;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        //Layout
        BorderPane borderPane = new BorderPane();

        //Scena
        Scene scene = new Scene(borderPane, 1000, 900);

        //Pasek górny
        HBox pas_g = new HBox(10);
        //Psek po lewej
        VBox pas_l = new VBox(10);
        //Centrum
        TextArea center = new TextArea();


        //Ustawianie w panelu
        borderPane.setLeft(pas_l);
        borderPane.setTop(pas_g);
        borderPane.setCenter(center);

        //Zarządzanie
        Wersje w = new Wersje();
        Centerap centerap = new Centerap(center, w);
        Left left = new Left(pas_l, centerap, w);
        Top top = new Top(pas_g, centerap, left, w);



        stage.setTitle("text");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}