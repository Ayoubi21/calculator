package simplecalculator;

import java.util.Scanner;




public class Simplecalculator {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //user prompt
        System.out.println("Enter first number:");
        int firstnb=input.nextInt();
        
       System.out.println("choose the operator(+,-,/,*):");
        char operator = input.next().charAt(0);
        
        System.out.println("Enter second number:");
        int secondnb=input.nextInt();
        
        
          double result = 0;
        switch(operator){
        case '+':
            result=firstnb+secondnb;
            break;
        case '-':
            result=firstnb-secondnb;
            break;
        case '/':
            result=firstnb/secondnb;
            break;
        case'*':  
            result=firstnb*secondnb;
            break;
        default:
            System.out.println("invalid number");
    }
        System.out.println("the result:"+result);
        
    }
    
}
