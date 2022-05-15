package Util;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class tools {

    public static List<String> DosyadanOku(String path) throws IOException {
      return  Files.lines(Paths.get(path)).
                map(String::toUpperCase).collect(Collectors.toList());
    }
    public static void DosyayaYaz(String path,String text) throws IOException {
        try {
            List<String> line = new ArrayList<>();
            for (var each: tools.DosyadanOku(path)
            ) {
                line.add(each);
            }

            FileWriter fileWriter = new FileWriter(path);
            for (var each: line
            ) {
                fileWriter.write(each+"\n");
            }
            fileWriter.write(text+"\n");
            fileWriter.close();
        } catch (IOException e) {
            // Exception handling
        }
    }
}
