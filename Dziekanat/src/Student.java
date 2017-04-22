import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student extends Person{
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public boolean isThereDuplicate(String phraseToCheck) throws IOException {

        BufferedReader file = new BufferedReader(new FileReader("studenci.txt"));
            String line = file.readLine();
            while (line != null) {
            	String[] subjectData = line.split("\\s+");
            	if(phraseToCheck.equalsIgnoreCase(subjectData[3])==true){
            		file.close();
            		return true;
            	}
            	line = file.readLine();
            	if(line==null) break;
            	subjectData=line.split("\\s+");
            }
                file.close();
                return false;
    }

    public void writeToFile() throws IOException{
    	   
    FileWriter studentsFile = new FileWriter("studenci.txt",true);
        studentsFile.write(getName()+'\t');
        studentsFile.write(getSurname()+'\t');
        studentsFile.write(getPesel()+'\t');
        studentsFile.write(getStudentId()+'\n');
       
        studentsFile.close();
    }
    
    private String studentId;
}