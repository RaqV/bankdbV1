/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Account;
import clases.Customer;
import clases.Movement;
import control.Dao;
import exception.DaoException;
import java.util.ArrayList;
import java.util.List;
import utilidades.Util;

/**
 *
 * @author rvalv
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DaoException {
        //
        
        int opc;
        
        do{
            opc=leerOpcionMenu();

            switch(opc){
                case 1:
                    crearCliente();
                    break;
                case 2:
                    consultarDatosCliente();
                    break;
                case 3:
                    consultarCuentasCliente();
                    break;
                case 4:
                    crearCuentaCliente();
                    break;
                case 5:
                    agregarClienteCuenta();
                    break;
                case 6:
                    consultarDatosCuenta();
                    break;
                case 7:
                    realizarMovimiento();
                    break;
                case 8:
                    consultarMovimientoCuenta();
                    break;
                default:
                    System.out.println("Agur");
            }
           } while (opc!=9);
    }

    private static int leerOpcionMenu() {
        int opc;
        
        System.out.println("*********************************************************************************");
        System.out.println("                               APLICACION BANCO");
        System.out.println("1. Crear cliente");
        System.out.println("2. Consulta datos de un cliente.");
        System.out.println("3. Consulta cuentas de un cliente.");
        System.out.println("4. Crear cuenta para un cliente.");
        System.out.println("5. Agrega un cliente a una cuenta.");
        System.out.println("6. Consulta datos de una cuenta.");
        System.out.println("7. Realizar movimiento de una cuenta.");
        System.out.println("8. Consultar movimientos de una cuenta.");
        System.out.println("9. Salir");
        System.out.println("*********************************************************************************");
        
        opc= Util.leerInt(0, 9, "Introduce la opción deseada");
        return opc;
    }

    private static void crearCliente() throws DaoException {
        Dao dao = new Dao();
        Customer clte = new Customer();
        
        clte.setDatos();
        dao.crearCliente(clte);
        System.out.println("El cliente se ha creado con el idenficador " + clte.getId());
    }

    private static void consultarDatosCliente() throws DaoException {  
        Dao dao = new Dao();
        Long id;
        Customer clte = new Customer();
        
        id = Util.leerLong("Introduce el identificador del Cliente que quieres consultar");
               
        clte = dao.consultarDatosCliente(id);
        
        clte.getDatos();
        
        if (clte==null){
            System.out.println("El Cliente no existe");
        }
    }

    private static void consultarCuentasCliente() throws DaoException {     
        Dao dao = new Dao();
        Long id;
        ArrayList<Account> ctas = new ArrayList<>();
        
        id = Util.leerLong("Introduce el identificador del Cliente del que quieres consultar las cuentas");
        
        if (dao.existeClte(id)){
            ctas = dao.consultarCuentasCliente(id);
       
            if (ctas!=null){
                System.out.printf("Las cuentas del cliente %d son: %n", id);
                for(Account c: ctas){
                    c.getDatos();
                }   
            }else {
                throw new DaoException("El cliente no tiene cuentas");
            }
        } 
        
        
    }

    private static void crearCuentaCliente() throws DaoException {   
        Dao dao = new Dao();
        Account cta;
        boolean mas = true;
        
        Long idClte = Util.leerLong("Introduce el identificador del Cliente del que quieres insertar una cuentas");
    
        if (dao.existeClte(idClte)){
            do{
                cta = new Account();
                cta.setDatos();
                dao.crearCuentaCliente(idClte, cta);
                mas = Util.leerBoolean("¿Quieres introducir mas ctas?");
            }while (mas);
        }
            
    }

    private static void agregarClienteCuenta() throws DaoException {    
        Dao dao = new Dao();
        
        Long idCta = Util.leerLong("Introduce el identificador de la Cuenta");
    
        if (dao.existeCta(idCta)){
            
            Long idClte = Util.leerLong("Introduce el identificador del Cliente");
            
            if (dao.existeClte(idClte)){
                dao.agregarClienteCuenta(idCta, idClte); 
            }
        }
    }

    private static void consultarDatosCuenta() throws DaoException {   
        Dao dao = new Dao();
        
        Long idCta = Util.leerLong("Introduce el identificador de la Cuenta");
        
        if (dao.existeCta(idCta)){
            dao.consultarDatosCuenta(idCta).getDatos();  
        }
    }

    private static void realizarMovimiento() throws DaoException {  
        Dao dao = new Dao();
        Movement mov = new Movement();
        
        Long idCta = Util.leerLong("Introduce el identificador de la Cuenta");
        
        if (dao.existeCta(idCta)){
            mov.setDatos();
            dao.realizarMovimiento(idCta, mov);
        }
    }

    private static void consultarMovimientoCuenta() throws DaoException {
        Dao dao = new Dao();
        boolean pvez = true;
       
        List<Movement> movimientos = null;
        
        Long idCta = Util.leerLong("Introduce el identificador de la Cuenta");
        
        if (dao.existeCta(idCta)){
            for ( Movement mov : dao.consultarMovimientoCuenta(idCta)){
                if (pvez){
                    pvez = false;
                    System.out.printf("Los movimientos para la cuenta %d son: ", idCta);
                }
                mov.getDatos();
            }
        }
    }  
}
