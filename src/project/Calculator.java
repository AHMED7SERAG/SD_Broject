package project;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
public class Calculator {
@Override
    public void start(Stage stage) {
GridPane pane =new GridPane();
TextField Cal=new TextField();
Button p1=new Button("1");
pane.getChildren().add(Cal);
p1.minWidth(500);
pane.setPadding(new Insets(20,20,20,20));
pane.setHgap(5);
pane.setVgap(5);
pane.add(p1,0, 1);  
pane.add(new Button("2"),1, 1);
Scene scene=new Scene(pane,400,200);

stage.setTitle("Calculator");
stage.setScene(scene);
stage.show();}
	public static void main(String[] args) {
		Application.launch(args);
		

	}

}
