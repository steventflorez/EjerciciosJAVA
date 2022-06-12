package org.sofka;


import java.util.logging.Logger;
import org.sofka.MessageEjercicio;
import org.sofka.punto1.Ejercicio1;

public class main {

    static MessageEjercicio menssages =MessageEjercicio.getInstance();
    static Ejercicio1 ejercicio1 = Ejercicio1.getInstance();

    public static void main(String[] args) {init();}


    private static void init(){

        menssages.showWelcome();

    }

    private static void getExcercises(){
        menssages.chooseExercises();
    }
}
