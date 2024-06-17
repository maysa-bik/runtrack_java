package Jour04.job01;

public class ThreadProject {
    
    public static void main(String[] args) {
        // Instanciation de MyThread
        MyThread myThread = new MyThread();

        // Démarrage de l'exécution du thread
        myThread.start();
    }
}
