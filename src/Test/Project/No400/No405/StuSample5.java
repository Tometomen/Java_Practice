package Project.No400.No405;

public class StuSample5 {

    public static void main(String[] args) {
        
        Student5 stu = new Student5("Kazuki", 10);
        Person5 psn = stu;
        psn.display();
        //psn.chgStuNo....コンパイルエラー(サブクラスのみのメソッド)

        //instanceofキーワードオブジェクトのクラスを特定する
        //対象オブジェクト　instanceofn　クラス名

        if(psn instanceof Student5){
            Student5 stu2 = (Student5)psn;
            stu2.chgStuNo(100);
            stu2.display();
        }
    }
    
}
