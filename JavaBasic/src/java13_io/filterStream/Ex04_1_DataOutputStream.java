package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_1_DataOutputStream {

	public static void main(String[] args) throws FileNotFoundException {

		
		//출력 파일 객체
		File file = new File("./src/java13_io/filterStream/","DataTest.txt");
		
		//데이터 출력 스트림
		DataOutputStream dos = null;
		
		try {
			
		// program -> DataOutputStream -> BufferedOutputStream ->  FileOutputStream -> FileNotFoundException
		dos = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(file) ) );
		//OutputStream의 기본 출력 메소드
		// -> 1B단위로 ASCII 코드를 처리한다.
//		dos.write(65);
//		dos.write("Apple".getBytes());
		
		
		//DataOutputStream의 자료형 유지 출력 메소드
		dos.writeBoolean(false);
		
		
		
		//출력 버퍼 비우기
		dos.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
