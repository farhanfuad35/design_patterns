package config;

import java.io.*;
import java.util.ArrayList;

// This class is used to read *.txt type config
public class TextReader35 {
    private final File file;
    public TextReader35(File file){
        this.file = file;
    }

    // Returns an array of string. Each index contains each line of the config file
    public ArrayList<String> readText() throws NullPointerException {
        ArrayList<String> lines = new ArrayList<>();
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));

            while( (str = br.readLine()) !=null){
                lines.add(str);
            }

            return lines;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
