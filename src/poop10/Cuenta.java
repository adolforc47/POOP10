package poop10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rojas Castañeda Adolfo
 */
public class Cuenta {
    
    private double saldo;
    
    public Cuenta(){
        saldo=0;
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double monto){
        System.out.println("Depositando"+monto);
        saldo+=monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando"+monto);
        if (saldo<monto) {
            throw new SaldoInsuficienteException();
        }
        else
            saldo-=monto;
    }
    
    public double getSaldo(){
        return saldo;
    }

  }


