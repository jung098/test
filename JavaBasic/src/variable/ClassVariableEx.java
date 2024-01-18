package variable;

public class ClassVariableEx {
	public static void main(String[] args) {
		
		ClassVariable_01 cv01;
	      cv01= new ClassVariable_01();
	      
	      
	      ClassVariable_01 cv02 = new ClassVariable_01();
	      
	      ClassVariable_01 cv03= null;
	      
	      //---------------------------------------
	      
	      
	      cv01.setNum(12345);
	      System.out.println(cv01.getNum());
	      
	      System.out.println(cv02.getNum());
	      
	      // 예외 발생 , NullPointException
	   //   System.out.println(cv03.getNum());  // NullPointExceptionn < null값 떄문 
	      
	      
	      System.out.println("---------------------------------");
	      
	      ClassVariable_02  cv04 = new ClassVariable_02 ();
	      ClassVariable_02  cv05 = new ClassVariable_02 ();
	      
	      System.out.println(cv04.city);
	      System.out.println(cv05.city);
	      
	      cv04.city ="Busan";
	      
	      System.out.println("---------------------------------");
	      System.out.println(cv04.city);
	      System.out.println(cv05.city);
	      
	      System.out.println(ClassVariable_02.city);
	      
	      System.out.println("----------------");
	      
	      ClassVariable_02.city = "Incheon";
	      System.out.println(ClassVariable_02.city);
	     
	    System.out.println("----------------------------");
	    
	    ClassVariable_03 cv06 = new ClassVariable_03();
	    
	    cv06.method(0, 0);
	    
	    System.out.println("------");
	    
	    new ClassVariable_03().method(2,3);

	    	
	    
	    
	   }
	}









































				
