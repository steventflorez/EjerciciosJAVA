package org.sofka;


import java.util.logging.Logger;

public class MessageEjercicio {

    private static final Logger logger = Logger.getLogger("logger");

    public static MessageEjercicio    getInstance() {
        return new MessageEjercicio();
    }

    public void showWelcome() {
        logger.info("Bienvenidos a los ejercicios JAVA");
    }

    public void chooseExercises(){logger.info("ingreza un numero del 1 al 18 para seleccionar uno de los ejercicios");}

    public void PersonalizedMessage(String message){logger.info(message);}
}
