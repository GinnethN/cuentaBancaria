package src.ventana;
import src.clases.Cuenta;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;


    public class Ventana extends JFrame {
        // componentes gráficos
        private JButton btCrear;
        private JButton btGenerar;
        private JLabel jLabel1;
        private JLabel jLabel2;
        private JLabel jLabel3;
        private JLabel jLabel4;
        private JScrollPane jScrollPane1;
        private JTextArea mensajesTxt;
        private JTextField mensajeNumero;
        private JTextField mensajeSaldo;

        public Ventana() {
            this.setTitle("Ventana");
            this.iniciarComponentes();
            this.getContentPane().setBackground(java.awt.Color.WHITE); //Color

        }
        private void iniciarComponentes() {

            this.setTitle("Banco Mio");
            jLabel1 = new JLabel();
            jScrollPane1 = new JScrollPane();
            mensajesTxt = new JTextArea();
            mensajeNumero = new JTextField();
            mensajeSaldo = new JTextField();
            jLabel2 = new JLabel();
            btCrear = new JButton();
            btGenerar = new JButton();
            jLabel3 = new JLabel();
            jLabel4 = new JLabel();

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(null);

            //Texto Banco mio:
            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(204, 0, 0));
            jLabel1.setText("Banco Mio ");
            jLabel1.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            getContentPane().add(jLabel1);

            //Alineacion texto:
            jLabel1.setHorizontalAlignment(JLabel.CENTER);
            jLabel1.setVerticalAlignment(JLabel.CENTER);
            jLabel1.setBounds(110, 10, 250, 18);

            //Cuenta tipo:
            jLabel3.setFont(new java.awt.Font("Verdana", 1, 12));
            jLabel3.setText("Cuenta tipo: ");
            jLabel3.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            getContentPane().add(jLabel3);
            jLabel3.setBounds(20, 60, 120, 30);

            //RadioButton
            JRadioButton ahorros = new JRadioButton("Ahorros");
            ahorros.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            JRadioButton corriente = new JRadioButton(" Corriente");
            corriente.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            //Grupo RadioButton
            ButtonGroup grupoCuentas = new ButtonGroup();
            grupoCuentas.add(ahorros);
            grupoCuentas.add(corriente);
            ahorros.setBounds(150, 60, 100, 30);
            ahorros.setBackground(Color.white); //fondo recuadro JradioButtons
            ahorros.setIcon(new ImageIcon(getClass().getResource("/src/img/radioButtonUnchecked.png")));
            ahorros.setSelectedIcon(new ImageIcon(getClass().getResource("/src/img/radioButtonChecked.png")));

            corriente.setBounds(250, 60, 100, 30);
            corriente.setBackground(Color.white);//fondo recuadro JradioButtons
            corriente.setIcon(new ImageIcon(getClass().getResource("/src/img/radioButtonUnchecked.png")));
            corriente.setSelectedIcon(new ImageIcon(getClass().getResource("/src/img/radioButtonChecked.png")));
            add(ahorros);
            add(corriente);


            //Cta Creada:
            mensajesTxt.setBorder(null); //Quitar el area de texto
            jScrollPane1.setBorder(new LineBorder(new java.awt.Color(0, 51, 102), 1)); //Grosor caja texto
            getContentPane().add(jScrollPane1);
            jScrollPane1.setBounds(30, 220, 420, 100);
            mensajesTxt.setFont(new java.awt.Font("Verdana", 0, 14));
            mensajesTxt.setText(" Cta creada: $ 45.24.7421 \n");

            mensajesTxt.setForeground(java.awt.Color.GRAY);
            mensajesTxt.setColumns(20);
            mensajesTxt.setRows(5);
            jScrollPane1.setViewportView(mensajesTxt);


            mensajeNumero.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
            getContentPane().add(mensajeNumero);
            configurarPlaceholder(mensajeNumero, " 4524 XXXX");
            mensajeNumero.setForeground(java.awt.Color.GRAY);
            mensajeNumero.setBounds(115, 100, 200, 30);
            mensajeNumero.setBorder(new LineBorder(new java.awt.Color(0, 51, 102), 1)); //Grosor cajas texto

            //Numero:
            jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
            jLabel2.setText("Número:");
            getContentPane().add(jLabel2);
            jLabel2.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            jLabel2.setBounds(20, 100, 110, 30);


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
            btGenerar.setBounds(327, 100, 120, 27);


            //Saldo inicial:
            mensajeSaldo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
            getContentPane().add(mensajeSaldo);
            configurarPlaceholder(mensajeSaldo, " $ ");
            mensajeSaldo.setForeground(java.awt.Color.GRAY);
            mensajeSaldo.setBounds(115, 140, 333, 30);
            mensajeSaldo.setBorder(new LineBorder(new java.awt.Color(0, 51, 102))); //Grosor cajas texto

            jLabel4.setFont(new java.awt.Font("Verdana", 1, 12));
            jLabel4.setText("Saldo inicial:");
            jLabel4.setForeground(new java.awt.Color(0, 51, 102)); // Color texto
            getContentPane().add(jLabel4);
            jLabel4.setBounds(20, 140, 110, 30);


            //BtCrear:
            btCrear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
            btCrear.setText("Crear");
            btCrear.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btCrearActionPerformed(evt);
                }
            });
            btCrear.setBackground(new java.awt.Color(0, 51, 102)); // Fondo boton
            btCrear.setForeground(java.awt.Color.WHITE);
            btCrear.setBorderPainted(false); // Para quitar el borde gris
            getContentPane().add(btCrear);
            btCrear.setBounds(327, 180, 120, 27);

            setSize(new java.awt.Dimension(491, 375));
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
            JOptionPane.showMessageDialog(this,"¡Número cuenta generado! ");

        }

        private void crear() {
            JOptionPane.showMessageDialog(this," ¡Cuenta creada! ");
            //String contenidoCaja = this.mensajeNumero.getText();

        }
    }
