package src.clases;

import src.interfaces.IInteres;
import src.interfaces.IRetirable;

public class CuentaCorriente extends Cuenta implements IRetirable, IInteres {
    public CuentaCorriente(Cliente cliente,  String numero, double saldo) {
        super(cliente, numero, saldo);
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo){
            saldo -= monto-1000;

        }

    }

    @Override
    public void aplicarInteres() {
        saldo += saldo * 0.01;
    }
}
