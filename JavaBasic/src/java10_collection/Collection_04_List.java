package java10_collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Collection_04_List {
   public static void main(String[] args) {
      
//      Set set = new HashSet();
//      Set set = new LinkedHashSet();
      Set set = new TreeSet();
      
      set.add(20);
      set.add(10);
      set.add(40);
      set.add(30);

      //중복 데이터는 제거한다
      set.add(30);
      set.add(40);
      set.add(30);
      set.add(40);
      
      
      System.out.println(set);
      
      System.out.println("--------------");
      
      //set객체의 i
      Iterator iter =set.iterator();
      
      
      while(iter.hasNext()) {
         System.out.println(iter.next());
         
         System.out.println("--------for each-------------");
         
         for(Object data : set) {
            System.out.println(data);
            
            System.out.println("----------------------");
            
            System.out.println("크기? "+set.size());
            System.out.println("비엇는지?"+set.isEmpty());
            System.out.println("30이 존재하는지?"+set.remove(30));
            System.out.println("30제거"+set.remove(30));
            
            System.out.println("50제거"+set.remove(50));
            
            System.out.println(set);
            
            System.out.println("-----------");
            
            set.clear();
            System.out.println(set);
            
            
         }
      }
      
      
      
   }
}