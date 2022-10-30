package com.generation;

public class Codigo4 {

    //Se agrega el metodo public Static
    public static void main(String[] args) {

        //se agrega System.in
        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 introduzca piedra papel o tijeras: ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 introduzca piedra papel o tijeras: ");
        String j2 = s.nextLine();

        //se agrrega .equals para validar los strings.
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int ganador = 2;

            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        ganador = 1;
                    }
                    break;

                case "papel":
                    if (j2.equals("piedra")) {
                        ganador = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        ganador = 1;
                    }
            }
            System.out.println("Gana el jugador " + ganador);
        }
    }
}