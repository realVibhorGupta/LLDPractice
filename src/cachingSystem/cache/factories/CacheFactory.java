package cachingSystem.cache.factories;

import cachingSystem.cache.Cache;
import cachingSystem.cache.policies.LRUEvictionPolicy;
import cachingSystem.cache.storage.HashMapBasedStorage;

public class CacheFactory<Key, Value> {

    public Cache<Key, Value> defaultCache(final int capacity) {
        return new Cache<Key, Value>(new LRUEvictionPolicy<Key>(),
                new HashMapBasedStorage<Key, Value>(capacity));
    }
}
