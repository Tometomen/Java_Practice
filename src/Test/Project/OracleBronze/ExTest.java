package Project.OracleBronze;

class ExTest extends Test{
    String disp(){
        return "ExTest";
    }
    public static void main(String[] args) {
        Test t = new ExTest();
        ExTest ex =(ExTest)t;
        System.out.println(ex.disp());
    }
}