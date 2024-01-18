package java11_generic;

class Class02_int {
	private int data;
	
	public int display(int data) {
		this.data=data;
		return data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}


// 제네릭 클래스
class Class02<TYPE>{
	private TYPE data;
	
	public TYPE display(TYPE data) {
		this.data=data;
		return data;
	}
	
	public TYPE getData() {
		return data;
	}
	
	public void setData(TYPE data) {
		this.data = data;
	}
	

}




public class Generic_02_Basic {

	public static void main(String[] args) {
		
		//타입 파라미터를 결정하지 않음
		//	-> Object타입으로 자동 결정
		//	->	raw type
		Class02 c01 = new Class02();
		
		c01.setData(12345);
		
		int num = (int)c01.getData();
		
		System.out.println(num);
		//----------------------------------------------------------------
		
		Class02<String> c02 = new Class02<>();
		
		c02.setData("Grape");
		
		String fruit = c02.getData();
		
		System.out.println(fruit);
		
		
		

	}

}
































