package java13_io.filterStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_2_DataOutputStream {

	public static void main(String[] args) {

		//출력 파일 객체
        File file = new File("./src/java13_io/fileStream/", "DataTest.txt");
        
        //데이터 출력 스트림
        DataOutputStream dos = null;

        
        try {
        //Program -> DataOutputStream -> BufferedOutputStream -> FileOutputStream -> File
           dos = new DataOutputStream(
                 new BufferedOutputStream(
                       new FileOutputStream(file) ) );
           
           //OutputStream의 기본 출력 메소드
           //   ->1B 단위로 ASCII 코드를 처리한다
//           dos.write(65);   // 'A'
//           dos.write("Apple".getBytes()); //"Apple"

           
           //DataOutputStream의 자료형 유지 출력 메소드
           dos.writeBoolean(false);  // 1B       
           dos.writeInt(123); // 4B
           dos.writeChars("개"); // 2B 
           
           //출력 버퍼 비우기
           dos.flush();
           
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }finally {
           try {
           if(dos!=null) dos.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
        }
        
        
        
        
}//main
}//class
		
