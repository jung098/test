package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {

	public static void main(String[] args) {

		
		//Quiz.
		
		//Source.txt 파일의 내용을 읽어들여 Destinataion.txt 파일로 저장한다
		//	-> 파일 복사
		
		// 49,520,698 bytes
		
		//source.txt ---> FileCopy ---> Destination.txt
		
	
		
		//입력대상 파일
		File src = new File("./src/java13_io/fileStream/","Source.txt");
		System.out.println("src :  " + src.exists());
		
		
		//출력대상 파일
		File dest = new File("./src/java13_io/fileStream/", "Destination.txt");
		System.out.println("dest : " + dest.exists());
		
		
		
		
		
		//입출력 스트림 객체
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		
		//파일 입출력 보조 변수
		byte[] buf = new byte[1024];//데이터 입시저장
		int len =-1; 	//입출력 크기
		int total = 0;	// 총 입출력 크기
		
		
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
		
			//파일 입력
			while((len = fis.read(buf))!= -1 ) {
				
				//파일 출력
				fos.write(buf,0,len);
				fos.flush();
				
				
				//복사된 바이트 수 총합
				total += len;
			}
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//입력 스트림 닫기
				if(fis !=null) 	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				//출력 스트림 닫기
				if(fis !=null) 	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
		}
		
		System.out.println();
		System.out.println(">>" + total + "바이트 복사 완료");
		
		
		
		
		
		
		
	}

}
