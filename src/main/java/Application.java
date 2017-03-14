import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Created by philippepeter on 13/03/2017.
 */
public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Sort");

        StackPane.setAlignment(btn, Pos.BOTTOM_CENTER);

        TagBar tagBar = new TagBar();

        btn.setOnAction((ActionEvent event) -> {
            FXCollections.sort(tagBar.getTags());
        });

        Button btn2 = new Button("add \"42\"");
        btn2.setOnAction(evt -> {
            if (!tagBar.getTags().contains("42")) {
                tagBar.getTags().add("42");
            }
        });

        VBox root = new VBox();
        root.getChildren().addAll(tagBar, btn, btn2);
        root.setPrefSize(300, 400);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
