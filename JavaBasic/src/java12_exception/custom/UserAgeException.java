package java12_exception.custom;

//Checked Exception 정의
public class UserAgeException extends Exception{

	
	
	public String getMesString() {
		
		return "나이는 0보다 작거나 150보다 클수 없다 ";
		
	}
}



//Unchecked Exception 정의
//public class UserAgeException extends RuntimeException{
//}
