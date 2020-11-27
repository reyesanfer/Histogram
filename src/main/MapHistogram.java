
package main;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author FernandoSanfielReyes
 */
public class MapHistogram implements Histogram{

    private Map<String, Integer> map;

    public MapHistogram() {
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Integer get(String item) {
        return map.get(item);
    }

    @Override
    public Integer put(String item, Integer value) {
        return map.put(item, value);
    }
    
    
    
}
