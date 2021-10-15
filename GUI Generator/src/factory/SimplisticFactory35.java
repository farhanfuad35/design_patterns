package factory;

// This factory produces only simplistic GUI elements
public class SimplisticFactory35 implements AbstractFactory35 {
    @Override
    public GUIElement35 createButton() {
        return new SimpleButton35();
    }

    @Override
    public GUIElement35 createText() {
        return new SimpleText35();
    }

    @Override
    public GUIElement35 createEditText() {
        return new SimpleEditText35();
    }
}
