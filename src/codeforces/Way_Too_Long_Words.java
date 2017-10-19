/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforces;

import java.util.Scanner;

/**
 *
 * @author J2I
 */
public class Way_Too_Long_Words {
    
    
    public static String replace(String word)
    {
        String result = "";
        if(word.length()>10)
        {
            
            result = new StringBuilder().append(word.charAt(0)).append(word.length()-2).append(word.charAt(word.length()-1)).toString();
            
        }else{
            result =word ;
        }
        
        return result ;
    }
    
    
    
    
     public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          for(int i=0 ; i<n;i++)
          {
              String s= sc.next();
                       
          System.out.println(Way_Too_Long_Words.replace(s)); 
          }

          
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
