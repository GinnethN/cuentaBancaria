package src.clases;

import src.interfaces.IInteres;
import src.interfaces.IRetirable;

class CuentaAhorros extends Cuenta implements IRetirable, IInteres {
    public CuentaAhorros(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo) saldo -= monto;
    }

    @Override
    public void aplicarInteres() {
        saldo += saldo * 0.01;
    }
}