/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Timestamp;

/**
 * Clase CustomerAccount.
 * @author Raquel
 */
public class CustomerAccount {
    
    // ID del cliente.
    private long customers_id;
    // ID de la cuenta.
    private long accounts_id;

    public long getCustomers_id() {
        return customers_id;
    }

    public void setCustomers_id(long customers_id) {
        this.customers_id = customers_id;
    }

    public long getAccounts_id() {
        return accounts_id;
    }

    public void setAccounts_id(long accounts_id) {
        this.accounts_id = accounts_id;
    }
    
}
