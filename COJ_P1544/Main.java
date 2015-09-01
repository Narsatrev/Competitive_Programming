import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) {
      Scanner s= new Scanner(System.in);

      String[] m;

      Stack<Integer> p= new Stack<Integer>();

      while(s.hasNextLine()){

        boolean flag=true;
        Stack<Integer> n= new Stack<Integer>();
        //Leer y llenar matrioshka
        m=s.nextLine().split(" ");
        int[] m2= new int[m.length];
        for(int i=0;i<m.length;i++){
          m2[i]=Integer.parseInt(m[i]);
        }

        for(int i=0;i<m2.length;i++){
          if(m2[i]<0){
            n.push(m2[i]);
          }else{
            int x=n.peek();
            if(m2[i]>Math.abs(x)){
              flag=false;
              break;
            }else{
              if(m2[i]==Math.abs(x)){
                n.pop();
              }
            }
          }
        }

        if(flag){
          System.out.println("Matrioshka!");
        }else{
          System.out.println("Not Matrioshka!");
        }
      }
  }
}
