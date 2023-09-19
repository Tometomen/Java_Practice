package Project.No400.No405;

public class StuSample6 {

    public static void main(String[] args) {
        
    TandF TF = new TandF("陸上競技部");
    Football fb = new Football("サッカー部");

    Student6 stu1 = new Student6("Kazuki", fb);
    stu1.display();

    Student6 stu2 = new Student6("Nanako", TF);
    stu2.display();
    }
    
}
