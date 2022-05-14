package DepoPrg;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class item {

    static int id = 1000;
    static Map<Integer, String> itemMap = new HashMap<>();
    public item() throws IOException {

        List<String> line = Files.lines(Paths.get("src/Util/depo.txt")).
                map(String::toUpperCase).//akısdaki datalar buyuk harfe update edildi
                        collect(Collectors.toList());
        for (var each: line
        ) {
            itemMap.put(id,each);
            id++;
        }

    }







}
