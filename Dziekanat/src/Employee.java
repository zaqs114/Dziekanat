import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Employee extends Person {
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public boolean isThereDuplicate(String phraseToCheck) throws IOException {

        BufferedReader file = new BufferedReader(new FileReader("pracownicy.txt"));
            String line = file.readLine();
            while (line != null) {
            	String[] employeeData = line.split("\\s+");
            	if(phraseToCheck.equalsIgnoreCase(employeeData[2])==true){
            		file.close();
            		return true;
            	}
            	line = file.readLine();
            	if(line==null) break;
            	employeeData=line.split("\\s+");
            }
                file.close();
                return false;
    }

    public void writeToFile() throws IOException{
    	   
    FileWriter employeeFile = new FileWriter("pracownicy.txt",true);
        employeeFile.write(getName()+'\t');
        employeeFile.write(getSurname()+'\t');
        employeeFile.write(getPesel()+'\t');
        employeeFile.write(getPosition()+'\t');
        employeeFile.write(getSalary()+'\n');
        
       
        employeeFile.close();
    }
    
    
    private String position;
    private String salary;

}