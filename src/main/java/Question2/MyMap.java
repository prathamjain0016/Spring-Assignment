package Question2;
import java.util.Map;

public class MyMap {
private Map<String, String > map;
    
    public MyMap(Map<String, String> map) {
        this.map = map;
    }
    
    public void printMap() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}