package factory;

import javafx.geometry.Pos;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class HDText35 implements GUIElement35 {
    // Actual JavaFX TextField instance
    private final TextField textField;

    // Default values for simplistic design style
    private final static int defaultX = 450;
    private final static int defaultY = 200;
    private final static String value = "Text";

    private String color = "#eeeeee";
    private String fontSize = "18px";
    private String font = "Roboto Light";


    // Constructor sets the default High-detailed values
    public HDText35() {
        textField = new TextField();
        textField.setLayoutX(defaultX);
        textField.setLayoutY(defaultY);
        textField.setText(value);
        textField.setPrefWidth(400);
        textField.setEditable(false);
        textField.setAlignment(Pos.CENTER);
        textField.setFont(Font.font("Roboto Light"));
        updateStyle();
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
        this.color = color;
        updateStyle();
    }

    @Override
    public void setFont(String font) {
        this.font = font;
        updateStyle();
    }

    @Override
    public void setFontSize(String size) {
        this.fontSize = size;
        updateStyle();
    }

    // Finally sets the CSS style when all the variables are set by the XMLHandler
    private void updateStyle(){
        textField.setStyle(
                " -fx-background-color: " + color + ";" +
                " -fx-background-insets: 0;" +
                " -fx-text-fill: black;" +
                " -fx-font-family: " + font + ";" +
                " -fx-font-size: " + fontSize + ";");
    }
}
