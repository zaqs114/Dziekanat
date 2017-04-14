import java.io.*;
import java.util.StringTokenizer;


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
        subjectsFile.write('\t');
        subjectsFile.write(getSubjectID());
        subjectsFile.write('\n');
    }
    finally{
        if(subjectsFile!= null){
            subjectsFile.close();
        }
    }
    }

    public boolean isThereDuplicate(String phraseToCheck) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("przedmioty.txt"));
        try{
            String line = file.readLine();
            while (line != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(line, "\t");
                while (stringTokenizer.hasMoreTokens()) {
                    String subjectName = stringTokenizer.nextToken();
                    String subjectID = stringTokenizer.nextToken();
                    line = file.readLine();
                    if(phraseToCheck.equalsIgnoreCase(subjectID)==true){
                        return true;
                    }
                    else{
                        continue;
                    }

                }
            }
        }finally{
            if (file != null) {
                file.close();
            }
        }
        return false;
    }

    private String subjectName;
    private String subjectID;

}