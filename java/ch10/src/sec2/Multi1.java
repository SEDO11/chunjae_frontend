package sec2;

import java.util.Map;

// 제너릭을 여러개 사용할 경우
public class Multi1<K, V> implements Map.Entry<K, V> { // map의 구조를 불러옴
    private K key;
    private V value;

    // Key는 set이 없다.
    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public V setValue(V value) {
        this.value = value;
        return this.value;
    }
}
