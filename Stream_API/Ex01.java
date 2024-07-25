package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    
    public static void main(String[] args) {
        
        List<String> items = new ArrayList<>();

        items.add("um");
        items.add("dois");
        items.add("tres");

        Stream<String> stream = items.stream();


    }
}
