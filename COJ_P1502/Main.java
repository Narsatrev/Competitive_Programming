import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    Scanner s= new Scanner(new BufferedInputStream(System.in));
    int n=s.nextInt();
    for(int i=0;i<n;i++){
      double L=s.nextDouble();
      double x1,y1,x2,y2,x3,y3,x4,y4;
      x1=x2=x3=x4=y1=y2=y3=y4=0;
      double sqrt=Math.sqrt(3)/2;
      x1=-L*2/3;
      y1=(L*(2+sqrt))/3;
      y2=(L*(2+sqrt))/3;
      x3=L*2/3;
      y3=y1;
      y4=(L*(3+sqrt))/3;
      double r=((x1*y2-y1*x2)+(x2*y3-y2*x3)+(x3*y4-y3*x4)+(x4*y1-y4*x1))/2;
      if(r<0){
        r*=-1;
      }
      String g=String.format("%.3f", r);
      System.out.println(g.replace('.',','));

    }
  }
}
