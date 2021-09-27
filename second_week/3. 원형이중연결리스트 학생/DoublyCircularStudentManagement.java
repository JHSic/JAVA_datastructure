import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DoublyCircularStudentManagement {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		Scanner s = new Scanner(System.in);
	
		String line;
		
		DoublyCircularLinkedList studentList = new DoublyCircularLinkedList();
		
		while((line = br.readLine()) != null) {
			String[] word = line.split(" ");

			String studentNum = word[0];
			String studentName = word[1];
			
			studentList.addStudent(studentNum, studentName);
		}

		boolean flag = true;
		
		while(flag) {
			studentList.printMenu();
			
			System.out.print("원하는 기능을 선택하세요 : ");
			
			int insert = s.nextInt();

			switch(insert) {
			case 1:
				System.out.print("학번과 이름을 입력하세요 : ");
				String studentNum = s.next();
				String studentName = s.next();
				studentList.addStudent(studentNum, studentName);
				break;
			case 2: 
				System.out.print("학번을 입력하세요 : ");
				String removeNum = s.next();
				studentList.removeStudent(removeNum);
				break;
			case 3: 
				System.out.print(String.valueOf(studentList.printStudent()));
				break;
			case 4: 
				studentList.reversePrint();
				break;
			case 5:
				System.out.print("학번을 입력하세요 : ");
				String specificNum = s.next();
				studentList.specificStudentPrint(specificNum);
				break;
			case 6: 
				System.out.println("종료합니다.");
				BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));
				bw.write(String.valueOf(studentList.printStudent()));
				
				bw.flush();
				bw.close();
				flag = false;
			}
		}
	}
}