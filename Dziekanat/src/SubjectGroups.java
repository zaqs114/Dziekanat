import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SubjectGroups {
    

	public SubjectGroups(){}
	
	public SubjectGroups(String subjectGroupID, String subjectName, String studiesType, String teacherName, ArrayList<String> namesOfStudents) {
		this.subjectGroupID = subjectGroupID;
		this.subjectName = subjectName;
		this.studiesType = studiesType;
		this.teacherName = teacherName;
		this.namesOfStudents = namesOfStudents;
	}



	public ArrayList<String> getNamesOfStudents() {
		return namesOfStudents;
	}



	public void setNamesOfStudents(ArrayList<String> namesOfStudents) {
		this.namesOfStudents = namesOfStudents;
	}



	public String getSubjectGroupID() {
		return subjectGroupID;
	}

	public void setSubjectGroupID(String subjectGroupID) {
		this.subjectGroupID = subjectGroupID;
	}
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getStudiesType() {
		return studiesType;
	}

	public void setStudiesType(String studiesType) {
		this.studiesType = studiesType;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	



	public static ArrayList<SubjectGroups> subjectGroupsList = new ArrayList<>();
    

  public void writeToFile(){
    try {
		FileWriter subjectGroupsFile = new FileWriter("grupyprzedmiotowe.txt");
		for (int i = 0; i < SubjectGroups.subjectGroupsList.size(); i++) {
		subjectGroupsFile.write(SubjectGroups.subjectGroupsList.get(i).getStudiesType()+'\t');
		subjectGroupsFile.write(SubjectGroups.subjectGroupsList.get(i).getSubjectName()+'\t');
		subjectGroupsFile.write(SubjectGroups.subjectGroupsList.get(i).getSubjectGroupID()+'\t');
		subjectGroupsFile.write(SubjectGroups.subjectGroupsList.get(i).getTeacherName()+'\t');
		for (int j = 0; j < SubjectGroups.subjectGroupsList.get(i).getNamesOfStudents().size(); j++) {
		subjectGroupsFile.write(SubjectGroups.subjectGroupsList.get(i).getNamesOfStudents().get(j)+'\t');
		}
		subjectGroupsFile.write('\n');
		}
		subjectGroupsFile.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
  private String subjectGroupID; 
  private String subjectName; 
  private String studiesType; 
  private String teacherName;
  private ArrayList<String>namesOfStudents = new ArrayList<>();
}
	