import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    String[] n=new String[2];
    String bs,ss;
    int limite,i,j;
    int[] cont= new int[4];
    String nl="";
    char[][] aux,aux1,aux2,aux3;

    int w,h,m_gra,m_peq;

    //Leer y llenar matrices
    while((nl=s.nextLine())!="0 0"&&s.hasNextLine()){
        n=nl.split(" ");
        m_gra=Integer.parseInt(n[0]);
        m_peq=Integer.parseInt(n[1]);

        char[][] big= new char[m_gra][m_gra];
        char[][] small= new char[m_peq][m_peq];

        for(i=0;i<m_gra;i++){
          bs=s.nextLine();
          for(j=0;j<m_gra;j++){
            big[i][j]=bs.charAt(j);
          }
        }
        for(i=0;i<m_peq;i++){
          ss=s.nextLine();
          for(j=0;j<m_peq;j++){
            small[i][j]=ss.charAt(j);
          }
        }
        //Numero maximo de validaciones del cuadro chico en el grande
        limite=(m_gra-m_peq)+1;

        cont[0]=ocurrencias(small,big,limite,m_peq);
        aux=rotar90(small, m_peq);
        cont[1]=ocurrencias(aux,big,limite,m_peq);
        aux2=rotar90(aux, m_peq);
        cont[2]=ocurrencias(aux2,big,limite,m_peq);
        aux3=rotar90(aux2, m_peq);
        cont[3]=ocurrencias(aux3,big,limite,m_peq);
        for(i=0;i<cont.length;i++){
          System.out.print(cont[i]+" ");
          cont[i]=0;
        }
        System.out.print("\n");

        /*Checar si el input estuvo bien
        for(int i=0;i<m_gra;i++){
          for(int j=0;j<m_gra;j++){
            System.out.print(big[i][j]);
          }
          System.out.println();
        }
        for(int i=0;i<m_peq;i++){
          for(int j=0;j<m_peq;j++){
            System.out.print(small[i][j]);
          }
          System.out.println();
        }*/
    }
  }
  public static char[][] rotar90(char[][] orig_m,int m_peq){
    char[][] new_m= new char[m_peq][m_peq];
    for (int i=0;i<m_peq;i++) {
        for (int j=0;j<m_peq;j++) {
            new_m[i][j]= orig_m[m_peq-j-1][i];
        }
    }
    return new_m;
  }

  public static int ocurrencias(char[][] small, char[][] big, int limite, int m_peq){
    int count=0;
    int cont=0;
    //Numero de ocurrencias totales de la matriz pequena en la grande (primeros 2 for)
    for(int i=0;i<limite;i++){
      for(int j=0;j<limite;j++){
        //Revision de caracteres individuales dentro de lso limitees dictados por el tamano de la matriz pequena
        for(int k=0;k<m_peq;k++){
          for(int l=0;l<m_peq;l++){
            if(small[k][l]==big[k+i][l+j]){
              //Contador de caracteres de matriz pequena
              count++;
            }
          }
        }
        //Contador de ocurrencias aumenta si el contador de caracteres es igual al  de la matriz pequena
        if(count==(m_peq*m_peq)){
          cont++;
        }
        count=0;
      }
    }
    return cont;
  }
}
