package factory;

import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class HDEditText35 implements GUIElement35 {
    // Actual JavaFX EditText instance
    private final TextField editText;

    // Default initial position of the element
    private final static int defaultX = 450;
    private final static int defaultY = 200;

    private String color = "white";
    private String fontSize = "15px";
    private String font = "Nato Sans";

    // Constructor sets the default High-detailed values
    public HDEditText35() {
        editText = new TextField();
        editText.setLayoutX(defaultX);
        editText.setLayoutY(defaultY);
        editText.setPrefWidth(400);
        editText.setFont(Font.font("Nato Sans"));
        editText.setPromptText("Please enter you First Name");
        updateStyle();
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
        fontSize = size;
        updateStyle();
    }

    // Finally sets the CSS style when all the variables are set by the XMLHandler
    private void updateStyle(){
        editText.setStyle(
                "-fx-background-color: " + color + ";" +
                " -fx-background-insets: 0;" +
                " -fx-text-fill: black;" +
                " -fx-border-width: 2 ;" +
                " -fx-border-color: black;" +
                " -fx-font-family: " + font + ";" +
                " -fx-font-size: " + fontSize + ";");
    }
}
