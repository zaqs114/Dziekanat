import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by zaqs114 on 23.03.2017.
 */
public class Subjects {
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
    FileWriter subjectsFile =null;
    try {
        subjectsFile = new FileWriter("przedmioty.txt",true);
        subjectsFile.write(getSubjectName());
        subjectsFile.write(getSubjectID());
    }
    finally{
        if(subjectsFile!= null){
            subjectsFile.close();
        }
    }
    }

    private String subjectName;
    private String subjectID;

}