package No300.Object;

public class Student3 {

    String name;
    int engScore;
    int mathScore;

    Student3(String n){
        name = n;
    }
    Student3(String n,int e,int m){
        name = n;
        engScore = e;
        mathScore = m;
    }
    void setData(int e,int m){
        engScore = e;
        mathScore = m;
    }
    void display(){
        System.out.println(name);
        System.out.println(engScore + "点" + mathScore + "点");
    }
    
}
