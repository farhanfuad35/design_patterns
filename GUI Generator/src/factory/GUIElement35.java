package factory;

import javafx.scene.control.Control;

// The common interface for different GUI elements
public interface GUIElement35 {
    Control getElement();
    void setValue(String value);
    void setX(int x);
    void setY(int y);
    void setColor(String color);
    void setFont(String font);
    void setFontSize(String size);
}
