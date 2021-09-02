package com.sda.advanced.ex32;
import java.io.*;
public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
    Computer computer = new Computer("30000","20000","12345","12134","124556");

    writeObject(computer);
    Computer computer2 = readObject("C:/Users/vlad1/Documents/SDA-Java-Advanced/src/com/sda/advanced/ex32/myFile.txt");
        System.out.println(computer2);
    }
    public static <T> void writeObject(T object) throws IOException
    {
        File file = new File("C:/Users/vlad1/Documents/SDA-Java-Advanced/src/com/sda/advanced/ex32/myFile.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            objectOutputStream.writeObject(object);
        }
    }

    public static <T> T readObject(String filePath) throws IOException, ClassNotFoundException
    {
        File file = new File(filePath);

        T object;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream =
                     new ObjectInputStream(fileInputStream))
        {
            object = (T) objectInputStream.readObject();
        }

        return object;
    }
}
