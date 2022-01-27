package de.mfgames.MCSMT;

public class Main {
    public static int getinput;


    public static void main(String[] args) {

        System.out.println("What do you want to do?");
        System.out.println("1. Build Spigot Jar");
        System.out.println("2. Start Server System");
        getinput = Input.getConsoleInt();

        if (getinput == 1) {
            System.out.println("1");
        } else if (getinput == 2) {
            de.mfgames.MCSMT.ServerSystem.Main.Start();
        }
    }
}
