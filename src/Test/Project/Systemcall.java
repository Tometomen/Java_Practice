package Project;
import java.io.IOException;

public class Systemcall {

    public static void main(String[] args){

        String[] Command={"C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE"};

        Runtime runtime = Runtime.getRuntime();

        try{

            runtime.exec(Command);

        }catch(IOException e){

            e.printStackTrace();
        
        }
    }

}