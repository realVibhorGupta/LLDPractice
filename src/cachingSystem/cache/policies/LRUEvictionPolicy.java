package cachingSystem.cache.policies;


import cachingSystem.algorithm.exceptions.DoublyLinkedList;
import cachingSystem.algorithm.exceptions.DoublyLinkedListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Eviction policy based on LRU algorithm.
 *
 * @param <Key> Key type.
 */
public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key> {

    private final DoublyLinkedList<Key> dll;
    private final Map<Key, DoublyLinkedListNode<Key>> mapper;

    public LRUEvictionPolicy() {
        this.dll = new DoublyLinkedList<>();
        this.mapper = new HashMap<>();
    }

    @Override
    public void keyAccessed(Key key) {
        if (mapper.containsKey(key)) {
            dll.detachNode(mapper.get(key));
            dll.addNodeAtLast(Objects.requireNonNull(mapper.get(key)));
        } else {
            DoublyLinkedListNode<Key> newNode = dll.addElementAtLast(key);
            mapper.put(key, newNode);
        }
    }

    @Override
    public Key evictKey() {
        DoublyLinkedListNode<Key> first = dll.getFirstNode();
        if(first == null) {
            return null;
        }
        dll.detachNode(first);
        return first.getElement();
    }
}