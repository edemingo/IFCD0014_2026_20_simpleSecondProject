package es.edemingo;

public class Main {

    public static void main() {

        Pelicula elresplandor = new Pelicula("El Resplandor", "Kubrick", "Terror", 1980);

        Pelicula alien = new Pelicula();
        alien.setTitulo("Alien en octavo pasajero");
        alien.setDirector("Ridley Scott");
        alien.setAnyo(1980);
        alien.setGenero("Terror");

        /*
        IO.println(String.format("Hello there!"));

        for (int i = 1; i <= 10; i++) {
            System.out.println(getOrdinal(i));
        }
           */
    }

    public static String getOrdinal(int number) {
        if (number == 0) {
            return "0th"; // Caso especial
        }
        int mod100 = number % 100;
        if (mod100 >= 11 && mod100 <= 13) {
            return number + "th"; // 11th, 12th, 13th son excepciones
        }
        switch (number % 10) {
            case 1: return "Hello for " +  number + "st";
            case 2: return "Hello for " +  number + "nd";
            case 3: return "Hello for " +  number + "rd";
            default: return "Hello for " +  number + "th";
        }
    }

}
