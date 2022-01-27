package de.mfgames.MCSMT;

import java.util.Scanner;

public class Input {
    public static String getConsoleLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String getConsoleWord() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static Boolean getConsoleBool() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }
    public static Integer getConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static Double getConsoleDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public static Float getConsoleFloar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
    public static Byte getConsoleByte() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextByte();
    }
    public static Long getConsoleLong() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }
    public static Short getConsoleShort() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextShort();
    }

    //public static String


}
