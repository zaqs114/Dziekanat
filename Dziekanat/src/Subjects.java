import java.io.*;
import java.util.ArrayList;


public class Subjects {
	Useful useful = new Useful();
	
	public Subjects(){};
	public Subjects(String subjectName, String subjectID){
		setSubjectName(subjectName);
		setSubjectID(subjectID);
	
	}
	
	
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
    
    public static ArrayList<Subjects> subjectsList = new ArrayList<>();
    
    
 
    
    public void writeToFile(){
    	
    	try {
    		FileWriter subjectFile = new FileWriter("przedmioty.txt");
    		for (int i = 0; i < Subjects.subjectsList.size(); i++) {

    			subjectFile.write(Subjects.subjectsList.get(i).getSubjectName()+'\t');
    			subjectFile.write(Subjects.subjectsList.get(i).getSubjectID()+'\n');

    		}
    		subjectFile.close();
    	} catch (IOException e) {

    		e.printStackTrace();
    	}
    	
    	
    }
    
    
    private String subjectName;
    private String subjectID;

}