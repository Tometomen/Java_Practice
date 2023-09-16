package Project.No400.No405;

public class Student5 extends Person5 {

    private int stuNo;

    public Student5(String name,int stuNo){
        super("Kazuki");
        this.stuNo = stuNo;
    }
    public void display(){
        super.display();
        System.out.println("Number : " + stuNo);
    }
    public void chgStuNo(int stuNo){
        this.stuNo = stuNo;
    }
    
}
