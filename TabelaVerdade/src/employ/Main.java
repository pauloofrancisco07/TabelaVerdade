package employ;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.fxml.*;
import javafx.scene.*;

public class Main extends Application {
	
	private static Stage prymaryStage;
	private static BorderPane mainLayout;
	
	@Override
	public void start(Stage primaryStage) {
		this.prymaryStage = primaryStage;
		this.prymaryStage.setTitle("Tabela Verdade");
		showMainView();
	}
	
	public static void showMainView() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		try {
			mainLayout = loader.load();
		} catch (IOException e) {
			System.out.println("Erro Na Pagina");
			e.printStackTrace();
		}
		
		Scene scene = new Scene(mainLayout);
		prymaryStage.setScene(scene);
		prymaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
