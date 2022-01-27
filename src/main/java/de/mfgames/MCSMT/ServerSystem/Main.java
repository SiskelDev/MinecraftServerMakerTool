package de.mfgames.MCSMT.ServerSystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void Start(){
        Path a = Paths.get("./config.json");
        String b = "";

        try {
            b = Files.readString(a);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (b != "") {

        } else {
            Configurator.firstConfig();
        }
    }

    public static void Stop() {

    }
}
