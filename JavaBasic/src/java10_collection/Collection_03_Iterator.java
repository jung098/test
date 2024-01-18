package java10_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_Iterator {
   public static void main(String[] args) {
      
      // interface Iterator 
      // 반복자
      // 컬렉션의 모든 요소들을 순차적(반복적)으로 접근할 떄 사용한다.
      
      // Iterable 인터페이스를 상속받은 클래스의.iterator()메소드를
      // 호출하면 Iterarot 객체를 얻을 수 있다
      //-----------------------------------------------------------------------
      
      List<Object> list = Arrays.asList("A","B","C","D","E");
      System.out.println(list);
      
      //-----------------------------------------------------------------------

      //반복자 변수 선언 
      Iterator<Object> iter = null;
      
      //list객체를 이용하여 Iterator 객체생성
      iter = list.iterator();
      
      //-------------------------------------------------------------
      
      //Iterator의 주요 메소드
      
      // Public E next()
         // 다음요쇼의 데이터를 반환한다
      // Public boolean hasNext()
      //     다음 요소가 존재하는지 확인한다
      
      //--------------------------------------------------------------
      
      
      // 요소가 존재하는 만큼 하나씩 반복
      while (iter.hasNext()) {
      
      // 요소를 반환하고 다음요소를 참조하도록 만든다 
      Object data=iter.next();
      System.out.println(data);
      
      System.out.println("------");
      
      for(int i=0; i<list.size(); i++) {
         Object data1=list.get(i);
         System.out.println(data);
         
         System.out.println("------");
         for(Object data2 :list) {
            System.out.println(data);
         }
         
         
      }
      }
      
   }
}