package de.mfgames.MCSMT.ServerSystem;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Configurator {
    public static Object getConfig(String a) {
        String content;
        Object returnContent;
        JSONObject output = new JSONObject();

        JSONParser parser = new JSONParser();

        Path b = Paths.get(a);

        try {
            content = Files.readString(b);
            returnContent = parser.parse(content);
            output = (JSONObject) returnContent;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return output;
    }

    public static void setConfig(JSONObject a, String path) throws IOException {
        StringWriter out = new StringWriter();
        a.writeJSONString(out);

        Path pathpath = Paths.get(path);

        try {
            Files.writeString(pathpath, out.toString(), StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void firstConfig() {
        
    }
}
