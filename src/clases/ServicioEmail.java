package src.clases;

import src.interfaces.Notificador;

class ServicioEmail implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}
