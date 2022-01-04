/*
Student: Alexey Vartanov
Maman 14: Question 1 - Generic class
 */
import java.util.*;

public class AssociationTable<K, V> {

    private final TreeMap<Comparable<K>, Object> table;

    public AssociationTable(){
        table = new TreeMap<>();
    }

    public AssociationTable(Comparable<K>[] keys, V[] values) throws Exception {

        if(keys.length != values.length)
            throw new IllegalArgumentException();

        table = new TreeMap<>();
        for (int i=0; i<keys.length; i++){
            add(keys[i], values[i]);
        }
    }

    public void add(Comparable<K> key, Object value)
    {
        //if key already exists in table old value replaced with new
        //also in sorted order
        table.put(key, value);
    }

    public Object get(Comparable<K> key){
        return table.get(key);
    }

    public boolean contains(Comparable<K> key){
        return table.containsKey(key);
    }

    public boolean remove(Comparable<K> key){
        return table.remove(key) != null;
    }

    public int size(){
        return table.size();
    }

    public Iterator<Comparable<K>> keyIterator(){
       return table.keySet().iterator();
    }
}