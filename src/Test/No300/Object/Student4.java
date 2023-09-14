package No300.Object;

public class Student4 {
    String name;
    int counter = 0;

    Student4(String n){
        name = n;
        counter++;//インクリメント
        System.out.println(name +"をインスタンス化しました");
    }
    void display(){
        System.out.println(counter + "人です");
    }
    
}
