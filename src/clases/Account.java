/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import utilidades.Util;

/**
 * Clase Account. Atributos propios de una cuenta bancaria.
 * @author 2dam
 */

public class Account {
    //Atributos.
    private long id;
    private double balance;
    private double beginBalance;
    private Timestamp beginBalanceTimestamp;
    private double creditLine;
    private String description;
    private int type;

     /**
     * Constructor vacio.
     */
    public Account() {
    }

    /**
     * Constructor vacio.
     */
    public Account(long id, double balance, double beginBalance, Timestamp beginBalanceTimestamp, double creditLine, String description, int type) {
        this.id = id;
        this.balance = balance;
        this.beginBalance = beginBalance;
        this.beginBalanceTimestamp = beginBalanceTimestamp;
        this.creditLine = creditLine;
        this.description = description;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBeginBalance() {
        return beginBalance;
    }

    public void setBeginBalance(double beginBalance) {
        this.beginBalance = beginBalance;
    }

    public Timestamp getBeginBalanceTimestamp() {
        return beginBalanceTimestamp;
    }

    public void setBeginBalanceTimestamp(Timestamp beginBalanceTimestamp) {
        this.beginBalanceTimestamp = beginBalanceTimestamp;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(double creditLine) {
        this.creditLine = creditLine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    /**
     * Muestra los datos de la cuenta.
     */
    public void getDatos(){
        System.out.println("La cuenta "+id+" tiene un balance de "+balance
                +" un balance inicial de "+beginBalance+" con fecha "+beginBalanceTimestamp);
        System.out.println(description);
        System.out.println("Tipo de cuenta:"+type);
    }
    /**
     * Pide los datos de la cuenta para asignarselos.
     */
    public void setDatos(){
        this.balance = Util.leerFloat("Introduce el balance:");
        this.beginBalance = Util.leerFloat("Intdocue el balance inicial:");
        this.beginBalanceTimestamp = Timestamp.valueOf(LocalDateTime.now());
        this.description = Util.introducirCadena("Introduce una breve descripción:");
        this.type = Util.leerInt(0,1,"Introduce el tipo:");
    } 
}
