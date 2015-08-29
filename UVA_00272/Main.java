import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String x="";
    boolean flag=false;
    while(s.hasNextLine()){
      x= s.nextLine();
      String n="";
      for(int i=0;i<x.length();i++){
        if(x.charAt(i)=='\"'){
          if(!flag){
            n="``";
            flag=true;
          }else{
            n="''";
            flag=false;
          }
          x=x.substring(0,i)+n+x.substring(i+1);
        }
      }
      System.out.println(x);
    }
  }
}
