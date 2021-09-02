package com.sda.advanced.ex33;

//Write a program that will display all photos (.png, .jpg) in a given directory and subdirectories.

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path startPath = Paths.get("C:/Users/vlad1/Pictures");
        listImages(startPath);
    }

    public static void listImages(Path path) {
        if (path.toFile().isDirectory()) {

            File[] files = path.toFile().listFiles();
            if (files != null) {
              for(File file : files) {
                  listImages(file.toPath());
              }
            } else {
                System.out.println(path + "Directory is empty");
            }

        } else {
            if (path.toFile().getName().endsWith(".png") || path.toFile().getName().endsWith(".jpg")) {

                System.out.println(path);
           }
        }


    }

}
