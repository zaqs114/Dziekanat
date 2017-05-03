import java.io.Serializable;


public class WeekendStudent extends Student implements Serializable{
	
public WeekendStudent(){};
	
	public WeekendStudent(String name, String surname, int pesel, int studentId){
		setName(name);
		setSurname(surname);
		setPesel(pesel);
		setStudentId(studentId);	
	};
	


}
