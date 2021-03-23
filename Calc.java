/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUSTAQEEM MEHDI
 */
import java.util.Scanner;
public class Calc {
      public static void main(String[] args)
       {
       int a;
       int b;
       char ch,opt;
       Scanner input=new Scanner(System.in);
       Calc objcalc=new Calc();                           // object create
    do
         {     
         System.out.println("enter f or F for functions or enter A or a for array");
         ch=input.next().charAt(0);
   if(ch=='f'||ch=='F')               // decission making for array and function
         {
         System.out.println("please enter first number");
         a=input.nextInt();
         System.out.println("please enter second number");
         b=input.nextInt();
         System.out.println("please enter operator");
        opt=input.next().charAt(0);
   switch(opt)
        {
         case '+' ->           
         {  int c=objcalc.sum(a,b);
            System.out.println("sum ="+c);
         }
          case '-' ->      
         { int d=objcalc.sub(a,b);
          System.out.println("sub ="+d);
         }
          case '*' ->           
         {   int e=objcalc.mul(a,b);
          System.out.println("mul ="+e);
         }
          case '/' ->  
         {
         int f= objcalc.div(a,b);
          System.out.println("div ="+f);
         }
        }
        }
   else if(ch=='A'||ch=='a')
       
       {
   System.out.println("enter S or s for sorting of array and A or a for adding");
	ch=input.next().charAt(0);
     if(ch=='s'||ch=='S')
         
	{
	objcalc.sort();	
	}
     else if(ch=='A'||ch=='a')
	{
	objcalc.add();
	}
     else
     {
         System.out.println("you put wrong character");
     }
     }
   else
       {
       System.out.println("you put wrong character");
       }
   System.out.println("enter Y or y if you run again program");
         ch=input.next().charAt(0);
    }while(ch=='Y'||ch=='y');
        }
  int sum(int x,int y)                     // performing addition
                        { return x+y;}
  int sub(int x,int y)                     // performing subtraction
                        { return x-y; }
   int mul(int x,int y)                    // performing multiplication
                         { return x*y; }
  int div(int x,int y)                     // performing division
                         { return x/y; }
  void sort()                              // sorting of array element in assecnding order
       {
        int num,i,j;
	int temp;
        Scanner input=new Scanner(System.in);
      System.out.println("how many elements you want to put in array");
     num=input.nextInt();
     int[] arr=new int[num];
   for(i=0; i<num; i++)
	  {
           System.out.println("enter " +(i+1) + " element");
           arr[i]=input.nextInt();
	   }
    for(i=0;i<num;i++)
       {		
           for(j=i+1;j<num;j++)
	     {
	      if(arr[i]>arr[j])
		{
		temp  =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
	     }
	}
       //print sorted array elements
     System.out.println("Sorted (Ascending Order) Array elements");
  for(i=0;i<num;i++)
        { System.out.println(arr[i]); }
        }
 void add()                            // performing addition of array elements
    {
        int num,i;
        int sum=0;
        Scanner input=new Scanner(System.in);
   System.out.println("	how many elements you want to put in array array");
	num=input.nextInt();
	int[] arr=new int[num];
	for(i=0; i<num; i++)
	{
           System.out.println("enter " +(i+1) + " element");
           arr[i]=input.nextInt();
           sum=sum+arr[i];
        } 
    System.out.println("sum of array is " +sum);
       }
       }