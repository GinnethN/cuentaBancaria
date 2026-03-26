package src.clases;

public class Cuenta {
    private String numero;
    protected double saldo;
    private Cliente cliente;

    public Cuenta(Cliente cliente,  String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente obtenerCliente(){
        return cliente;
    }
    public String obtenerNumero(){
        return numero;
    }
  }
