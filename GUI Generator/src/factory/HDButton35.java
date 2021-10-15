package factory;

import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.text.Font;

// High Detailed Button Class
public class HDButton35 implements GUIElement35 {
    // Actual JavaFX Button instance
    private final Button button;

    // Default initial position of the element
    private final static int defaultX = 450;
    private final static int defaultY = 200;

    // Default values for simplistic design style
    private final static String value = "High Detailed Button";

    private String color = "#aaaaaa";
    private String fontSize = "20px";
    private String font = "Roboto Light";

    // Constructor sets the default High-detailed values
    public HDButton35() {
        button = new Button();
        button.setLayoutX(defaultX);
        button.setLayoutY(defaultY);
        button.setText(value);
        button.setWrapText(true);
        button.setFont(Font.font("monospace"));
        updateStyle();
    }


    public Control getElement() {
        return button;
    }


    public void setValue(String value) {
        button.setText(value);
    }


    public void setX(int x) {
        button.setLayoutX(x);
    }


    public void setY(int y) {
        button.setLayoutY(y);
    }


    public void setColor(String color) {
        this.color = color;
        updateStyle();
    }


    public void setFont(String font) {
        this.font = font;
        updateStyle();
    }


    public void setFontSize(String size) {
        this.fontSize = size;
        updateStyle();
    }

    // Finally sets the CSS style when all the variables are set by the XMLHandler
    private void updateStyle(){
        button.setStyle("-fx-background-color: " + color + ";" +
                " -fx-background-radius: 30;" +
                " -fx-background-insets: 0;" +
                " -fx-text-fill: black;" +
                " -fx-border-color: black;" +
                " -fx-border-radius: 30;" +
                " -fx-border-width: 2;" +
                " -fx-font-family: " + font + ";" +
                " -fx-font-size: " + fontSize + ";");
    }
}
