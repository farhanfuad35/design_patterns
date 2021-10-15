package config;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

// This class initiates the XML reading procedures
public class XMLReader35 {
    final File config;

    public XMLReader35(File file){
        config = file;
    }

    public void loadConfig() {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLHandler35 xmlHandler = new XMLHandler35();
            saxParser.parse(config, xmlHandler);
        } catch (SAXException | IOException | ParserConfigurationException exception) {
            exception.printStackTrace();
        }
    }
}
