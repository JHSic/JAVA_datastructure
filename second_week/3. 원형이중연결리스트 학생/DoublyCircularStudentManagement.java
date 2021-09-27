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
			
			System.out.print("���ϴ� ����� �����ϼ��� : ");
			
			int insert = s.nextInt();

			switch(insert) {
			case 1:
				System.out.print("�й��� �̸��� �Է��ϼ��� : ");
				String studentNum = s.next();
				String studentName = s.next();
				studentList.addStudent(studentNum, studentName);
				break;
			case 2: 
				System.out.print("�й��� �Է��ϼ��� : ");
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
				System.out.print("�й��� �Է��ϼ��� : ");
				String specificNum = s.next();
				studentList.specificStudentPrint(specificNum);
				break;
			case 6: 
				System.out.println("�����մϴ�.");
				BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));
				bw.write(String.valueOf(studentList.printStudent()));
				
				bw.flush();
				bw.close();
				flag = false;
			}
		}
	}
}