import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class project1main {
	
	/**
	 * 
	 * @param args the command line arguments
	 * @throws throws FileNotFoundException exception if file not found
	 */
	public static void main(String[] args) throws FileNotFoundException  {
		
		/**
		 * variable pointing at the path of the file to read
		 */
		File inFile = new File(args[0]);

		/**
		 * variable pointing at the path of the file to write
		 */
		File outFile = new File(args[1]);
		
		/**
		 * Scanner, for reading the file
		 */
		Scanner scanner = new Scanner(inFile);
		/**
		 * PrintStream, to write to at file
		 */
		PrintStream printStream = new PrintStream(outFile);
		
		/**
		 * List of all House objects 
		 */
		ArrayList<House> houseList = new ArrayList<House>();
		
		/**
		 * List of all Student object
		 */
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		/**
		 * This while loop reads the .txt file located at args[0], and stores the corresponding objects in ArrayLists
		 */
		while(scanner.hasNext()) {
			String operationIdentifier = scanner.next();
			
			if(operationIdentifier.equals("h")) {
				houseList.add(new House(scanner.nextInt(), scanner.nextInt(), scanner.nextDouble()));
			
			}else if(operationIdentifier.equals("s")) {
				studentList.add(new Student(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextDouble()));
			
			}
		}
		
		/**
		 * Within this for loop we simulate the semesters and iterate over each ArrayList and check for matches
		 */
		for(int i=0; i<8; i++) { 
			Collections.sort(houseList); 
			Collections.sort(studentList);
			
			for(int e=0; e<studentList.size(); e++) {
				for(int j=0; j<houseList.size(); j++) {
					if((houseList.get(j).getDuration() == 0) && (houseList.get(j).getRating() >= studentList.get(e).getMinRating()) && (studentList.get(e).isAssigned() == false) && (studentList.get(e).getDuration() != 0)) {
						houseList.get(j).setDuration(studentList.get(e).getDuration());
						studentList.get(e).hasAssigned();
						break;
					}
				}
			}
			
			for(Student s : studentList) {
				s.dcrsDuration();
			}
			for(House h : houseList) {
				h.dcrsDuration();
			}
		}
		
		Collections.sort(studentList);
		Collections.sort(houseList);
		
		for(Student stu : studentList) {
			if(stu.isAssigned() == false) {
				printStream.println(stu.getName());
			}
		}
		printStream.close();
		scanner.close();
	}
	

}



























