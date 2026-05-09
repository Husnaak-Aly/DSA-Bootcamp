//import java.util.LinkedList;
//
//class HashTable {
//    float a = 0.75f;
//    float b = 7.5f;
//
//    private int TABLE_SIZE = 10;
//    private LinkedList<Integer>[] table;
//
//    public HashTable() {
//        table = new LinkedList[TABLE_SIZE];
//        for (int i = 0; i < TABLE_SIZE; i++) {
//            table[i] = new LinkedList<>();
//        }
//    }
//
//    private int hashFunction(int key) {
//        return key % TABLE_SIZE;
//    }
//
//
//    public void insert(int key) {
//        int hash = hashFunction(key);
//        table[hash].add(key);
//    }
//
//    public boolean search(int key) {
//        int hash = hashFunction(key);
//        return table[hash].contains(key);
//    }
//
//    public void delete(int key) {
//        int hash = hashFunction(key);
//        table[hash].remove(Integer.valueOf(key));
//    }
//
//    public void displayTable() {
//        for (int i = 0; i < TABLE_SIZE; i++) {
//            System.out.println("Bucket " + i + ": " + table[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        HashTable ht = new HashTable();
//        ht.insert(10);
//        ht.insert(20);
//        ht.insert(15);
//        ht.insert(30);
//        ht.displayTable();
//
//        System.out.println("Search 15: " + ht.search(15));
//        ht.delete(15);
//        System.out.println("Search 15 after deletion: " + ht.search(15));
//    }
//}
//

import java.util.LinkedList;

class HashTable {
    float a = 0.75f;
    float b = 7.5f;

    private int TABLE_SIZE = 10;
    private LinkedList<String>[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to compute hash for strings
    private int hashFunction(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash * 31 + key.charAt(i)) % TABLE_SIZE;
        }
        return hash;
    }

    public void insert(String key) {
        int hash = hashFunction(key);
        table[hash].add(key);
    }

    public boolean search(String key) {
        int hash = hashFunction(key);
        return table[hash].contains(key);
    }

    public void delete(String key) {
        int hash = hashFunction(key);
        table[hash].remove(key);
    }

    public void displayTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Bucket " + i + ": " + table[i]);
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.insert("password1");
        ht.insert("password2");
        ht.insert("securePass");
        ht.insert("admin123");
        ht.displayTable();

        System.out.println("Search 'securePass': " + ht.search("securePass"));
        ht.delete("securePass");
        System.out.println("Search 'securePass' after deletion: " + ht.search("securePass"));
    }
}
