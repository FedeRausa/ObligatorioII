//Fernando Martinez(194360) - Federico Riaño(207356)// 
package interfaz;

import Dominio.Cliente;
import Dominio.Evaluacion;
import Dominio.Sistema;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Dominio.Restoran;
import Dominio.Sorteo;
import java.util.Iterator;


public class Principal extends javax.swing.JFrame {

    ImageIcon check = new ImageIcon(getClass().getResource("/interfaz/Imagenes/edit.png"));
    ImageIcon noCheck = new ImageIcon(getClass().getResource("/interfaz/Imagenes/del.png"));
    ImageIcon defau = new ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"));

    String eID = "";
    String eNombre = "";
    String eDireccion = "";
    String eHoraApertura = "";
    String eHoraCierre = "";

    private Sistema modelo;

    public Principal(Sistema unModelo) {
        this.modelo = unModelo;

        initComponents();
        modelo.cargarRestoran();
        modelo.cargarClientes();
        mostrarMatriz();

        llenarListaClientes();
        tablaRestorant.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tablaRestorant.getSelectedRow();
                eID = tablaRestorant.getValueAt(i, 0).toString();
                eNombre = (tablaRestorant.getValueAt(i, 1).toString());
                eDireccion = (tablaRestorant.getValueAt(i, 2).toString());
                eHoraApertura = (tablaRestorant.getValueAt(i, 3).toString());
                eHoraCierre = (tablaRestorant.getValueAt(i, 4).toString());

            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnsEstrellas = new javax.swing.ButtonGroup();
        panelEvaluacion = new javax.swing.JTabbedPane();
        panelFichaRestorant = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRestorant = new javax.swing.JTable();
        panelDatos = new javax.swing.JPanel();
        txtDireccionRestorant = new javax.swing.JTextField();
        txtHoraApertura = new javax.swing.JTextField();
        comboComidas = new javax.swing.JComboBox<>();
        txtHoraCierre = new javax.swing.JTextField();
        txtNombreRestaurant = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtEditarNombre = new javax.swing.JTextField();
        txtEditarHoraApertura = new javax.swing.JTextField();
        txtEditarHoraCierre = new javax.swing.JTextField();
        txtEditarDireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboComidasEditar = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnRegistrarRestorant = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        unaEstrella = new javax.swing.JRadioButton();
        dosEstrellas = new javax.swing.JRadioButton();
        tresEstrellas = new javax.swing.JRadioButton();
        cuatroEstrellas = new javax.swing.JRadioButton();
        cincoEstrellas = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        checkAnonimo = new javax.swing.JCheckBox();
        lblNombreCli = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblMail1 = new javax.swing.JLabel();
        comboRestoran = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btnCalificar = new javax.swing.JButton();
        btnSalirEvaluacion = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        cajaResena = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstClientes = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtCantidadG = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tAreaNotificacion = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        lblCantidadGan = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnSorteo = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstGanadores = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnSalirSorteo = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstMailNotificacion = new javax.swing.JList<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEvaluacion.setBackground(new java.awt.Color(255, 153, 51));
        panelEvaluacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 2, true));
        panelEvaluacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEvaluacionMouseClicked(evt);
            }
        });
        panelEvaluacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelEvaluacionKeyPressed(evt);
            }
        });

        panelFichaRestorant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaRestorant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        tablaRestorant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Dirección", "Hora Apertura", "Hora Cierre", "Tipo Comida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaRestorant.setGridColor(new java.awt.Color(0, 0, 0));
        tablaRestorant.setRowHeight(30);
        jScrollPane2.setViewportView(tablaRestorant);

        panelDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        txtDireccionRestorant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionRestorantFocusLost(evt);
            }
        });
        txtDireccionRestorant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionRestorantKeyTyped(evt);
            }
        });

        txtHoraApertura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraAperturaFocusLost(evt);
            }
        });
        txtHoraApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraAperturaActionPerformed(evt);
            }
        });
        txtHoraApertura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraAperturaKeyTyped(evt);
            }
        });

        comboComidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Vegetariano  ", "Macrobiótico", "De pescados y mariscos", "Carnes Rojas y Aves", "Todo tipo de comidas", "Otro" }));
        comboComidas.setToolTipText("");
        comboComidas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        comboComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboComidasActionPerformed(evt);
            }
        });

        txtHoraCierre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoraCierreFocusLost(evt);
            }
        });
        txtHoraCierre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraCierreKeyTyped(evt);
            }
        });

        txtNombreRestaurant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreRestaurantFocusLost(evt);
            }
        });
        txtNombreRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRestaurantActionPerformed(evt);
            }
        });
        txtNombreRestaurant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreRestaurantKeyTyped(evt);
            }
        });

        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"))); // NOI18N
        lblNombre.setMaximumSize(new java.awt.Dimension(30, 30));
        lblNombre.setMinimumSize(new java.awt.Dimension(30, 30));
        lblNombre.setPreferredSize(new java.awt.Dimension(30, 30));

        lblNombre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"))); // NOI18N
        lblNombre1.setMaximumSize(new java.awt.Dimension(30, 30));
        lblNombre1.setMinimumSize(new java.awt.Dimension(30, 30));
        lblNombre1.setPreferredSize(new java.awt.Dimension(30, 30));
        lblNombre1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblNombre1FocusLost(evt);
            }
        });

        lblNombre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"))); // NOI18N
        lblNombre2.setMaximumSize(new java.awt.Dimension(30, 30));
        lblNombre2.setMinimumSize(new java.awt.Dimension(30, 30));
        lblNombre2.setPreferredSize(new java.awt.Dimension(30, 30));
        lblNombre2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblNombre2FocusLost(evt);
            }
        });

        lblNombre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"))); // NOI18N
        lblNombre3.setMaximumSize(new java.awt.Dimension(30, 30));
        lblNombre3.setMinimumSize(new java.awt.Dimension(30, 30));
        lblNombre3.setPreferredSize(new java.awt.Dimension(30, 30));
        lblNombre3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblNombre3FocusLost(evt);
            }
        });

        lblNombre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"))); // NOI18N
        lblNombre4.setMaximumSize(new java.awt.Dimension(30, 30));
        lblNombre4.setMinimumSize(new java.awt.Dimension(30, 30));
        lblNombre4.setPreferredSize(new java.awt.Dimension(30, 30));
        lblNombre4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblNombre4FocusLost(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Dirección");

        jLabel3.setText("Hora Apertura");

        jLabel4.setText("Hora Cierre");

        jLabel6.setText("ID");

        jLabel5.setText("Tipo de Comidas");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboComidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(txtHoraCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(txtHoraApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDireccionRestorant, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNombreRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtDireccionRestorant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHoraApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHoraCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboComidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        txtEditarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditarNombreKeyTyped(evt);
            }
        });

        txtEditarHoraApertura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditarHoraAperturaKeyTyped(evt);
            }
        });

        txtEditarHoraCierre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditarHoraCierreKeyTyped(evt);
            }
        });

        txtEditarDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditarDireccionKeyTyped(evt);
            }
        });

        jButton1.setText("Guardar Cambios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblID.setText("ID");

        jLabel7.setText("Nombre");

        jLabel8.setText("Hora Apertura");

        jLabel9.setText("Dirección");

        jLabel10.setText("Hora Cierre");

        comboComidasEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Vegetariano  ", "Macrobiótico", "De pescados y mariscos", "Carnes Rojas y Aves", "Todo tipo de comidas", "Otro" }));
        comboComidasEditar.setToolTipText("");
        comboComidasEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        comboComidasEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboComidasEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEditarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(txtEditarDireccion))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEditarHoraCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtEditarHoraApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboComidasEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblID)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(comboComidasEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtEditarHoraApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditarHoraCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(txtEditarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        btnRegistrarRestorant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/add.png"))); // NOI18N
        btnRegistrarRestorant.setText("Registrar");
        btnRegistrarRestorant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRestorantActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/del.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/door.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarRestorant, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrarRestorant)
                .addGap(34, 34, 34)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(31, 31, 31)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelFichaRestorantLayout = new javax.swing.GroupLayout(panelFichaRestorant);
        panelFichaRestorant.setLayout(panelFichaRestorantLayout);
        panelFichaRestorantLayout.setHorizontalGroup(
            panelFichaRestorantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFichaRestorantLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelFichaRestorantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(panelFichaRestorantLayout.createSequentialGroup()
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        panelFichaRestorantLayout.setVerticalGroup(
            panelFichaRestorantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFichaRestorantLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelFichaRestorantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEvaluacion.addTab("Ficha de Restaurante", panelFichaRestorant);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        btnsEstrellas.add(unaEstrella);
        unaEstrella.setText("1");
        unaEstrella.setBorderPainted(true);

        btnsEstrellas.add(dosEstrellas);
        dosEstrellas.setText("2");
        dosEstrellas.setBorderPainted(true);

        btnsEstrellas.add(tresEstrellas);
        tresEstrellas.setText("3");
        tresEstrellas.setBorderPainted(true);

        btnsEstrellas.add(cuatroEstrellas);
        cuatroEstrellas.setText("4");
        cuatroEstrellas.setBorderPainted(true);

        btnsEstrellas.add(cincoEstrellas);
        cincoEstrellas.setSelected(true);
        cincoEstrellas.setText("5");
        cincoEstrellas.setBorderPainted(true);

        jLabel20.setText("Calificar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(unaEstrella)
                .addGap(35, 35, 35)
                .addComponent(dosEstrellas)
                .addGap(35, 35, 35)
                .addComponent(tresEstrellas)
                .addGap(35, 35, 35)
                .addComponent(cuatroEstrellas)
                .addGap(35, 35, 35)
                .addComponent(cincoEstrellas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosEstrellas)
                    .addComponent(unaEstrella)
                    .addComponent(jLabel20)
                    .addComponent(tresEstrellas)
                    .addComponent(cuatroEstrellas)
                    .addComponent(cincoEstrellas))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        jLabel16.setText("Nombre");

        jLabel17.setText("Email");

        jLabel18.setText("Edad");

        txtNombreCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreClienteFocusLost(evt);
            }
        });
        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

        txtMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailFocusLost(evt);
            }
        });

        txtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEdadFocusLost(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        checkAnonimo.setText("Deseo hacer la evaluación anónima");
        checkAnonimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnonimoActionPerformed(evt);
            }
        });

        lblNombreCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"))); // NOI18N
        lblNombreCli.setMaximumSize(new java.awt.Dimension(30, 30));
        lblNombreCli.setMinimumSize(new java.awt.Dimension(30, 30));
        lblNombreCli.setPreferredSize(new java.awt.Dimension(30, 30));
        lblNombreCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblNombreCliFocusLost(evt);
            }
        });

        lblEdad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"))); // NOI18N
        lblEdad.setMaximumSize(new java.awt.Dimension(30, 30));
        lblEdad.setMinimumSize(new java.awt.Dimension(30, 30));
        lblEdad.setPreferredSize(new java.awt.Dimension(30, 30));
        lblEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblEdadFocusLost(evt);
            }
        });

        lblMail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"))); // NOI18N
        lblMail1.setMaximumSize(new java.awt.Dimension(30, 30));
        lblMail1.setMinimumSize(new java.awt.Dimension(30, 30));
        lblMail1.setPreferredSize(new java.awt.Dimension(30, 30));
        lblMail1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblMail1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(checkAnonimo))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(10, 10, 10)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkAnonimo)
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(lblMail1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        comboRestoran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Restaurante" }));
        comboRestoran.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        btnCalificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/edit.png"))); // NOI18N
        btnCalificar.setText("Claificar");
        btnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificarActionPerformed(evt);
            }
        });

        btnSalirEvaluacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/door.png"))); // NOI18N
        btnSalirEvaluacion.setText("Salir");
        btnSalirEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirEvaluacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalificar, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(btnSalirEvaluacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnCalificar)
                .addGap(57, 57, 57)
                .addComponent(btnSalirEvaluacion)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        cajaResena.setColumns(20);
        cajaResena.setRows(5);
        jScrollPane4.setViewportView(cajaResena);

        jLabel11.setText("Escriba un comentario");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(comboRestoran, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 518, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRestoran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        panelEvaluacion.addTab("Realizar Evaluación", jPanel2);

        lstClientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jScrollPane3.setViewportView(lstClientes);

        jLabel12.setText("Clientes Participantes");

        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        jLabel13.setText("Cantidad de ganadores");

        txtCantidadG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadGFocusLost(evt);
            }
        });
        txtCantidadG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadGKeyTyped(evt);
            }
        });

        jLabel15.setText("Fecha");

        txtFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFocusLost(evt);
            }
        });
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        tAreaNotificacion.setColumns(20);
        tAreaNotificacion.setRows(5);
        jScrollPane6.setViewportView(tAreaNotificacion);

        jLabel19.setText("Notificación");

        lblCantidadGan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"))); // NOI18N
        lblCantidadGan.setMaximumSize(new java.awt.Dimension(30, 30));
        lblCantidadGan.setMinimumSize(new java.awt.Dimension(30, 30));
        lblCantidadGan.setPreferredSize(new java.awt.Dimension(30, 30));
        lblCantidadGan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblCantidadGanFocusLost(evt);
            }
        });

        lblFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/icons16.png"))); // NOI18N
        lblFecha.setMaximumSize(new java.awt.Dimension(30, 30));
        lblFecha.setMinimumSize(new java.awt.Dimension(30, 30));
        lblFecha.setPreferredSize(new java.awt.Dimension(30, 30));
        lblFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblFechaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidadG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCantidadGan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(116, 116, 116)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCantidadGan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCantidadG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        btnSorteo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/add.png"))); // NOI18N
        btnSorteo.setText("Realizar Sorteo");
        btnSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorteoActionPerformed(evt);
            }
        });

        lstGanadores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jScrollPane5.setViewportView(lstGanadores);

        jLabel14.setText("Ganadores");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/Machine.jpg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(btnSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnSorteo)
                .addGap(19, 19, 19)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        btnSalirSorteo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/door.png"))); // NOI18N
        btnSalirSorteo.setText("Salir");
        btnSalirSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirSorteoActionPerformed(evt);
            }
        });

        lstMailNotificacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jScrollPane7.setViewportView(lstMailNotificacion);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(btnSalirSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalirSorteo)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        panelEvaluacion.addTab("Realizar un sorteo", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEvaluacion)
        );

        panelEvaluacion.getAccessibleContext().setAccessibleName("FichaRestorant");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboComidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboComidasActionPerformed

    private void txtHoraAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraAperturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraAperturaActionPerformed

    private void txtNombreRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRestaurantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRestaurantActionPerformed
    //Registra un restoran.//
    private void btnRegistrarRestorantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRestorantActionPerformed
        if (validarRestorant()) {
            Restoran restoran = new Restoran(Integer.parseInt(txtID.getText()), txtNombreRestaurant.getText(), txtDireccionRestorant.getText(), Integer.parseInt(txtHoraApertura.getText()), Integer.parseInt(txtHoraCierre.getText()), comboComidas.getSelectedItem().toString());
            modelo.agregarRestoran(restoran);
            mostrarMatriz();
            JOptionPane.showMessageDialog(null, "Se ha agregado una nueva Ficha !!", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
            txtID.setText("");
            txtNombreRestaurant.setText("");
            txtDireccionRestorant.setText("");
            txtHoraApertura.setText("");
            txtHoraCierre.setText("");
            comboComidas.setSelectedIndex(0);
            lblNombre.setIcon(defau);
            lblNombre1.setIcon(defau);
            lblNombre2.setIcon(defau);
            lblNombre3.setIcon(defau);
            lblNombre4.setIcon(defau);
    }//GEN-LAST:event_btnRegistrarRestorantActionPerformed
    }
    //Borra un restoran.//
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (eNombre.equals("") || eID.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione de la tabla el Restorant a borrar.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < modelo.getListaRestoranes().size(); i++) {
                if (eNombre.equals(modelo.getListaRestoranes().get(i).getNombre())) {
                    modelo.getListaRestoranes().remove(i);
                }
            }
            mostrarMatriz();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed
    //Permite editar los datos de un restoran.//
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (eNombre.equals("") || eID.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione de la tabla el Restorant a editar.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

        }else{
            txtEditarNombre.setText(eNombre);
            txtEditarDireccion.setText(eDireccion);
            txtEditarHoraApertura.setText(eHoraApertura);
            txtEditarHoraCierre.setText(eHoraCierre);
            lblID.setText(eID);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void comboComidasEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboComidasEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboComidasEditarActionPerformed
    //Realiza la edicion del restoran seleccionado.//
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validarEditarRestorant()) {
            for (int i = 0; i < modelo.getListaRestoranes().size(); i++) {
                if (Integer.parseInt(lblID.getText()) == modelo.getListaRestoranes().get(i).getIdRestorant()) {
                    modelo.getListaRestoranes().get(i).setNombre(txtEditarNombre.getText());
                    modelo.getListaRestoranes().get(i).setDireccion(txtEditarDireccion.getText());
                    modelo.getListaRestoranes().get(i).setApertura(Integer.parseInt(txtEditarHoraApertura.getText()));
                    modelo.getListaRestoranes().get(i).setCierre(Integer.parseInt(txtEditarHoraCierre.getText()));
                    modelo.getListaRestoranes().get(i).setComida(comboComidasEditar.getSelectedItem().toString());
                }
            }
            lblID.setText("ID");
            txtEditarNombre.setText("");
            txtEditarDireccion.setText("");
            txtEditarHoraApertura.setText("");
            txtEditarHoraCierre.setText("");
            comboComidasEditar.setSelectedIndex(0);
            mostrarMatriz();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreRestaurantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreRestaurantKeyTyped
        if (txtNombreRestaurant.getText().length() >= 20) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreRestaurantKeyTyped

    private void txtDireccionRestorantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionRestorantKeyTyped
        if (txtDireccionRestorant.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionRestorantKeyTyped

    private void txtHoraAperturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraAperturaKeyTyped
        if (txtHoraApertura.getText().length() >= 5) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (!Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHoraAperturaKeyTyped

    private void txtHoraCierreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraCierreKeyTyped
        if (txtHoraCierre.getText().length() >= 5) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (!Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHoraCierreKeyTyped

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        if (txtID.getText().length() >= 5) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (!Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtEditarNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditarNombreKeyTyped
        if (txtEditarNombre.getText().length() >= 20) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEditarNombreKeyTyped

    private void txtEditarDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditarDireccionKeyTyped
        if (txtEditarDireccion.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEditarDireccionKeyTyped

    private void txtEditarHoraCierreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditarHoraCierreKeyTyped
        if (txtEditarHoraCierre.getText().length() >= 5) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (!Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEditarHoraCierreKeyTyped

    private void txtEditarHoraAperturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditarHoraAperturaKeyTyped
        if (txtHoraApertura.getText().length() >= 5) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (!Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEditarHoraAperturaKeyTyped

    private void txtNombreRestaurantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreRestaurantFocusLost
        if (!txtNombreRestaurant.getText().equals("")) {
            lblNombre.setIcon(check);
        } else {
            lblNombre.setIcon(noCheck);
        }
    }//GEN-LAST:event_txtNombreRestaurantFocusLost

    private void lblNombre1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblNombre1FocusLost

    }//GEN-LAST:event_lblNombre1FocusLost

    private void lblNombre2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblNombre2FocusLost

    }//GEN-LAST:event_lblNombre2FocusLost

    private void lblNombre3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblNombre3FocusLost

    }//GEN-LAST:event_lblNombre3FocusLost

    private void lblNombre4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblNombre4FocusLost

    }//GEN-LAST:event_lblNombre4FocusLost

    private void txtDireccionRestorantFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionRestorantFocusLost
        if (!txtDireccionRestorant.getText().equals("")) {
            lblNombre1.setIcon(check);
        } else {
            lblNombre1.setIcon(noCheck);
        }
    }//GEN-LAST:event_txtDireccionRestorantFocusLost

    private void txtHoraAperturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraAperturaFocusLost
        if (!txtHoraApertura.getText().equals("")) {
            lblNombre2.setIcon(check);
        } else {
            lblNombre2.setIcon(noCheck);
        }

    }//GEN-LAST:event_txtHoraAperturaFocusLost

    private void txtHoraCierreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraCierreFocusLost
        if (!txtHoraCierre.getText().equals("")) {
            lblNombre3.setIcon(check);
        } else {
            lblNombre3.setIcon(noCheck);
        }
    }//GEN-LAST:event_txtHoraCierreFocusLost

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        if (!txtID.getText().equals("")) {
            lblNombre4.setIcon(check);
        } else {
            lblNombre4.setIcon(noCheck);
        }
    }//GEN-LAST:event_txtIDFocusLost
    
    //Retorna cantidad de estrellas de un restoran//
    public int dameEstrellas() {
        int estrellitas = 0;
        if (unaEstrella.isSelected()) {
            estrellitas = 1;
        } else if (dosEstrellas.isSelected()) {
            estrellitas = 2;
        } else if (tresEstrellas.isSelected()) {
            estrellitas = 3;
        } else if (cuatroEstrellas.isSelected()) {
            estrellitas = 4;
        } else if (cincoEstrellas.isSelected()) {
            estrellitas = 5;
        }
        return estrellitas;
    }

    //Carga los restoranes para que sean selecionables.
    public void llenarCombo() {
        Iterator<Restoran> it = modelo.getListaRestoranes().iterator();
        while (it.hasNext()) {
            Restoran aux = it.next();
            String dato = aux.getNombre();
            comboRestoran.addItem(dato);
        }
    }

    //Llena la lista de clientes para luego ser mostrados en pantalla.//
    public void llenarListaClientes() {

        Iterator<Cliente> it = modelo.getListaClientes().iterator();
        int largo = modelo.getListaClientes().size();
        String[] vec = new String[largo];
        int i = 0;
        while (it.hasNext()) {
            Cliente aux = it.next();
            String dato = aux.getNombre();
            vec[i] = dato;
            i++;
        }
        lstClientes.setListData(vec);
    }

    //Llena la lista de clientes ganadores para luego ser mostrados en pantalla.//
    public void llenarListaCliGanadores(Sorteo sorteo) {
        String nota = " Se han enviado las notificaciones a...";
        String esp = "  ";
        Iterator<Cliente> it = sorteo.getListaGanadores().iterator();
        int largo = sorteo.getListaGanadores().size();
        String[] vec = new String[largo];
        String[] vecMail = new String[largo + 2];
        int i = 0;
        vecMail[i] = nota;
        vecMail[i + 1] = esp;
        while (it.hasNext()) {
            Cliente aux = it.next();
            String mail = aux.getMail();
            String dato = aux.getNombre();
            vec[i] = dato;
            vecMail[i + 2] = mail;
            i++;
        }
        lstGanadores.setListData(vec);
        lstMailNotificacion.setListData(vecMail);
    }

    //Luego de elegir la cantidad de estrellas luego de hacer el clic se toda lo seleccionado.//
    private void btnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarActionPerformed
        if (validarFormularioEvaluacion()) {
            int estrellas = dameEstrellas();
            String nombre = comboRestoran.getSelectedItem().toString();
            Restoran res = modelo.dameRestoran(nombre);
            if (txtNombreCliente.getText().equals("") || cajaResena.getText().equals("")) {
                Evaluacion evalAnonimo = new Evaluacion(estrellas, cajaResena.getText(), res);
                modelo.agregarEvaluacionAnonima(evalAnonimo);
                JOptionPane.showMessageDialog(null, "Evaluación realizada exitosamente !!", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
                txtNombreCliente.setText("");
                txtMail.setText("");
                txtEdad.setText("");
                cajaResena.setText("");
                checkAnonimo.setSelected(false);
                txtNombreCliente.setEnabled(true);
                txtMail.setEnabled(true);
                txtEdad.setEnabled(true);
                comboRestoran.setSelectedIndex(0);
            }else{
                Cliente cli = new Cliente(txtNombreCliente.getText(), Integer.parseInt(txtEdad.getText()), txtMail.getText());
                Evaluacion evaluacion = new Evaluacion(estrellas, cajaResena.getText(), cli, res);
                modelo.agregarCliente(cli);
                modelo.agregarEvaluacion(evaluacion);
                JOptionPane.showMessageDialog(null, "Evaluación realizada exitosamente !!", " Mensaje Informativo ", JOptionPane.INFORMATION_MESSAGE);
                txtNombreCliente.setText("");
                txtMail.setText("");
                txtEdad.setText("");
                cajaResena.setText("");
                checkAnonimo.setSelected(false);
                lblNombreCli.setIcon(defau);
                lblMail1.setIcon(defau);
                lblEdad.setIcon(defau);
                txtNombreCliente.setEnabled(true);
                txtMail.setEnabled(true);
                txtEdad.setEnabled(true);
                comboRestoran.setSelectedIndex(0);
                llenarListaClientes();
    }//GEN-LAST:event_btnCalificarActionPerformed
        }
    }
    //Cuando se elege anonimo la validacion se realiza sin usuario, por este motivo es que no se muestra en pantalla.//
    private void checkAnonimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAnonimoActionPerformed
        if (checkAnonimo.isSelected()) {
            txtNombreCliente.setEnabled(false);
            txtMail.setEnabled(false);
            txtEdad.setEnabled(false);
        } else {
            txtNombreCliente.setEnabled(true);
            txtMail.setEnabled(true);
            txtEdad.setEnabled(true);
        }
    }//GEN-LAST:event_checkAnonimoActionPerformed

    private void btnSalirEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirEvaluacionActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirEvaluacionActionPerformed

    private void txtNombreClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreClienteFocusLost
        if (!txtNombreCliente.getText().equals("")) {
            lblNombreCli.setIcon(check);
        } else {
            lblNombreCli.setIcon(noCheck);
        }
    }//GEN-LAST:event_txtNombreClienteFocusLost

    private void txtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusLost

        if (!txtMail.getText().equals("")) {
            lblMail1.setIcon(check);
        } else {
            lblMail1.setIcon(noCheck);
        }

    }//GEN-LAST:event_txtMailFocusLost

    private void lblNombreCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblNombreCliFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNombreCliFocusLost

    private void lblEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblEdadFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEdadFocusLost

    private void lblMail1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblMail1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMail1FocusLost

    private void txtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusLost
        if (!txtEdad.getText().equals("")) {
            lblEdad.setIcon(check);
        } else {
            lblEdad.setIcon(noCheck);
        }
    }//GEN-LAST:event_txtEdadFocusLost

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        if (txtNombreCliente.getText().length() >= 20) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        if (txtEdad.getText().length() >= 2) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (!Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed
    
    //Se realiza el sorteo, tomando las opciones seleccionadas en pantalla.//
    private void btnSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorteoActionPerformed
        if (validarSorteo()) {
            Sorteo sorteo = new Sorteo(Integer.parseInt(txtCantidadG.getText()), txtFecha.getText(), tAreaNotificacion.getText());
            modelo.agregarSorteo(sorteo);
            modelo.ganadores(sorteo);
            llenarListaCliGanadores(sorteo);
            JOptionPane.showMessageDialog(null, "El sorteo se ha realizado exitosamente !!", " Mensaje Informativo ", JOptionPane.INFORMATION_MESSAGE);
            txtCantidadG.setText("");
            tAreaNotificacion.setText("");
            txtFecha.setText("");
            lblCantidadGan.setIcon(defau);
            lblFecha.setIcon(defau);
        }
    }//GEN-LAST:event_btnSorteoActionPerformed

    private void txtCantidadGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadGKeyTyped
        if (txtCantidadG.getText().length() >= 2) {
            evt.consume();
        }
        char tipoTecla = evt.getKeyChar();
        if (!Character.isDigit(tipoTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadGKeyTyped

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        if (txtFecha.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaKeyTyped

    private void lblCantidadGanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblCantidadGanFocusLost

    }//GEN-LAST:event_lblCantidadGanFocusLost

    private void lblFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblFechaFocusLost

    }//GEN-LAST:event_lblFechaFocusLost

    private void txtCantidadGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadGFocusLost
        if (!txtCantidadG.getText().equals("")) {
            lblCantidadGan.setIcon(check);
        } else {
            lblCantidadGan.setIcon(noCheck);
        }
    }//GEN-LAST:event_txtCantidadGFocusLost

    private void txtFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusLost
        if (!txtFecha.getText().equals("")) {
            lblFecha.setIcon(check);
        } else {
            lblFecha.setIcon(noCheck);
        }
    }//GEN-LAST:event_txtFechaFocusLost

    private void btnSalirSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirSorteoActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirSorteoActionPerformed

    private void panelEvaluacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelEvaluacionKeyPressed

    }//GEN-LAST:event_panelEvaluacionKeyPressed

    private void panelEvaluacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEvaluacionMouseClicked
        for (int i = comboRestoran.getItemCount() - 1; i > 0; i--) {
            comboRestoran.removeItemAt(i);
        }
        llenarCombo();
    }//GEN-LAST:event_panelEvaluacionMouseClicked

    //Metodo encargado de mostrar en pantalla lo restoranes cargados en el sistema.
    public void mostrarMatriz() {
        String matriz[][] = new String[modelo.getListaRestoranes().size()][6];
        for (int i = 0; i < modelo.getListaRestoranes().size(); i++) {
            matriz[i][0] = String.valueOf(modelo.getListaRestoranes().get(i).getIdRestorant());
            matriz[i][1] = modelo.getListaRestoranes().get(i).getNombre();
            matriz[i][2] = modelo.getListaRestoranes().get(i).getDireccion();
            matriz[i][3] = String.valueOf(modelo.getListaRestoranes().get(i).getApertura());
            matriz[i][4] = String.valueOf(modelo.getListaRestoranes().get(i).getCierre());
            matriz[i][5] = modelo.getListaRestoranes().get(i).getComida();
        }
        tablaRestorant.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Nombre", "Dirección", "Hora Apertura", "Hora Cierre", "Tipo Comida"
                }
        ));
    }

   //Valida que los datos minimos necesarios sean ingresados y esten correcto.
    public boolean validarSorteo() {
        boolean ok = true;

        if (txtCantidadG.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la cantidad de ganadores.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (Integer.parseInt(txtCantidadG.getText()) >= modelo.getListaClientes().size()) {
            JOptionPane.showMessageDialog(null, "La cantidad de ganadores tiene que ser menor a la cantidad de participantes.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtFecha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la fecha.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (tAreaNotificacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la notificación.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return ok;
    }

    //Valida que los datos minimos necesarios sean ingresados y esten correcto.
    public boolean validarRestorant() {
        boolean ok = true;

        if (txtNombreRestaurant.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el Nombre.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtDireccionRestorant.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la Dirección.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtHoraApertura.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la Hora de Apertura.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtHoraCierre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la Hora de Cierre.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el ID.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        for (int i = 0; i < modelo.getListaRestoranes().size(); i++) {
            if (Integer.parseInt(txtID.getText()) == modelo.getListaRestoranes().get(i).getIdRestorant()) {
                JOptionPane.showMessageDialog(null, "El ID ingresado ya existe,por favor ingrese otro ID.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        if (comboComidas.getSelectedItem().toString().equals("Seleccione una opción")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un Tipo de Comida.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return ok;
    }
    
    //Valida que los datos minimos necesarios sean ingresados y esten correcto.
    public boolean validarEditarRestorant() {
        boolean ok = true;
        if (txtEditarNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nuevo Nombre.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtEditarDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la nueva Dirección.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtEditarHoraApertura.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la nueva Hora de Apertura.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (txtEditarHoraCierre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la nueva Hora de Cierre.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (comboComidasEditar.getSelectedItem().toString().equals("Seleccione una opción")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nuevo Tipo de Comida.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return ok;
    }

    //Valida que los datos minimos necesarios sean ingresados y esten correcto.
    public boolean validarFormularioEvaluacion() {
        boolean ok = true;
        if (comboRestoran.getSelectedItem().toString().equals("Seleccione un Restaurante")) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un Restaurante.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!checkAnonimo.isSelected()) {
            if (txtNombreCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese su Nombre.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (txtMail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese su Email.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (modelo.validarEmail(txtMail.getText())) {
                ok = true;
            } else {
                JOptionPane.showMessageDialog(null, "Dirección de Email incorrecta,por favor vuelva a ingresar su Email.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (txtEdad.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese su Edad.", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return ok;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalificar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRegistrarRestorant;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirEvaluacion;
    private javax.swing.JButton btnSalirSorteo;
    private javax.swing.JButton btnSorteo;
    private javax.swing.ButtonGroup btnsEstrellas;
    private javax.swing.JTextArea cajaResena;
    private javax.swing.JCheckBox checkAnonimo;
    private javax.swing.JRadioButton cincoEstrellas;
    private javax.swing.JComboBox<String> comboComidas;
    private javax.swing.JComboBox<String> comboComidasEditar;
    private javax.swing.JComboBox<String> comboRestoran;
    private javax.swing.JRadioButton cuatroEstrellas;
    private javax.swing.JRadioButton dosEstrellas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCantidadGan;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMail1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombreCli;
    private javax.swing.JList<String> lstClientes;
    private javax.swing.JList<String> lstGanadores;
    private javax.swing.JList<String> lstMailNotificacion;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTabbedPane panelEvaluacion;
    private javax.swing.JPanel panelFichaRestorant;
    private javax.swing.JTextArea tAreaNotificacion;
    private javax.swing.JTable tablaRestorant;
    private javax.swing.JRadioButton tresEstrellas;
    private javax.swing.JTextField txtCantidadG;
    private javax.swing.JTextField txtDireccionRestorant;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEditarDireccion;
    private javax.swing.JTextField txtEditarHoraApertura;
    private javax.swing.JTextField txtEditarHoraCierre;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoraApertura;
    private javax.swing.JTextField txtHoraCierre;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreRestaurant;
    private javax.swing.JRadioButton unaEstrella;
    // End of variables declaration//GEN-END:variables
}
