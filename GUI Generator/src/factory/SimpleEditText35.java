package factory;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class SimpleEditText35 implements GUIElement35 {
    private final TextField editText;

    // Default initial position of the element
    private final static int defaultX = 450;
    private final static int defaultY = 200;

    // Constructor sets default simplistic values
    public SimpleEditText35() {
        editText = new TextField();
        editText.setLayoutX(defaultX);
        editText.setLayoutY(defaultY);
    }

    @Override
    public Control getElement() {
        return editText;
    }

    @Override
    public void setValue(String value) {
        editText.setText(value);
    }

    @Override
    public void setX(int x) {
        editText.setLayoutX(x);
    }

    @Override
    public void setY(int y) {
        editText.setLayoutY(y);
    }

    @Override
    public void setColor(String color) {
        editText.setStyle(editText.getStyle() + " -fx-background-color: " + color + ";");
    }

    @Override
    public void setFont(String font) {
        editText.setFont(Font.font(font, 10));
    }

    @Override
    public void setFontSize(String size) {
        editText.setStyle(editText.getStyle() + " -fx-font-size: " + size + ";");
    }
}
