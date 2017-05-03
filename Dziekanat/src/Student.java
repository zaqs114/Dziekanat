import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Student extends Person{
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public static ArrayList<DailyStudent> dailyStudentList = new ArrayList<DailyStudent>();
    public static ArrayList<WeekendStudent> weekendStudentList = new ArrayList<>();
    
public void writeToFile(){
	
    
	try {
		FileWriter studentsFile = new FileWriter("studenci.txt");
		for (int i = 0; i < Student.dailyStudentList.size(); i++) {

			studentsFile.write(Student.dailyStudentList.get(i).getName()+'\t');
			studentsFile.write(Student.dailyStudentList.get(i).getSurname()+'\t');
			studentsFile.write(Integer.toString(Student.dailyStudentList.get(i).getPesel())+'\t');
			studentsFile.write(Integer.toString(Student.dailyStudentList.get(i).getStudentId())+'\t'+"Dzienne"+'\n');

			
		}
		studentsFile.close();
	} catch (IOException e) {

		e.printStackTrace();
	}
	
	try {
		FileWriter studentsFile = new FileWriter("studenci.txt", true);
		for (int i = 0; i < Student.weekendStudentList.size(); i++) {

			studentsFile.write(Student.weekendStudentList.get(i).getName()+'\t');
			studentsFile.write(Student.weekendStudentList.get(i).getSurname()+'\t');
			studentsFile.write(Integer.toString(Student.weekendStudentList.get(i).getPesel())+'\t');
			studentsFile.write(Integer.toString(Student.weekendStudentList.get(i).getStudentId())+'\t'+"Zaoczne"+'\n');
			
		}
		studentsFile.close();
	} catch (IOException e) {

		e.printStackTrace();
	}
    
	
}
    
    private int studentId;
}