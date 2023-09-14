package No300.Object;

public class StuSample3 {

    public static void main(String[] args) {
        Student3 stu1 = new Student3("Kazuki", 80 , 70);
        Student3 stu2 = new Student3("Nanako");

        stu1.setData(70, 60);
        stu1.display();

        stu2.setData(100, 20);
        stu2.display();
    }
    
}
