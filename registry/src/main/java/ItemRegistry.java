import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {
    private Map<Long, Item> cacheData = new HashMap<>();
    {
        cacheData.put(1L, new Item(1L, "Item1"));
        cacheData.put(2L, new Item(2L, "Item2"));

    }

    public Item get(Long id) {
        if (cacheData.containsKey(id))
            return cacheData.get(id).clone();
        else
            return null;
    }

    public void add(Item item) {

    }
}
