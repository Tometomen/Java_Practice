package Project.No402;

public class Student02 extends Person02{
  private int stuNo;

  public void setStuNo(int s){
    stuNo = s;
  }
  public void display(){
    System.out.println("名前：" + getName());
    System.out.println("学籍番号：" + stuNo);
  }
}
