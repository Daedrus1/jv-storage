package core.basesyntax.impl;

import core.basesyntax.Storage;

import java.util.Collections;

public class StorageImpl<K, V> implements Storage<K, V> {
    private static final int MAX_SIZE = 10;
    private K[] keys;
    private V[] values;
    private int size;

    public StorageImpl() {
        keys = (K[]) new Object[MAX_SIZE];
        values = (V[]) new Object[MAX_SIZE];
    }

    @Override
    public void put(K key, V value) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] == null ? key == null : keys[i].equals(key)) {
                values[i] = value;
            }
        }

        if (keys[] <MAX_SIZE){
            keys.add(key);
            values.add(value);
        } else if {
            throw new IllegalStateException("Storage is Full");
        }
    }

    @Override
    public V get(K key) {
        int index = Collections.binarySearch(keys, key);
        return values[index];

    }

    @Override
    public int size() {
        return 0;
    }
}


