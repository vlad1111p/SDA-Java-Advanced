package com.sda.inputoutput;

import java.io.*;

//C:\Users\vlad1\Documents\SDA-Java-Advanced\src\com\sda\inputoutput\Main.java
public class Main {
    public static void main(String[] args) throws IOException {

//        File absoluteFile = new File("C:\\Users\\vlad1\\Documents\\SDA-Java-Advanced\\src\\com\\sda\\inputoutput\\myFile.txt");
//        File relativeFile = new File("myFile.txt");
        secondExample();
        firstExample();
        thirdExample();
        thirdExample();
        firstExample();

    }

    public static void firstExample() throws IOException
    {
        File file = new File("C:\\Users\\vlad1\\Documents\\SDA-Java-Advanced\\src\\com\\sda\\inputoutput\\myFile.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
        {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null)
            {
                System.out.println(fileLine);
            }
        }
    }

    public static void secondExample() throws IOException
    {
        File file = new File("C:\\Users\\vlad1\\Documents\\SDA-Java-Advanced\\src\\com\\sda\\inputoutput\\myFile.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file)))
        {
            String fileLine = "file line";
            bufferedWriter.write(fileLine);
        }
    }

    public static void thirdExample() throws IOException
    {
        File file = new File("C:\\Users\\vlad1\\Documents\\SDA-Java-Advanced\\src\\com\\sda\\inputoutput\\myFile.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true)))
        {
            String fileLine = "\nappended file line";
            bufferedWriter.write(fileLine);
        }
    }
}
