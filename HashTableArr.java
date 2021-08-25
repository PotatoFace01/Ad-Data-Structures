
package hashtablewithlinkedlist;

public class HashTableArr<E> {
  HashtablewithLinkedList[] arrayHash;
int size;  
    
    
    
    public  HashTableArr(int size){
        this.size = size;
        this.arrayHash = new HashtablewithLinkedList[size];
        for(int i=0;i<size;i++){
            arrayHash[i]=new HashtablewithLinkedList();
                
        }
        
    }
        
       int GetHash(int Key){
        return Key%size;
            
    }
   public void put(int Key, Object Value){
       int HashIndex=GetHash(Key);
       HashtablewithLinkedList arrayValue = arrayHash[HashIndex];
       HashtablewithLinkedList newItem = new HashtablewithLinkedList(Key, Value);
       newItem.next = arrayValue.next;
       arrayValue.next = newItem;
       
       //System.out.println();
       
       
       
   }
   
   public E getValue(int Key){
       E Value = null;
       int HashIndex=GetHash(Key);
       HashtablewithLinkedList arrayValue = arrayHash[HashIndex];
       
       while(arrayValue!=null){
           if(arrayValue.GetKey()==Key){
               Value = (E) arrayValue.GetValue();
               break;
           }
           arrayValue = arrayValue.next;
       }
       return Value;
       
   }
   
   
   public void removeValue(int Key, Object Value){
       int HashIndex=GetHash(Key);
       HashtablewithLinkedList arrayValue = arrayHash[HashIndex];
       HashtablewithLinkedList newItem = new HashtablewithLinkedList(Key, Value);
       arrayValue.next = newItem.next;
       newItem = arrayValue.next;
       System.out.println(HashIndex  + " has been removed");
   }
   

   
    
}
