import java.io.Serializable;


public class DailyStudent extends Student implements Serializable{

	public DailyStudent(){};
	
	public DailyStudent(String name, String surname, int pesel, int studentId){
		super();
		setName(name);
		setSurname(surname);
		setPesel(pesel);
		setStudentId(studentId);	
	};
	
	
	
	
}
