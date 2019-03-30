
import java.io.BufferedReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class MaxDiff {
    public static void main(String args[])
    {
        int a[]= new int[10];
        int i,n,j;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the no of elements in the array");
       n=s.nextInt();
       System.out.println("Enter the elements of array");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            
        }
        int max_diff = a[1] - a[0]; 
     
        for (i=0;i <n;i++)  
        { 
            for (j=i + 1;j <n;j++)  
            { 
                if (a[j] - a[i] > max_diff) 
                    max_diff = a[j] - a[i]; 
            } 
        } 
        System.out.println("Maximum differnce is " +max_diff);  
                               
     
    }
    
}
