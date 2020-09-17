/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import utilidades.Util;

/**
 * Clase Customer. Los atributos son datos personales del cliente.
 * @author rvalv
 */
public class Customer {
     //Atributos.
    private long id;
    private String city;
    private String email;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private long phone;
    private String state;
    private String street;
    private int zip;

     /**
     * Constructor vacio.
     */
    public Customer() {
    }

     /**
     * Constructor pasando los atributos por parámetros.
     * @param id DNI del cliente.
     * @param city Ciudad del cliente.
     * @param email Correo electronico del cliente.
     * @param firstName Nombre del cliente.
     * @param lastName Primer apellido del cliente.
     * @param middleInitial Primera letra del segundo apellido del cliente.
     * @param phone Teléfono del cliente.
     * @param state Estado del cliente.
     * @param street Calle del cliente.
     * @param zip Código Postal del cliente.
     */
    
    public Customer(long id, String city, String email, String firstName, String lastName, String middleInitial, long phone, String state, String street, int zip) {
        this.id = id;
        this.city = city;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.phone = phone;
        this.state = state;
        this.street = street;
        this.zip = zip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
    /**
     * Muestra los datos del cliente.
     */
    public void getDatos(){
        System.out.println("El cliente "+firstName+" "+lastName+" "+middleInitial+" "+", tiene id:"+id);
        System.out.println("Email:"+email);
        System.out.println("Teléfono:"+phone);
        System.out.println("Ciudad:"+city);
        System.out.println("Estado:"+state);
        System.out.println("Calle:"+street);
        System.out.println("CP:"+zip);
    }
    /**
     * Pide los datos del cliente para asignarselos.
     */
    public void setDatos(){
        this.firstName = Util.introducirCadena("Introduce tu nombre:");
        this.lastName = Util.introducirCadena("Introduce tu apellido:");
        this.middleInitial = Util.introducirCadena("Introduce la inicial del segundo nombre:");
        this.phone = Util.leerLong("Introduce tu teléfono:");
        this.email = Util.introducirCadena("Introduce tu email:");
        this.city = Util.introducirCadena("Introduce la ciudad:");
        this.state = Util.introducirCadena("Introduce el estado:");
        this.street = Util.introducirCadena("Introduce la calle:");
        this.zip = Util.leerInt("Introduce el CP:");
    }
}
