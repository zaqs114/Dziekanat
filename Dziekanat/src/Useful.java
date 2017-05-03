import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Useful {

 public int howManyLines(String fileName) throws IOException {
    BufferedReader file = new BufferedReader(new FileReader(fileName));
    int i = 1;
        try {
        String line = file.readLine();
        while (line != null) {
            line = file.readLine();
            i++;
        }
    }finally{
        if (file != null) {
            file.close();
        }
    }
    return i;
    }
 
 public void deleteLine(String fileName, int lineToRemove)throws IOException{
		
		
	 	File file = new File(fileName);
		File tmpFile = new File("tmp"+fileName);
		BufferedReader readFile = new BufferedReader(new FileReader(file));
		BufferedWriter writeTmpFile = new BufferedWriter(new FileWriter(tmpFile));
	    String line = null;
	    try {
	    	for(int i=1; i<lineToRemove;i++){
	    		line =readFile.readLine();
	    		if(line==null) break;
	    		writeTmpFile.write(line+"\n");
	    	
	    	}

	    	String line2=readFile.readLine();
	    	
	    	while(line2!=null){
	    		line2=readFile.readLine();
	    		if(line2==null) break;
	    		writeTmpFile.write(line2+"\n");
	    		
	    }
	    }
	    finally{
	    		writeTmpFile.close();
	            readFile.close();
	    }
	 file.delete();
	 tmpFile.renameTo(file);
	    }
 

    public boolean isFieldEmpty(String field){
     if (field==null||field.isEmpty()){
         return true;
     }
     else{
         return false;
     }
    }
    
    public boolean doFileExist(String field){
    	File file = new File(field);
    	if(file.isFile()==true){
    		return true;
    	}
    	else return false;
    }
}
