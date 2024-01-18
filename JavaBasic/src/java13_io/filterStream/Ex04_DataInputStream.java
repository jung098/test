package java13_io.filterStream;

import java.awt.image.DataBufferDouble;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_DataInputStream {

	public static void main(String[] args) {
		//출력 파일 객체
        File file = new File("./src/java13_io/fileStream/", "DataTest.txt");
        
        //데이터 입력 스트림
        DataInputStream dis = null;
        
        try {
			dis = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(file)));
			
//			System.out.println(dis.readInt());
//			
			//boolean
			boolean bData = dis.readBoolean();
			
			
			//int
			int iData = dis.readInt();
			
			//char
			char cData = dis.readChar();
			
			System.out.println(bData);
			System.out.println(iData);
			System.out.println(cData);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis !=null) dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        		
	}

}
