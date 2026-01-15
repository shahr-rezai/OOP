import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MovePoint extends Application {

    // Coordinates of the point
    private int x = 0;
    private int y = 0;

    @Override
    public void start(Stage stage) {

        // Label to show current (x, y)
        Label pointLabel = new Label("(" + x + ", " + y + ")");

        // Buttons for x
        Button incX = new Button("Increase x");
        Button decX = new Button("Decrease x");

        // Buttons for y
        Button incY = new Button("Increase y");
        Button decY = new Button("Decrease y");

        // When user clicks increase x
        incX.setOnAction(e -> {
            x++;
            pointLabel.setText("(" + x + ", " + y + ")");
        });

        // When user clicks decrease x
        decX.setOnAction(e -> {
            x--;
            pointLabel.setText("(" + x + ", " + y + ")");
        });

        // When user clicks increase y
        incY.setOnAction(e -> {
            y++;
            pointLabel.setText("(" + x + ", " + y + ")");
        });

        // When user clicks decrease y
        decY.setOnAction(e -> {
            y--;
            pointLabel.setText("(" + x + ", " + y + ")");
        });

        // Layouts for x and y buttons
        HBox xButtons = new HBox(10, incX, decX);
        HBox yButtons = new HBox(10, incY, decY);

        xButtons.setAlignment(Pos.CENTER);
        yButtons.setAlignment(Pos.CENTER);

        // Main layout
        VBox root = new VBox(20, pointLabel, xButtons, yButtons);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Move Point");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
