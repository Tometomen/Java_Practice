package Project.No400.No405;

public abstract class Club {

    private String name;

    public Club(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Name : " + name);
    }
    //定義のみ
    public abstract void practice();

    
}
