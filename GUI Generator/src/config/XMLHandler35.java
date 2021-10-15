package config;

import factory.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// This is a class required by the SAXParser library
// This class instructs how to parse the XML
public class XMLHandler35 extends DefaultHandler {
    // String constants used in the config file

    final static String BUTTON = "Button";
    final static String TEXT_FIELD = "TextField";
    final static String EDIT_TEXT = "EditText";
    final static String VALUE = "value";
    final static String COLOR = "color";
    final static String FONT = "font";
    final static String FONT_SIZE = "fontSize";
    final static String CONFIG = "config";
    final AbstractFactory35 abstractFactory = ConfigManager35.getInstance().getFactory();
    GUIElement35 guiElement;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        // Create ElementBuilder
        switch (qName) {
            case BUTTON -> guiElement = abstractFactory.createButton();
            case TEXT_FIELD -> guiElement = abstractFactory.createText();
            case EDIT_TEXT -> guiElement = abstractFactory.createEditText();
        }

        // Read Attributes
        if(attributes.getValue(VALUE)!=null){
            String value = attributes.getValue(VALUE);
            guiElement.setValue(value);
        }
        if(attributes.getValue("X")!=null){
            int x = Integer.parseInt(attributes.getValue("X"));
            guiElement.setX(x);
        }
        if(attributes.getValue("Y")!=null){
            double y = Double.parseDouble(attributes.getValue("Y"));
            guiElement.setY(Integer.parseInt(attributes.getValue("Y")));
        }
        if(attributes.getValue(COLOR)!=null){
            String color = attributes.getValue(COLOR);
            guiElement.setColor(color);
        }
        if(attributes.getValue(FONT)!=null){
            String font = attributes.getValue(FONT);
            guiElement.setFont(font);
        }
        if(attributes.getValue(FONT_SIZE)!=null){
            String size = attributes.getValue(FONT_SIZE);
            guiElement.setFontSize(size);
        }
    }

    // Add the created element to the Elements array at the end of the tag
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(!qName.equals(CONFIG)) {
            ConfigManager35 configManager = ConfigManager35.getInstance();
            configManager.addElementBuilder(guiElement);
        }
    }
}
