package No300.Object;

public class StuSample2 {

    public static void main(String[] args) {
        
        Student2 stu1 = new Student2();
        Student2 stu2 = new Student2();

        stu1.setData("Kazuki");
        stu1.setData(69, 90);
        stu1.display();

        stu2.setData("Nanako", 80, 90);
        stu2.display();
    }
    
}
