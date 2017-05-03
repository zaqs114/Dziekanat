import java.io.Serializable;

public class ITEmployee extends Employee implements Serializable{
	
public ITEmployee(){};
	
	public ITEmployee(String name, String surname, int pesel, int salary){
		setName(name);
		setSurname(surname);
		setPesel(pesel);
		setSalary(salary);	
	};

}
