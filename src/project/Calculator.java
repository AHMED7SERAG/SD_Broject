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
Button p2=new Button("2");
Button p3=new Button("3");
Button p4=new Button("4");
Button p5=new Button("5");
Button p6=new Button("6");
Button p7=new Button("7");
Button p8=new Button("8");
Button p9=new Button("9");
Button p0=new Button("0");
Button pdot=new Button(".");
Button pcl=new Button("C");
Button plus=new Button("+");
Button miuns=new Button("-");
Button multi=new Button("*");
Button div=new Button("/");
Button prce=new Button("%");
p1.setMinWidth(50);p7.setMinWidth(50);plus.setMinWidth(50);
p2.setMinWidth(50);p8.setMinWidth(50);miuns.setMinWidth(50);
p3.setMinWidth(50);p9.setMinWidth(50);multi.setMinWidth(50);
p4.setMinWidth(50);p0.setMinWidth(50);div.setMinWidth(50);
p5.setMinWidth(50);pdot.setMinWidth(50);prce.setMinWidth(50);
p6.setMinWidth(50);pcl.setMinWidth(50);
pane.add(Cal,0,0,6,1);
pane.setPadding(new Insets(20,20,20,20));
pane.setHgap(5);
pane.setVgap(5);
pane.addRow(1,p1,p2,p3,plus,prce);    
pane.addRow(2,p4,p5, p6,miuns);    
pane.addRow(3,p7,p8, p9,multi);
pane.addRow(4,p0,pdot,pcl,div);    

Scene scene=new Scene(pane,350,200);

stage.setTitle("Calculator");
stage.setScene(scene);
stage.show();
    }
	public static void main(String[] args) {
    	Application.launch(args);
    }

}
