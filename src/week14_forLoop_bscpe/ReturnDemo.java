/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week14_forLoop_bscpe;


public class ReturnDemo {
    public static void main(String[] args) {        
        System.out.println(add(5, 5));
        System.out.println(add(5, 100));
        System.out.println(display());
    }
    
    public static String display(){
        System.out.println("BSCPE Goodluck!");
        return "Hello good morning!";
    }
    
    public static int add(int n1, int n2){
        System.out.println("Addition");        
        int total = n1 + n2;
        return total;
    }
    
//    public static int add(int n1, int n2){
//        System.out.println("Addition");        
//        return n1 + n2;
//    }
    
}
