import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        String abc="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<n;i++){
            String message=s.nextLine();
            String abc_2=s.nextLine();
            String decodified_message="";
            String indexes="";
            for(int j=0;j<message.length();j++){                
                if(message.charAt(j)!=' '){
                    decodified_message+=abc_2.charAt(abc.indexOf(message.charAt(j)));
                }else{
                    decodified_message+=' ';    
                }                
            }   
            System.out.println((i+1)+" "+decodified_message);    
        }           
    }
}