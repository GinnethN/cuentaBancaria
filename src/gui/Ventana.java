package src.gui;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.ThreadLocalRandom;


public class Ventana extends JFrame {

        // componentes gráficos
        private JLabel titulo;
        private JLabel identificacionCliente;
        private JLabel nombreCliente;
        private JLabel numeroCuenta;
        private JLabel tipoCuenta;
        private JLabel saldoInicial;

        private JTextField identificacion;
        private JTextField nombre;
        private JTextField numero;
        private JTextField saldo;

        private JButton btCrear;
        private JButton btGenerar;

        private JRadioButton ahorros;
        private JRadioButton corriente;

        private String numCuentaAhorros;
        private String numCuentaCorriente;


        //Constructor ventana
        public Ventana() {
            this.setTitle("Ventana");
            this.iniciarComponentes();
            this.getContentPane().setBackground(java.awt.Color.WHITE); //Color

            this.numCuentaAhorros = "";
            this.numCuentaCorriente = "";

        }

        private void iniciarComponentes() {

            this.setTitle("Banco Mio");
            titulo = new JLabel();
            tipoCuenta = new JLabel();
            identificacionCliente = new JLabel();
            nombreCliente = new JLabel();
            numeroCuenta = new JLabel();
            saldoInicial = new JLabel();

            identificacion = new JTextField();
            nombre = new JTextField();
            numero = new JTextField();
            saldo = new JTextField();


            btCrear = new JButton();
            btGenerar = new JButton();


            //Cerrar la ventana
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(null);


            //Texto Banco mio:
            titulo.setFont(new java.awt.Font("Tahoma", 1, 20));
            titulo.setForeground(new java.awt.Color(204, 0, 0));
            titulo.setText("Banco Mio - ");
            titulo.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            getContentPane().add(titulo);

            //Alineacion texto:
            titulo.setHorizontalAlignment(JLabel.CENTER);
            titulo.setVerticalAlignment(JLabel.CENTER);
            titulo.setBounds(110, 10, 250, 18);

            //Tipo cuenta:
            tipoCuenta.setFont(new java.awt.Font("Verdana", 1, 12));
            tipoCuenta.setText("Tipo cuenta: ");
            tipoCuenta.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            getContentPane().add(tipoCuenta);
            tipoCuenta.setBounds(300, 50, 120, 30);

            //RadioButton
            this.ahorros = new JRadioButton("Ahorros");
            ahorros.setFont(new java.awt.Font("Verdana", 1, 12));
            ahorros.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            this.corriente = new JRadioButton("Corriente");
            corriente.setFont(new java.awt.Font("Verdana", 1, 12));
            corriente.setForeground(new java.awt.Color(0, 51, 102)); // Color texto

            //Grupo RadioButton
            ButtonGroup grupoCuentas = new ButtonGroup();
            grupoCuentas.add(ahorros);
            grupoCuentas.add(corriente);
            ahorros.setBounds(300, 80, 100, 30);
            ahorros.setBackground(Color.white); //fondo recuadro JradioButtons
            ahorros.setIcon(new ImageIcon(getClass().getResource("/src/img/radioButtonUnchecked.png")));
            ahorros.setSelectedIcon(new ImageIcon(getClass().getResource("/src/img/radioButtonChecked.png")));

            corriente.setBounds(300, 110, 100, 30);
            corriente.setBackground(Color.white);//fondo recuadro JradioButtons
            corriente.setIcon(new ImageIcon(getClass().getResource("/src/img/radioButtonUnchecked.png")));
            corriente.setSelectedIcon(new ImageIcon(getClass().getResource("/src/img/radioButtonChecked.png")));
            add(ahorros);
            add(corriente);


            //Identificacion:
            identificacion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
            getContentPane().add(identificacion);
            configurarPlaceholder(identificacion, " Número Documento ");
            identificacion.setForeground(java.awt.Color.GRAY);
            identificacion.setBounds(20, 80, 250, 30);
            identificacion.setBorder(new LineBorder(new java.awt.Color(0, 51, 102), 1)); //Grosor cajas texto


            identificacionCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
            identificacionCliente.setText("Identificación:");
            getContentPane().add(identificacionCliente);
            identificacionCliente.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            identificacionCliente.setBounds(20, 50, 110, 30);

            //nombre cliente:
            nombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
            getContentPane().add(nombre);
            configurarPlaceholder(nombre, " Nombre Cliente ");
            nombre.setForeground(java.awt.Color.GRAY);
            nombre.setBounds(20, 150, 250, 30);
            nombre.setBorder(new LineBorder(new java.awt.Color(0, 51, 102), 1)); //Grosor cajas texto


            nombreCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
            nombreCliente.setText("Nombre cliente:");
            getContentPane().add(nombreCliente);
            nombreCliente.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            nombreCliente.setBounds(20, 120, 110, 30);


            //Numero:
            numero.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
            getContentPane().add(numero);
            //configurarPlaceholder(numero, " 4524 XXXX");
            numero.setEnabled(false);
            numero.setForeground(java.awt.Color.GRAY);
            numero.setBounds(20, 220, 250, 30);
            numero.setBorder(new LineBorder(new java.awt.Color(0, 51, 102), 1)); //Grosor cajas texto


            numeroCuenta.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
            numeroCuenta.setText("Número:");
            getContentPane().add(numeroCuenta);
            numeroCuenta.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            numeroCuenta.setBounds(20,  190, 110, 30);


            //BtGenerar:
            btGenerar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
            btGenerar.setText("Generar");
            btGenerar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btGenerarActionPerformed(evt);
                }
            });
            btGenerar.setBackground(new java.awt.Color(0, 51, 102)); // Fondo boton
            btGenerar.setForeground(java.awt.Color.WHITE);
            btGenerar.setBorderPainted(false); // Para quitar el borde gris

            getContentPane().add(btGenerar);
            btGenerar.setBounds(300, 220, 120, 30);


            //Saldo:
            saldo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
            getContentPane().add(saldo);
            configurarPlaceholder(saldo, " $ ");
            saldo.setForeground(java.awt.Color.GRAY);
            saldo.setBounds(20, 290, 250, 30);
            saldo.setBorder(new LineBorder(new java.awt.Color(0, 51, 102))); //Grosor cajas texto

            saldoInicial.setFont(new java.awt.Font("Verdana", 1, 12));
            saldoInicial.setText("Saldo:");
            saldoInicial.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            getContentPane().add(saldoInicial);
            saldoInicial.setBounds(20, 260, 110, 30);


            //BtCrear:
            btCrear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
            btCrear.setText("Registrar");
            btCrear.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btCrearActionPerformed(evt);
                }
            });
            btCrear.setBackground(new java.awt.Color(0, 51, 102)); // Fondo boton
            btCrear.setForeground(java.awt.Color.WHITE);
            btCrear.setBorderPainted(false); // Para quitar el borde gris
            getContentPane().add(btCrear);
            btCrear.setBounds(300, 290, 120, 30);

            setSize(new java.awt.Dimension(460, 460));
            setLocationRelativeTo(null);
        }

        //Placeholder para todos los campos:
        private void configurarPlaceholder(JTextField campo, String textoAyuda) {
            campo.setText(textoAyuda);
            campo.setForeground(java.awt.Color.GRAY);

            campo.addFocusListener(new java.awt.event.FocusAdapter() {
                @Override
                public void focusGained(java.awt.event.FocusEvent evt) {
                    // Si al entrar tiene el texto de ayuda, se limpia
                    if (campo.getText().equals(textoAyuda)) {
                        campo.setText("");
                        campo.setForeground(java.awt.Color.BLACK);
                    }
                }
                @Override
                public void focusLost(java.awt.event.FocusEvent evt) {
                    // Si al salir está vacío, se pone la ayuda otra vez
                    if (campo.getText().isEmpty()) {
                        campo.setText(textoAyuda);
                        campo.setForeground(java.awt.Color.GRAY);
                    }
                }
            });
        }



        //Eventos:
        private void btGenerarActionPerformed(ActionEvent evt) {
            this.generar();
        }
        private void btCrearActionPerformed(ActionEvent evt) {
            this.crear();
        }

        //Metodos Generar y Guardar:
        private void generar() {

            if (this.numCuentaAhorros.isEmpty())
                this.numCuentaAhorros = "4524"+this.generarNumeroAletorio();
            if (this.numCuentaCorriente.isEmpty())
                this.numCuentaCorriente = "8524"+this.generarNumeroAletorio();

            if (ahorros.isSelected()){
                numero.setText(this.numCuentaAhorros);
            }else if (corriente.isSelected()){
                numero.setText(this.numCuentaCorriente);
            }else{
                JOptionPane.showMessageDialog(null,
                        "¡Selecione el tipo de cuenta!",
                        "Información",
                        JOptionPane.WARNING_MESSAGE);
            }

        }

        private void crear() {
            JOptionPane.showMessageDialog(null,
                    "Cuenta registrada con exito.",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);

        }

    private String generarNumeroAletorio(){
        int numero =  ThreadLocalRandom.current().nextInt(1000, 10000);
        String valor = String.valueOf(numero);
        return valor;
    }
    }
