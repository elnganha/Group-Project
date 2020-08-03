package snake;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	static int speed = 0;
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Frame newFrame = new Frame();
		newFrame.Initialize(); //or refresh or reappear?
		VBox root = new VBox();
		Canvas aCanvas = new Canvas(350, 350);
		GraphicsContext graphic = aCanvas.getGraphicsContext2D();
		root.getChildren().add(aCanvas);
		Snake newSnake = new Snake();
		ObservableList<String> options = 
			    FXCollections.observableArrayList(
			        "Option 1",
			        "Option 2",
			        "Option 3"
			    );
		root.getChildren().addAll(new Label("Select level"), new ComboBox(options));

		
		
/**			AnimationTimer timer = new AnimationTimer() {
		
		@Override
			public void handle(long now) {
				newSnake.getBody();
			}
			
		}
*/
		
		
		Scene scene = new Scene(root, 400, 400);
/**		scene.addEventFilter(KeyEvent.KEY_PRESSED, key -> {
			 if(key.getCode() == KeyCode.A) snake.left();
		});
		
	*/	primaryStage.setScene(scene);
		primaryStage.setTitle("SNAKE FRENZY");
		primaryStage.show();
		
		
	}
	
	
	
	public static void main(String[] arg) {
		//Frame frame = new Frame();
		//frame.run();
		launch(arg);
	}
}
