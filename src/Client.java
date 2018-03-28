import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Client extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        VBox pane = new VBox();
        TextArea textArea = new TextArea();
        TextField textField = new TextField();
        Button send = new Button();
        send.setText("Send");
        textArea.setPrefColumnCount(50);
        textArea.setPrefRowCount(5);
        textArea.setPrefColumnCount(5);
        pane.getChildren().addAll(textArea, textField, send);

        Scene scene = new Scene(pane, 300,300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
