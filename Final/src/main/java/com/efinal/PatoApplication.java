package com.efinal;

import com.efinal.controller.PatoController;
import com.efinal.model.Pato;

import java.util.Scanner;

public class PatoApplication {
    public static void main(String[] args) {
        PatoController patoController = new PatoController();
        int opcion = 0;
        Scanner s = new Scanner(System.in);
        do{
            menu();
            opcion = s.nextInt();
            switch(opcion){
                case 1:
                    patoController.listAll();
                    break;
                case 2:
                    patoController.findById();
                    break;
                case 3:
                    patoController.guardar();
                    break;
                case 4:
                    patoController.update();
                    break;
                case 5:
                    patoController.delete();
                    break;
            }
        }while(opcion != -1);
    }
    private static void menu(){
        System.out.println("-------MENU-------");
        System.out.println("1. Listar");
        System.out.println("2. Buscar por Id");
        System.out.println("3. Agregar Pato");
        System.out.println("4. Actualizar Pato");
        System.out.println("5. Eliminar Pato por Id");
        System.out.println("-1. Salir del programa");
    }
}
