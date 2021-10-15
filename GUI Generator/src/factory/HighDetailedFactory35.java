package factory;

// This factory produces only high detailed GUI elements
public class HighDetailedFactory35 implements AbstractFactory35 {
    @Override
    public GUIElement35 createButton() {
        return new HDButton35();
    }

    @Override
    public GUIElement35 createText() {
        return new HDText35();
    }

    @Override
    public GUIElement35 createEditText() {
        return new HDEditText35();
    }
}
