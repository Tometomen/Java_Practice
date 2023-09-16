package Project.Test;

public class NoObject {

    public static void main(String[] args) {

      int[] score ={80,100,75};
      String[] name ={"菅原","村山","寺田"};

      for(int i = 0 ; i < score.length ; i++){
          System.out.println(name[i] + ":" + score[i]);
        }
    }
}
