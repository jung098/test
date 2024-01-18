package getset;

public class Data {
	
	private int num;//번호
	private String name;//이름
	private String phone;// 번화번호	
	
	//Setter 메소드
	// -> 외부 객체에서 호출을 통해 멤버 필드의 값을 대입(저장)할 수 있다.
	public void setNum(int num) {
		this.num = num;
	}
	//Getter 메소드
	// -> 외부 객체에서 호출을 통해 멤버 필ㄷ드의 값을 반환(불러오기)할 수 있다.
	public int getNum() {
		return num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
		public String getName() {
		return name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
			
	public String getPhone() {
			return phone;
	}
		
	
}


