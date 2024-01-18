package java10_collection;

import java.util.ArrayList;

public class Collection_01_List {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
	
		
		//빈(empty) 리스트
		ArrayList list = new ArrayList();
		
	
		
		// [] (== empty )
		System.out.println(list);
		
		System.out.println();
		System.out.println("----데이터 삽입 -------");
		
		
		// .add()를 실행한 순서대로 인덱스를 부여받는다 (0부터 시작한다)
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println( list );
		System.out.println("---데이터 조회 ------");
		
		System.out.println("1번째 요소 : " + list.get(1));
		
		System.out.println("리스트의 크기: " + list.size());
		
		for(int i =0; i<list.size(); i ++) {
			System.out.println(i + " : " + list.get(i));
		}

		
		System.out.println("-------------------");
		
		for( Object item : list) {
			System.out.println( item );
			
		}
		
		
		System.out.println(  );
		System.out.println("---데이터 수정 ----");
		
		list.set(0, "Orange");
		
		System.out.println(  );
		System.out.println("---데이터 삭제 ----");
		
		
		// .remove(int index) 	인덱스로 요소를 지정하여 삭제
		// .remove(Object o)	요소의 값을 비교(equals)하여 삭제
		
		list.remove(1);	//1번째 인덱스 삭제
		System.out.println( list );
		
		list.remove("Apple");
		System.out.println(list);
		
		list.remove("Orange");
		System.out.println( list );
		
		
		
		
		
	}

}










