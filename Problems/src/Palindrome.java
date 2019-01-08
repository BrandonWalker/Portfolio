/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;
import java.util.*;
/**
 *
 * @author brandon walker 
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String a;
        System.out.println("Enter a word to determine: ");
        a = in.nextLine();
        palindrome(a);
        
        
        
    }
    public static boolean palindrome(String a){
        boolean ans =false;
        int x=0;
        if(a.length()==2&&a.substring(0,1).equals(a.substring(a.length()-1))){
             if(x==0){
            System.out.println(a+" Is a paindrome");
            x=1;
             }
            }else if(a.length()==2&&a.substring(0,1)!=(a.substring(a.length()))){
              System.out.print("this is not a palindrome");
               x=+1; 
            }else if(a.length()>2&&a.substring(0,1).equals(a.substring(a.length()-1))){
                if(x==0){
              System.out.println("this is palindrome");
               x=1;
                }
                ans=palindrome(a.substring(1,a.length()-1));
            }else if(a.length()>2&&a.substring(0,1)!=(a.substring(a.length()-1))){
              System.out.println("this is not a palindrome");
               x=1;
                ans=palindrome(a.substring(1,a.length()-1));
            }else if(a.length()==1&&x==1){
                 if(x==0){
                    System.out.println(a+" Is a palindrome");
                    x=1;
                 }
            }
        
         
        
        return ans;
        
    }
    
            
    }
