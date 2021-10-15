package factory;

import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.text.Font;

public class SimpleButton35 implements GUIElement35 {
    private final Button button;

    // Default values for simplistic design style
    private final static String value = "Button";
    private final static int defaultX = 450;
    private final static int defaultY = 200;

    // Constructor sets default simplistic values
    public SimpleButton35() {
        button = new Button();
        button.setLayoutX(defaultX);
        button.setLayoutY(defaultY);
        button.setText(value);
        button.setDefaultButton(true);
    }

    @Override
    public Control getElement() {
        return button;
    }

    @Override
    public void setValue(String value) {
        button.setText(value);
    }

    @Override
    public void setX(int x) {
        button.setLayoutX(x);
    }

    @Override
    public void setY(int y) {
        button.setLayoutY(y);
    }

    @Override
    public void setColor(String color) {
        button.setStyle(button.getStyle() + " -fx-background-color: " + color + ";");
    }

    @Override
    public void setFont(String font) {
        button.setFont(Font.font(font, 10));
    }

    @Override
    public void setFontSize(String size) {
        button.setStyle(button.getStyle() + " -fx-font-size: " + size + ";");
    }
}
