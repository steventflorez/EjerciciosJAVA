package org.sofka.punto1;


import org.sofka.MessageEjercicio;
import org.sofka.main;

public class Ejercicio1 extends main {

    static MessageEjercicio menssages =MessageEjercicio.getInstance();
    public static Ejercicio1 getInstance() {
        return new Ejercicio1();
    }

    public void runEjercise(){
        menssages.PersonalizedMessage("Estamos en el ejercicio 1");
    }


}
