package Project;

public class Car {

   int no;
   int speed;

   void setNo(int n){
      this.no = n;
    }
    void run(int s){
        speed = s;
    }
    void stop(){
        speed = 0;
    }
    void display(){
        System.out.println("No/" +no + ":Speed/" +speed);
    }
    
}
