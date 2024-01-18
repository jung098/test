package java06_class.uml;
import java.util.Scanner;
public class StudentService {
	
	
	
	
	private Student stu;
	private Scanner input;
	
	
	public StudentService() {
		System.out.println("디폴트 생성자");
		stu = new Student();
		input = new Scanner(System.in);
	}
	
	
	
	//학생 정보입력
	public void insertinfo() {
		
		System.out.println("insertinfo");
		
		System.out.println("Input Name : ");
		stu.setName(input.nextLine());
		
		System.out.println("Input Score: ");
		stu.setAge(input.nextInt());
	
		
	}
	//학생 점수입력
	public void insertScore() {
		System.out.println("insertScore");
		System.out.println("Input KOR  : ");
		stu.setKor(input.nextInt());
		
		System.out.println("Input ENG  : ");
		stu.setEng(input.nextInt());
		
		System.out.println("Input MATH  : ");
		stu.setMath(input.nextInt());
		
		//총점 계산하기
		this.calcSum();
		
		//평균 계산하기
		this.calcAvg();
	}

	//총점 계산
	public void calcSum() {
		stu.setSum(stu.getKor() + stu.getEng() +stu.getMath());
		
	}
	
	//평균 계산
	public void calcAvg() {
		stu.setAvg(stu.getSum()/(double)3);
	}
	
	//학생 정보 출력
	public void printStu() {
		System.out.println("---학생 정보---");
		
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		
		System.out.print(stu.getName()+ "\t");
		System.out.print(stu.getAge()+ "\t");
		
		System.out.print(stu.getKor()+ "\t");
		System.out.print(stu.getEng()+ "\t");
		System.out.print(stu.getMath()+ "\t");
		
		
		
		System.out.print(stu.getSum()+ "\t");
//		System.out.printf("%.2f",stu.getAvg()+ "\t");
		System.out.printf("%.2f\t", stu.getAvg());
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Scanner sc = new Scanner(System.in);
//	
//	
//	private Student stu;
//	private Scanner input;
//	
//	
//	public StudentService(Student student, Scanner input) {
//		stu = student;
//		this.input = input;
//	}
//
//	
//	
//	
//	public void insertinfo() {
//		System.out.println("학생의 이름 : " + sc.next(stu.getName()));
//		System.out.println("학생의 나이 : " + sc.nextInt(stu.getAge()));
//		
//	}
//	
//	public void insertScore() {
//		System.out.println("학생의 국어점수 : " + sc.nextInt(stu.getKor()));
//		System.out.println("학생의 영어점수 : " + sc.nextInt(stu.getEng()));
//		System.out.println("학생의 수학점수 : " + sc.nextInt(stu.getMath()));
//	}
//
//	public void calcSum() {
//		System.out.println("학생의 총 점수 : " + stu.getSum());
//	}
//
//	public void calcAvg() {
//		System.out.println("학생의 평균 점수 : " + stu.getAvg());
//	}
//
//	public void printStu() {
//		System.out.println();
//	
//	}
//	
	
	
	
}
