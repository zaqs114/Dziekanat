import java.io.*;
import java.util.StringTokenizer;

public class Subjects {
	Useful useful = new Useful();
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public String getSubjectID() {
        return subjectID;
    }
    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public void writeToFile() throws IOException{
   
    FileWriter subjectsFile = new FileWriter("przedmioty.txt",true);
        subjectsFile.write(getSubjectName());
        subjectsFile.write('\t');
        subjectsFile.write(getSubjectID());
        subjectsFile.write('\n');
        subjectsFile.close();
    }

    public boolean isThereDuplicate(String phraseToCheck) throws IOException {

        BufferedReader file = new BufferedReader(new FileReader("przedmioty.txt"));
            String line = file.readLine();
            while (line != null) {
            	String[] subjectData = line.split("\\s+");
            	if(phraseToCheck.equalsIgnoreCase(subjectData[1])==true){
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

    private String subjectName;
    private String subjectID;

}