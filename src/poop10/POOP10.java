/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author Rojas Castañeda Adolfo
 */
public class POOP10 {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        String mensajes[]={"Primero", "Segundo", "Tercero"};
        
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println(mensajes[i]);//Bounds->limite
            }
        }catch (ArrayIndexOutOfBoundsException e){//agrergar e al final del argumento
            System.out.println("Error");
            System.out.println(e.getMessage());//mesaje sobre cual es el error
        }
         
        try{
           double x;
            x=5/0;
            System.out.println(x); 
        } catch(ArithmeticException e){
            System.out.println("Error: division entre cero");
            System.out.println(e.getMessage());
        }
        System.out.println("Hola mundo 2");
        
        try{
           double x;
            x=5/0;
            System.out.println(x); 
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: division entre cero");
            System.out.println(e.getMessage());
        } catch(ArithmeticException e){
            System.out.println("Error: division entre cero");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Error: division entre cero");
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("Hola mundo 3");
        
        double division;
        try{
            division=metodoDivision(6,0);
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Error: division entre cero");
            System.out.println(e.getMessage());
        }
        
        Cuenta cuenta = new Cuenta();
        try{
            cuenta.depositar(2000);
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.depositar(200);
            cuenta.retirar(100);
        }catch (SaldoInsuficienteException e){
        }      
    }

    private static double metodoDivision(float f, double d)throws ArithmeticException {
        return f/d;
            
    }
    
}
