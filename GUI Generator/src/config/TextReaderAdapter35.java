package config;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// The Adapter class required to adapt .txt config to .xml config
// Adapter Strategy
// This class extends the default XMLReader class
public class TextReaderAdapter35 extends XMLReader35 {
    public TextReaderAdapter35(File file) {
        super(file);
    }

    // Method overridden
    @Override
    public void loadConfig() {
        TextReader35 textReader = new TextReader35(config);
        try {
            ArrayList<String> lines = textReader.readText();
            String fileName = "config_adapted";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            writer.write("<config>\n");                                 // Add Parent tag start

            // RegEX used to replace particular patterns and convert the text into xml
            for(String line : lines) {
                line = "<" + line + "\" />";                                // Adds anchor tags
                line = line.replaceAll(",", "\"");        // Replace , with "
                line = line.replaceFirst("\"", "");       // Delete the first " created inaccurately by the previous line
                line = line.replaceAll(": ", "=\"");      // Replace all ': ' with '="'
                writer.write(line + "\n");                              // Write to the config_adapted file
            }
            writer.write("</config>");                                  // Add parent tag ending
            writer.close();

            // Use Java SAX Parser Library to parse the XML
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLHandler35 xmlHandler = new XMLHandler35();
            File file = new File(fileName);
            saxParser.parse(file, xmlHandler);

        } catch (NullPointerException | IOException | ParserConfigurationException | SAXException exception){
            exception.printStackTrace();
        }

    }
}
