package Project.No400.No401;

public class Student extends Person{
    private int stuNo;

    public void setStuNo(int s){
        stuNo = s;
    }
    public void displayStuNo(){
        System.out.println("No : "+ stuNo);
    }
}