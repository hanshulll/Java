import java.util.ArrayList;
import java.util.LinkedList;

public class ChainedHashing {
    int bucket;
    ArrayList<LinkedList<Integer>> table;
    public ChainedHashing(){
    }
    public ChainedHashing(int size){
        this.bucket = size;
        table = new ArrayList<>();
        for(int i = 0;i<size;i++){
            table.add(new LinkedList<>());
        }
    }

    public void insert(int key){
        int hash = hashFunction(key);
        table.get(hash).add(key);
    }
    public boolean search(int key){
        int hash = hashFunction(key);
        return table.get(hash).contains((Integer) key);
    }
    public void delete(int key) {
        int hash = hashFunction(key);
        table.get(hash).remove((Integer) key);

    }
    public int hashFunction(int key) {
        return key%bucket;
    }

    public static void main(String[] args) {
        ChainedHashing hashTable = new ChainedHashing(10);
        hashTable.insert(20);
        hashTable.insert(21);
        System.out.println(hashTable.search(20));
        hashTable.delete(20);
        System.out.println(hashTable.search(20));
    }
}
