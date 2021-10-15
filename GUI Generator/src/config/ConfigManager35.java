package config;

import factory.AbstractFactory35;
import factory.GUIElement35;
import javafx.scene.control.Control;
import java.io.File;
import java.util.ArrayList;

// Singleton Design Pattern

// This class is responsible for reading the config, preparing and serving the elements to the Window Manager
public class ConfigManager35 {
    private AbstractFactory35 factory;
    private static ConfigManager35 configManager;
    private int currentElement=0;
    private final ArrayList<GUIElement35> guiFactories = new ArrayList<>();
    private String fileName;

    // A private constructor. Required for Singleton Design Pattern
    private ConfigManager35(){

    }

    // A public getInstance method. This ensures that only one instance of the Class is created throughout the program
    public static ConfigManager35 getInstance(){
        if(configManager == null){
            configManager = new ConfigManager35();
        }
        return configManager;
    }

    // Main method of this class
    public void execute() {
        File config = new File(fileName);
        XMLReader35 xmlReader;


        // Adapter Design Pattern
        // The program is by default capable of handling XML config files. However,
        // If the config file is of text format, it uses the Adapter and converts it into a XML file and then proceed normally
        if(fileName.contains(".txt"))
            xmlReader = new TextReaderAdapter35(config);
        else
            xmlReader = new XMLReader35(config);

        // Initiate config reading
        xmlReader.loadConfig();
    }

    // Called by XMLHandler to add elements to the elements array
    public void addElementBuilder(GUIElement35 guiElement){
        this.guiFactories.add(guiElement);
    }

    // Return true if more items remain to be displayed
    public boolean hasMoreItems(){
        return currentElement != guiFactories.size();
    }

    // Returns the next element to the WindowManager
    public Control nextElement(){
        if(currentElement == guiFactories.size())
            return null;
        else{
            return guiFactories.get(currentElement++).getElement();
        }
    }

    // Sets the config file name. Called by the Main class
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // Sets the GUIFactory as the user desired from the Main class
    public void setFactory(AbstractFactory35 factory) {
        this.factory = factory;
    }

    // Return the factory. Called by XMLHandler to create Elements
    public AbstractFactory35 getFactory() {
        return factory;
    }
}
