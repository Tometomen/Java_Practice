package No300.Object;

public class StuSample {

    public static void main(String[] args) {
        
        Student stu = new Student();

        stu.name = "KAZUKI";

        stu.setScore(73, 62);
        stu.display();
        System.out.println(stu.getAvg()+ "点");


    }
    
}
