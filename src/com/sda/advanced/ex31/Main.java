package com.sda.advanced.ex31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Path newPath = Paths.get("C:/Users/vlad1/Documents/SDA-Java-Advanced/src/com/sda/advanced/ex31/ex31");
        Map<String, Integer> wordsMap = new HashMap<String, Integer>();
        Files.lines(newPath).filter(line -> line != null && !line.isEmpty()).forEach(line -> {
            String[] words = line.split(" ");
            for (String word : words) {
                wordsMap.putIfAbsent(word, 0);
                int counter = wordsMap.get(word);
                wordsMap.put(word, ++counter);
            }
        });
        System.out.println(wordsMap);
        Path newPath1 = Paths.get("C:/Users/vlad1/Documents/SDA-Java-Advanced/src/com/sda/advanced/ex31/test.txt");
        newPath1.toFile().createNewFile();
        List<String> table=new ArrayList<>();
        table.add("------------words--------------");
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            table.add("--------------------------");
            table.add(entry.getKey() + "|" + entry.getValue());
        }
        Files.write(newPath1, table);
    }

}
