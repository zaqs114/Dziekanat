import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Employee extends Person {
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static ArrayList<ITEmployee> itEmployeeList = new ArrayList<>();
    public static ArrayList<MathEmployee> mathEmployeeList = new ArrayList<>();
    
public void writeToFile(){
	
    
	try {
		FileWriter employeeFile = new FileWriter("pracownicy.txt");
		for (int i = 0; i < Employee.itEmployeeList.size(); i++) {

			employeeFile.write(Employee.itEmployeeList.get(i).getName()+'\t');
			employeeFile.write(Employee.itEmployeeList.get(i).getSurname()+'\t');
			employeeFile.write(Integer.toString(Employee.itEmployeeList.get(i).getPesel())+'\t');
			employeeFile.write(Integer.toString(Employee.itEmployeeList.get(i).getSalary())+'\t'+"Informatyk"+'\n');
			
		}
		employeeFile.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	try {
		FileWriter employeeFile = new FileWriter("pracownicy.txt", true);
		for (int i = 0; i < Employee.mathEmployeeList.size(); i++) {

			employeeFile.write(Employee.mathEmployeeList.get(i).getName()+'\t');
			employeeFile.write(Employee.mathEmployeeList.get(i).getSurname()+'\t');
			employeeFile.write(Integer.toString(Employee.mathEmployeeList.get(i).getPesel())+'\t');
			employeeFile.write(Integer.toString(Employee.mathEmployeeList.get(i).getSalary())+'\t'+"Matematyk"+'\n');
			
		}
		employeeFile.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
    
	
}
 
    private int salary;
}
