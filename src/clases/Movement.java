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
 * Clase Movement. Atributos propios de un movimiento entre cuentas bancaria.
 * @author rvalv
 */
public class Movement {
    //Atributos.
    private long id;
    private double amount;
    private double balance;
    private String description;
    private Timestamp timestamp;
    private long account_id;

     /**
     * Constructor vacio.
     */
    public Movement() {
    }

     /**
     * Constructor pasandole los atributos como parámetros.
     * @param id ID del movimiento bancario.
     * @param amount Saldo que se envia.
     * @param balance Balance de la cuenta.
     * @param description Descripción del movimiento bancario.
     * @param timestamp Fecha en el que se realiza.
     * @param account_id Cuenta desde la ques se realiza el movimiento bancario.
     */
    public Movement(long id, double amount, double balance, String description, Timestamp timestamp, long account_id) {
        this.id = id;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.timestamp = timestamp;
        this.account_id = account_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }
   
     /**
     * Muestra los datos del movimiento.
     */
    public void getDatos(){
        System.out.println("Id:"+id);
        System.out.println("Cantidad:"+amount);
        System.out.println("Balance:"+balance);
        System.out.println("Fecha:"+timestamp);
        System.out.println("Descripcion:"+description);
    }
    /**
     * Pide los datos del movimiento para asignarselos.
     */
    public void setDatos(){
        amount = Util.leerFloat("Introduce la cantidad:");
        balance = Util.leerFloat("Introduce el balance:");
        timestamp = Timestamp.valueOf(LocalDateTime.now());
        description = Util.introducirCadena("Introduce una descripcion:");
    } 
}
