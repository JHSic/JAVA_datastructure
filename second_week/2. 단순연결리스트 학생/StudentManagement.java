import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		Scanner s = new Scanner(System.in);
	
		String line;
		
		StudentList studentList = new StudentList();
		
		while((line = br.readLine()) != null) {
			ClubList clubList = new ClubList();
			String[] word = line.split(" ", 3);
			
			String fileStudentNum = word[0];
			String fileStudentName = word[1];
			
			if(word.length == 3) {
				String fileStudentClub = word[2];		
				String[] clubs = fileStudentClub.split("/");
				
				for(int i = 0; i < clubs.length; i++) {
					clubList.addClub(clubs[i]);
				}
			}
			studentList.addStudent(fileStudentNum, fileStudentName, clubList);
		}
		
		boolean flag = true;
		
		while(flag) {
			studentList.printMenu();
			
			System.out.print("원하는 기능을 선택하세요 : ");
			
			int insert = s.nextInt();
			String jumpSpace = s.nextLine();
			
			switch(insert) {
			
			case 1:
				System.out.print("학번과 이름, 동아리들을 입력하세요 : ");
				String student = s.nextLine();
				String[] addWord = student.split(" ", 3);
				
				String studentNum = addWord[0];
				String studentName = addWord[1];
				
				ClubList clubList = new ClubList();
				if(addWord.length == 3) {
					String studentClub = addWord[2];		
					String[] clubs = studentClub.split("/");
					
					for(int i = 0; i < clubs.length; i++) {
						clubList.addClub(clubs[i]);
					}
				}
				studentList.addStudent(studentNum, studentName, clubList);
				break;

			case 2: 
				System.out.println("학번을 입력하세요 : ");
				String removeNum = s.next();
				studentList.removeStudent(removeNum);
				break;

			case 3: 
				System.out.print(String.valueOf(studentList.printStudent()));;
				break;

			case 4: 
				BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));
				System.out.println("종료합니다.");
				bw.write(String.valueOf(studentList.printStudent()));
				
				bw.flush();
				bw.close();
				
				flag = false;
			}
		}
	}
}