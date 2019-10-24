package ppa;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    protected Circle leftCircle;

    @FXML
    protected Circle rightCircle;

    protected boolean leftPosition;

    public void initialize() {
        leftCircle.setFill(Color.RED);
        rightCircle.setFill(Color.BLUE);
        leftPosition = true;
        
        EventHandler<MouseEvent> l  = new EventHandler<MouseEvent>() {
        	@Override
        	public void handle(MouseEvent e) {
        		leftCircle.setFill(Color.GREEN);
        	}
        };
        leftCircle.addEventHandler(MouseEvent.MOUSE_CLICKED, l);
        
        EventHandler<MouseEvent> r  = new EventHandler<MouseEvent>() {
        	@Override
        	public void handle(MouseEvent e) {
        		rightCircle.setFill(Color.GREEN);
        	}
        };
        	rightCircle.addEventHandler(MouseEvent.MOUSE_CLICKED, r);
        
        
    }

    public void changeColor(ActionEvent actionEvent) {
        Paint leftFill = leftCircle.getFill();
        if (leftPosition) {
            leftCircle.setFill(Color.BLUE);
            rightCircle.setFill(Color.RED);
            leftPosition = false;
        } else {
            leftCircle.setFill(Color.RED);
            rightCircle.setFill(Color.BLUE);
            leftPosition = true;
        }
    }
}