import java.io.*;
import java.util.*;
  public class Line{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      float X[]=new float[3];
      float Y[]=new float[3];
     
      for(int i=0;i<3;i++)
      {
        System.out.print("X["+(i+1)+"]:");
        X[i]=sc.nextFloat();
        System.out.print("Y["+(i+1)+"]:");
        Y[i]=sc.nextFloat();
      }
      
      if(((Y[2]-Y[1])*(X[1]*X[0]))==((Y[1]-Y[0])*(X[2]-X[1])))
      {
      System.out.println("Yes");
      }
      else{
      System.out.println("No");
      }
    }
  }  
  
  
  
  
  
  //(y2-y1)*(x1-x0)=(y1-y0)*(x2-x1)
        
      
