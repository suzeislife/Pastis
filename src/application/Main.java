package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	
	private PastisController ctrl;
	private PastisModel model;
	
	@Override
	public void start(Stage primaryStage) {
		
		model = new  PastisModel();
		ctrl = new PastisController(model);
		
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("ViewPastis.fxml"));
			// BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 800, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
