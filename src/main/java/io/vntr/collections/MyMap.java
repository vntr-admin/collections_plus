package io.vntr.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap<S, T> implements Map<T, S> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public S get(Object key) {
        return null;
    }

    @Override
    public S put(T key, S value) {
        return null;
    }

    @Override
    public S remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends T, ? extends S> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<T> keySet() {
        return null;
    }

    @Override
    public Collection<S> values() {
        return null;
    }

    @Override
    public Set<Entry<T, S>> entrySet() {
        return null;
    }
}
