package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {

	public static void main(String[] args) {

		//출력 대상 파일
        File file = new File("./src/java13_io/fileStream/", "BufferdOut.txt");
        
        //출력 스트림 객체
        BufferedOutputStream bos = null;
        
        try {
           //파일 출력 스트림 객체 생성
           bos = new BufferedOutputStream(
        		   new FileOutputStream(file,true));
           
           String data = "BananaApple";
           
           //데이터 출력
           bos.write(data.getBytes(), 0, data.length());
           bos.flush();
           
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }finally {
           
           try {
              //스트림 닫기
              if(bos!=null)   bos.close();
           } catch (IOException e) {
              e.printStackTrace();
           }
        }
        
        
        
        
     }//main
  }//class