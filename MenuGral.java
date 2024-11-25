package com.Menu;

import com.enums.TipoCuenta;
import com.enums.TipoDeMovimiento;
import com.enums.TipoPersona;
import com.models.*;
import com.models.funciones.Movimiento;
import com.models.funciones.Movimientos;
import org.example.Balances;

import javax.swing.JOptionPane;

public class MenuGral {
    private MenuCliente menuCliente = new MenuCliente();
    private MenuPedidos menuPedidos = new MenuPedidos();
    private MenuCuentas menuCuentas = new MenuCuentas();
    private MenuProductos menuProductos = new MenuProductos();
    private MenuProveedores menuProveedores = new MenuProveedores();
    private MenuPruebaCollections menuPruebaCollections = new MenuPruebaCollections();

    public void menuPrincipal(){
        String menuOptions = "Ingrese a donde quiere entrar: \n\n" +
                "1. Clientes. \n" + //Chequeado.
                "2. Proveedores. \n" + //Chequeado.
                "3. Pedidos. \n" +
                "4. Cuentas. \n" + //Chequeado.
                "5. Productos. \n" + //Chequeado.
                "6. Prueba de velocidad. \n" +
                "0. Salir del programa. \n";

        String input = JOptionPane.showInputDialog(null, menuOptions, "Menú principal", JOptionPane.QUESTION_MESSAGE);

        if (input == null){
            JOptionPane.showMessageDialog(null, "Sale del programa.");
            return;
        }

        int option;

        try{
            option = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            menuPrincipal();
            return;
        }

        switch (option){
            case 1:
                JOptionPane.showMessageDialog(null, "Clientes:");
                menuCliente.menuClientes();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Proveedores:");
                menuProveedores.menuProveedores();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Pedidos:");
                menuPedidos.menuPedidos();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Cuentas:");
                menuCuentas.menuCuentas();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Productos:");
                menuProductos.menuProductos();
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Prueba de velocidad:");
                menuPruebaCollections.menuPruebaCollections();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Sale del programa.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida. Intente de nuevo.");
                menuPrincipal();
                break;
        }

    }


}