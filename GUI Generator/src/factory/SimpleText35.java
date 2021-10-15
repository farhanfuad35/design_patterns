package factory;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class SimpleText35 implements GUIElement35 {
    private final TextField textField;

    // Default values for simplistic design style
    private final static String value = "Text";
    private final static int defaultX = 450;
    private final static int defaultY = 200;

    // Constructor sets default simplistic values
    public SimpleText35() {
        textField = new TextField();
        textField.setLayoutX(defaultX);
        textField.setLayoutY(defaultY);
        textField.setText(value);
        textField.setEditable(false);
    }

    @Override
    public Control getElement() {
        return textField;
    }

    @Override
    public void setValue(String value) {
        textField.setText(value);
    }

    @Override
    public void setX(int x) {
        textField.setLayoutX(x);
    }

    @Override
    public void setY(int y) {
        textField.setLayoutY(y);
    }

    @Override
    public void setColor(String color) {
        textField.setStyle(textField.getStyle() + " -fx-background-color: " + color + ";");
    }

    @Override
    public void setFont(String font) {
        textField.setFont(Font.font(font, 10));
    }

    @Override
    public void setFontSize(String size) {
        textField.setStyle(textField.getStyle() + " -fx-font-size: " + size + ";");
    }
}
