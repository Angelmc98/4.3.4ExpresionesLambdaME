/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionlambdamouseevent;




import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author amedi
 */
public class ExpresionLambdaMouseEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 250);
        
        Text text = new Text(80,120,"Este texto se tiene que mover");
        pane.getChildren().add(text);
        
        text.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent Event){
                text.setX(Event.getX());
                text.setY(Event.getY());
                
            }
        });
       
        
        
    
        
        
        primaryStage.setTitle("LambdaMouseEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
