package No300.Object;

public class Student5 {

    private String name;
    int score;

    public Student5(String n){
        name = n;
    }
    public void setScore(int s){
        if(0 <= s && s <= 100){
            score = s;
        }else{
            System.out.println(name + "さんの点数は例外です。");
            score = 0;
        }
    }
    void display(){
        System.out.println(name+ "さん "+score+ "点");
    }
    
}
