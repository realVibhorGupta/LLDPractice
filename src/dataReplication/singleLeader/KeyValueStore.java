package dataReplication.singleLeader;

import java.util.HashMap;
import java.util.Map;

class KeyValueStore {
    private  Map<String, String> data = new HashMap<>();

    public String get(String key) {
        return data.get(key);
    }

    public void put(String key, String value) {
        data.put(key, value);
    }
}





