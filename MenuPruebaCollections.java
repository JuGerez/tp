package com.Menu;

import javax.swing.*;

public class MenuPruebaCollections extends MenuGral{

    public void menuPruebaCollections(){
        String menuPruebaCollections = "Ingrese una opción: \n\n" +
                "1. List: ArrayList vs Vector vs Deque \n" +
                "2. Set: HashSet vs LinkedHashSet vs TreeSet \n" +
                "3. Map: HashMap vs LinkedHashMap vs TreeMap \n" +
                "0. Volver al Menú Principal. \n";

        String input = JOptionPane.showInputDialog(null, menuPruebaCollections, "Menu Prueba de Collecciones:", JOptionPane.QUESTION_MESSAGE);

        if(input == null){
            JOptionPane.showMessageDialog(null, "Error: Vuelve al menú anterior.");
            return;
        }

        int option;

        try{
            option = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Opción no válida. Intente de nuevo.");
            menuPruebaCollections();
            return;
        }

        switch (option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Vuelve al menú principal." );
                menuPrincipal();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida. Vuelva a intentarlo:");
                menuPruebaCollections();
                break;
        }
    }
}
