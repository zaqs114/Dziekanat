import java.io.Serializable;

public class MathEmployee extends Employee implements Serializable {
public MathEmployee(){};
	
	public MathEmployee(String name, String surname, int pesel, int salary){
		setName(name);
		setSurname(surname);
		setPesel(pesel);
		setSalary(salary);	
	};
}
