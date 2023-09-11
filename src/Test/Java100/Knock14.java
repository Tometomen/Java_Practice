package Java100;

public class Knock14 {
    private String name = createName();
    private String createName(){
        return "create_name=" + name;
    }
    public static void main(String[] args){
        System.out.println(new Knock14().name);
    }
    
}
