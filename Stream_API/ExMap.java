package Stream_API;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ExMap {
    
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();

        map.put("key1", "abacate");
        map.put("key2", "melancia");
        map.put("key3", "manga");

        Stream<String> stream = map.values().stream();
    }
}
