/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenlab5p2_gerardohasbum;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ghasb
 */
public class ServicioBoroa extends javax.swing.JFrame {

    ArrayList<Usuarios> usuarios = new ArrayList();
    ArrayList<Usuarios> lista = new ArrayList();
    Empleado emp = new Empleado("Programador", "Jefe", "1423 dias", "Dev", "Boroa", "Boroa123", "Masculino", "Cortes", "0602-2000-17526", new Date());
    Civil civ = new Civil("User", "Rin", "Rin123", "Masculino", "Francisco Morazan", "0801-2005-20386", new Date());
    Civil civ1 = new Civil("Jaime", "Rodriguez", "holi", "Femenino", "Francisco Morazan", "0801-2000-17289", new Date());
    //0801-2000-17289
    

    /**
     * Creates new form ServicioBoroa
     */
    public ServicioBoroa() {
        civ.tramites.add(new Tramites("Comer", "En efecto comer", new Date()));
        lista.add(civ);
        civ1.tramites.add(new Tramites("Llorar", "Asi es llorar", new Date()));
        lista.add(civ1);
        boolean unicos = Unicosbeibis();
        if (unicos == false) {
            JOptionPane.showMessageDialog(this, "Se repite un numero de identidad cambia el numero y vuelva a intentar :)");
            this.setVisible(false);
        }
        
        usuarios.add(civ);
        usuarios.add(emp);
        usuarios.add(civ1);

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmpleadoScreen = new javax.swing.JFrame();
        EmpleadoPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CivilTabla = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaTramitesGenerales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfNomMod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfApeMod = new javax.swing.JTextField();
        jNacCho = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfPassMod = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        SexoMod = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Departemento = new javax.swing.JComboBox<>();
        bModificar = new javax.swing.JButton();
        IdentidadLista = new javax.swing.JComboBox<>();
        CerrarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        UsuarioActivo = new javax.swing.JLabel();
        CivilScreen = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoPerson = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TramiteCivil = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        NombreTramite = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        DecripcionTramite = new javax.swing.JTextField();
        bTramite = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        CivilActual = new javax.swing.JTextField();
        CerrarSesion2 = new javax.swing.JButton();
        LoginPanel = new javax.swing.JPanel();
        LoginTitle = new javax.swing.JLabel();
        tfPass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bLogin = new javax.swing.JButton();
        tfNom = new javax.swing.JTextField();

        EmpleadoScreen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EmpleadoScreenMouseMoved(evt);
            }
        });
        EmpleadoScreen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmpleadoScreenFocusGained(evt);
            }
        });
        EmpleadoScreen.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                EmpleadoScreenComponentShown(evt);
            }
        });

        EmpleadoPanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                EmpleadoPanelStateChanged(evt);
            }
        });
        EmpleadoPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmpleadoPanelFocusGained(evt);
            }
        });
        EmpleadoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpleadoPanelMouseClicked(evt);
            }
        });

        jLabel4.setText("Informacion de Civiles: ");

        jLabel5.setText("Tramites: ");

        CivilTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Completo", "No. Identidad", "Fecha Nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CivilTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(CivilTabla);

        TablaTramitesGenerales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Tramite", "Descripcion", "Fecha", "Numero de Identidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaTramitesGenerales.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TablaTramitesGenerales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(530, 530, 530))
                    .addComponent(jScrollPane3))
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        EmpleadoPanel.addTab("Inforamacion Civiles", jPanel1);

        jLabel6.setText("Nombre: ");

        jLabel7.setText("Apellido: ");

        jLabel8.setText("Fecha de Nacimiento");

        jLabel9.setText("Contraseña");

        jLabel10.setText("Sexo: ");

        SexoMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Masculino", "Femenino" }));

        jLabel11.setText("Departamento: ");

        Departemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Francisco Morazan", "Cortes", "Comayagua" }));

        bModificar.setText("Modificar");
        bModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bModificarMouseClicked(evt);
            }
        });
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        IdentidadLista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                IdentidadListaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SexoMod, javax.swing.GroupLayout.Alignment.LEADING, 0, 119, Short.MAX_VALUE)
                            .addComponent(tfPassMod, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNomMod, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Departemento, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE))
                        .addGap(199, 199, 199)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfApeMod)
                            .addComponent(jNacCho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(IdentidadLista, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(IdentidadLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApeMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNacCho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SexoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Departemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bModificar))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        EmpleadoPanel.addTab("Modificacion Civiles", jPanel2);

        CerrarSesion.setText("Cerrar Sesion");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });

        jLabel3.setText("Bienvenido: ");

        javax.swing.GroupLayout EmpleadoScreenLayout = new javax.swing.GroupLayout(EmpleadoScreen.getContentPane());
        EmpleadoScreen.getContentPane().setLayout(EmpleadoScreenLayout);
        EmpleadoScreenLayout.setHorizontalGroup(
            EmpleadoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpleadoScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmpleadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpleadoScreenLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CerrarSesion)
                .addGap(96, 96, 96))
        );
        EmpleadoScreenLayout.setVerticalGroup(
            EmpleadoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpleadoScreenLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(EmpleadoScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CerrarSesion)
                    .addComponent(jLabel3)
                    .addComponent(UsuarioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(EmpleadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InfoPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Completo", "No. Identificacion", "Fecha Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(InfoPerson);

        TramiteCivil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Fecha", "No. de identidad"
            }
        ));
        jScrollPane4.setViewportView(TramiteCivil);

        jLabel13.setText("Informacion Personal");

        jLabel14.setText("Tramites");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informacion Personal", jPanel3);

        jLabel15.setText("Nombre");

        jLabel16.setText("Descripcion");

        DecripcionTramite.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        bTramite.setText("Ingresar Tramite");
        bTramite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bTramiteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(jLabel15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(NombreTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(DecripcionTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(bTramite)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DecripcionTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(bTramite)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestion  de Tramites", jPanel4);

        jLabel12.setText("Bienvenido: ");

        CivilActual.setEditable(false);

        CerrarSesion2.setText("Cerrar Sesion");
        CerrarSesion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesion2MouseClicked(evt);
            }
        });
        CerrarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CivilScreenLayout = new javax.swing.GroupLayout(CivilScreen.getContentPane());
        CivilScreen.getContentPane().setLayout(CivilScreenLayout);
        CivilScreenLayout.setHorizontalGroup(
            CivilScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CivilScreenLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(CivilScreenLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CivilActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CerrarSesion2)
                .addGap(160, 160, 160))
        );
        CivilScreenLayout.setVerticalGroup(
            CivilScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CivilScreenLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(CivilScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CivilActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CerrarSesion2))
                .addGap(50, 50, 50)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPanel.setBackground(new java.awt.Color(204, 204, 255));

        LoginTitle.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        LoginTitle.setForeground(new java.awt.Color(0, 0, 0));
        LoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTitle.setText("LOGIN");

        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE(Ingrese su nombre completo): ");

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña: ");

        bLogin.setBackground(new java.awt.Color(51, 51, 255));
        bLogin.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        bLogin.setText("LOGIN");
        bLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLoginMouseClicked(evt);
            }
        });
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(LoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(jLabel1))
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(265, 265, 265)
                            .addComponent(jLabel2))
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(264, 264, 264)
                            .addComponent(bLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(bLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPassActionPerformed

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLoginActionPerformed

    private void bLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLoginMouseClicked
        String empcom = emp.getNombre() + " " + emp.getApellido();
        String emppass = emp.getPassword();
        String civcom = civ.getNombre() + " " + civ.getApellido();
        String civpass = civ.getPassword();
        /*System.out.println(tfNombre.getText());
        System.out.println(civcom);
        System.out.println(Password.getText());
        System.out.println(civpass);*/
        String inpnom = tfNom.getText();
        String inppass = tfPass.getText();
        if ((inpnom.equals(empcom) && inppass.equals(emppass))) {

            this.setVisible(false);
            EmpleadoScreen.pack();
            EmpleadoScreen.setVisible(true);
            llenarTable();
            llenarTramites();
            UsuarioActivo.setText(empcom);
            llenarCombo();

        } else if ((inpnom.equals(civcom) && inppass.equals(civpass))) {
            this.setVisible(false);
            CivilScreen.pack();
            CivilScreen.setVisible(true);
            CivilActual.setText(civcom);
            llenarTablaCivil();
            llenarTramitesCivil();

        } else {

            JOptionPane.showMessageDialog(this, "Data incorrecta\nIntentar de nuevo");

        }
    }//GEN-LAST:event_bLoginMouseClicked

    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        // TODO add your handling code here:
        this.setVisible(true);
        EmpleadoScreen.setVisible(false);
        VaciarCombo();
        VaciarTabla();
    }//GEN-LAST:event_CerrarSesionMouseClicked

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_bModificarActionPerformed

    private void bModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bModificarMouseClicked
        // TODO add your handling code here:
        int pos = 0;
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getIdentidad().equals(IdentidadLista.getSelectedItem())) {
                pos = i;
            }

        }

        lista.get(pos).setNombre(tfNomMod.getText());
        lista.get(pos).setApellido(tfApeMod.getText());
        lista.get(pos).setDepartamento((String) Departemento.getSelectedItem());
        lista.get(pos).setNacimiento(jNacCho.getDate());
        lista.get(pos).setPassword(tfPassMod.getText());
        lista.get(pos).setSexo((String) SexoMod.getSelectedItem());

        VaciarTabla();
        llenarTable();

    }//GEN-LAST:event_bModificarMouseClicked

    private void EmpleadoPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmpleadoPanelFocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_EmpleadoPanelFocusGained

    private void EmpleadoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpleadoPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpleadoPanelMouseClicked

    private void EmpleadoScreenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmpleadoScreenFocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_EmpleadoScreenFocusGained

    private void EmpleadoScreenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpleadoScreenMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpleadoScreenMouseMoved

    private void EmpleadoScreenComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_EmpleadoScreenComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_EmpleadoScreenComponentShown

    private void EmpleadoPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_EmpleadoPanelStateChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_EmpleadoPanelStateChanged

    private void IdentidadListaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_IdentidadListaItemStateChanged
        // TODO add your handling code here:
        int pos = 0;

        for (int i = 0; i < lista.size(); i++) {
            String id = lista.get(i).getIdentidad();
            if (id.equals(IdentidadLista.getSelectedItem())) {
                pos = i;
                break;
            }

        }
        tfNomMod.setText(lista.get(pos).getNombre());
        tfApeMod.setText(lista.get(pos).getApellido());
        Departemento.setSelectedItem(lista.get(pos).getDepartamento());
        jNacCho.setDate(lista.get(pos).getNacimiento());
        tfPassMod.setText(lista.get(pos).getPassword());
        SexoMod.setSelectedItem(lista.get(pos).getSexo());
    }//GEN-LAST:event_IdentidadListaItemStateChanged

    private void CerrarSesion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesion2MouseClicked
        // TODO add your handling code here:
        this.setVisible(true);
        CivilScreen.setVisible(false);
        VaciarTabla();
    }//GEN-LAST:event_CerrarSesion2MouseClicked

    private void CerrarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarSesion2ActionPerformed

    private void bTramiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bTramiteMouseClicked
        // TODO add your handling code here:
        
        int pos = 0;
        for (int i = 0; i < lista.size(); i++) {
            
            if(CivilActual.getText().contains(lista.get(i).getNombre())){
                
                pos = i;
                
            }
            
        }
        
        ((Civil)lista.get(pos)).tramites.add(new Tramites(NombreTramite.getText(), DecripcionTramite.getText(), new Date()));
        
        VaciarTabla();
        llenarTramitesCivil();
        
    }//GEN-LAST:event_bTramiteMouseClicked

    public void llenarTable() {

        DefaultTableModel modelo = (DefaultTableModel) CivilTabla.getModel();

        for (int i = 0; i < lista.size(); i++) {

            Object[] modelo2 = {lista.get(i).getNombre() + " " + lista.get(i).getApellido(), lista.get(i).getIdentidad(), lista.get(i).getNacimiento()};

            modelo.addRow(modelo2);

        }

        CivilTabla.setModel(modelo);
    }

    public void llenarCombo() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) IdentidadLista.getModel();

        for (int i = 0; i < lista.size(); i++) {

            Object modelo2 = lista.get(i).getIdentidad();
            modelo.addElement(modelo2);

        }
        IdentidadLista.setModel(modelo);

    }

    public void llenarTramites() {
        ArrayList<Tramites> temp = new ArrayList();
        for (int i = 0; i < lista.size(); i++) {
            Civil tempo = (Civil) lista.get(i);
            for (int j = 0; j < tempo.tramites.size() - 1; j++) {
                temp.add(tempo.tramites.get(i));
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) TablaTramitesGenerales.getModel();

        for (int i = 0; i < lista.size(); i++) {
            Civil tempo = (Civil) lista.get(i);
            for (int j = 0; j < tempo.tramites.size() - 1; j++) {
                Object[] modelo2 = {temp.get(j).getNombre(), temp.get(j).getTramite(), temp.get(j).getEnvio(), lista.get(i)};
                modelo.addRow(modelo2);
            }
        }

        TablaTramitesGenerales.setModel(modelo);

    }

    public void VaciarCombo() {

        JComboBox modelo = new JComboBox();
        IdentidadLista = modelo;

    }

    public void VaciarTabla() {

        JTable modelo = new JTable();
        CivilTabla = modelo;
        InfoPerson = modelo;
        TramiteCivil = modelo;
        TablaTramitesGenerales = modelo;

    }

    public void llenarTablaCivil() {

        DefaultTableModel modelo = (DefaultTableModel) InfoPerson.getModel();

        for (int i = 0; i < lista.size(); i++) {

            if (CivilActual.getText().contains(lista.get(i).getNombre())) {
                Object[] modelo2 = {lista.get(i).getNombre() + " " + lista.get(i).getApellido(), lista.get(i).getIdentidad(), lista.get(i).getNacimiento()};

                modelo.addRow(modelo2);
            }

        }

        InfoPerson.setModel(modelo);
    }

    public void llenarTramitesCivil() {

        DefaultTableModel modelo = (DefaultTableModel) TramiteCivil.getModel();

        Civil tempo = new Civil();

        for (int i = 0; i < lista.size(); i++) {

            if (CivilActual.getText().contains(lista.get(i).getNombre())) {
                tempo = (Civil) lista.get(i);
            }

        }

        for (int i = 0; i < tempo.tramites.size(); i++) {

            Object[] modelo2 = {tempo.tramites.get(i).getNombre(),tempo.tramites.get(i).getTramite(), tempo.tramites.get(i).getEnvio(), tempo.getIdentidad()};

            modelo.addRow(modelo2);

        }

        TramiteCivil.setModel(modelo);

    }
    
    public boolean Unicosbeibis() {//valida que no se repita un numero de identidad
        
        boolean unico = true;
        int cont = 0;
        
        for (Usuarios x: usuarios) {
            
            if (usuarios.contains(x.getIdentidad())) {
                cont++;
            }
            
            if (!(x.getIdentidad().contains("-"))) {
                unico = false;                
            }
            
            String hola = x.getIdentidad();
            hola = (String)hola.substring(0, 4);
            
        }
        
        if (cont > 1) {
            unico = false;
        }
        
        return unico;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServicioBoroa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicioBoroa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicioBoroa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicioBoroa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicioBoroa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton CerrarSesion2;
    private javax.swing.JTextField CivilActual;
    private javax.swing.JFrame CivilScreen;
    private javax.swing.JTable CivilTabla;
    private javax.swing.JTextField DecripcionTramite;
    private javax.swing.JComboBox<String> Departemento;
    private javax.swing.JTabbedPane EmpleadoPanel;
    private javax.swing.JFrame EmpleadoScreen;
    private javax.swing.JComboBox<String> IdentidadLista;
    private javax.swing.JTable InfoPerson;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JTextField NombreTramite;
    private javax.swing.JComboBox<String> SexoMod;
    private javax.swing.JTable TablaTramitesGenerales;
    private javax.swing.JTable TramiteCivil;
    private javax.swing.JLabel UsuarioActivo;
    private javax.swing.JButton bLogin;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bTramite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jNacCho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tfApeMod;
    private javax.swing.JTextField tfNom;
    private javax.swing.JTextField tfNomMod;
    private javax.swing.JTextField tfPass;
    private javax.swing.JTextField tfPassMod;
    // End of variables declaration//GEN-END:variables
}
