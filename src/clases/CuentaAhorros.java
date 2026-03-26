package src.clases;

import src.interfaces.IInteres;
import src.interfaces.IRetirable;

class CuentaAhorros extends Cuenta implements IRetirable, IInteres {
    public CuentaAhorros(Cliente cliente,  String numero, double saldo) {
        super(cliente, numero, saldo);
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo) saldo -= monto;
    }

    @Override
    public void aplicarInteres() {
        saldo += saldo * 0.03;
    }
}