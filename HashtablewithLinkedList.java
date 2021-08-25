
package hashtablewithlinkedlist;


public class HashtablewithLinkedList {
    
    int Key;
    
    Object Value;
    
     HashtablewithLinkedList next;

    
    
    public  HashtablewithLinkedList(int Key, Object Value){
        this.Key = Key;
        this.Value = Value;
        next = null;    
    
}
    
    public  HashtablewithLinkedList(){
        next = null;
    }
    
    public int GetKey(){
        return Key ;
    }
    public Object GetValue(){
        return Value;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashTableArr<String> hello = new HashTableArr<String>(11);
        hello.put(11, "Gianni");
        hello.put(97, "Eunice");
        hello.put(1, "Eunifred");
        hello.put(98, "Aduhene");
        hello.put(45, "Fred");
        hello.put(78, "Deodat");
        hello.put(2, "Alice");
        hello.put(9, "Gideon");
        hello.put(4, "Ray");
        
      // hello.HashTableArray(11);
        
        
        System.out.println(hello.getValue(92));
        System.out.println(hello.GetHash(92));
        
        
        hello.removeValue(2,"Alice");
         System.out.println(hello.getValue(92));
         System.out.println(hello);
        
        
    }
    
}
