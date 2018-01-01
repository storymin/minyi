package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

public class KuaiChild extends Thread
{
     public static void main(String[] args) throws FileNotFoundException
     {
         int j=0;
         for(int i=1;i>0;i--)
          {j+=i;
            System.out.println(i);
           }
         System.out.println(j);
     }
    
}

