package formulario;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import metodos.CPunto4;
import metodos.PPunto1;
import metodos.SPunto2;
import metodos.TPunto3;
import modelo.Producto;

/**
 *
 * @author maria
 */
public class Bodega extends javax.swing.JFrame {

    //Variables Globales
    Producto producto = new Producto();
    String mensaje = "";
    int respuesta;
    Producto buscar;
    DefaultListModel listData = new DefaultListModel();

    PPunto1 primero = new PPunto1();
    SPunto2 segundo = new SPunto2(11);
    TPunto3 tercer = new TPunto3();
    CPunto4 cuarto = new CPunto4();

    //Campos
    String codigo = "";
    String nombre = "";
    int stock = 0;
    double precio = 0;
    String descripcion = "";
    String provedor = "";
    String mostrar;

    public Bodega() {
        initComponents();
        this.agruparBotones();
        this.agruparSubBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProovedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCrearArbol = new javax.swing.JButton();
        txtRefresh = new javax.swing.JButton();
        txtAdd = new javax.swing.JButton();
        btnMostrarArbol = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        rbUno = new javax.swing.JRadioButton();
        rbDos = new javax.swing.JRadioButton();
        rbTres = new javax.swing.JRadioButton();
        rbCuatro = new javax.swing.JRadioButton();
        rbtInOrden = new javax.swing.JRadioButton();
        rbtPreOrden = new javax.swing.JRadioButton();
        rbtPostOrden = new javax.swing.JRadioButton();
        lblEtiquetaStock = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMostrar.setColumns(20);
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Codigo : ");

        jLabel3.setText("Nombre : ");

        jLabel4.setText("Stock : ");

        jLabel5.setText("Precio : ");

        jLabel6.setText("Proovedor : ");

        jLabel7.setText("Descripcion:");

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescripcion))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProovedor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(txtProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCrearArbol.setText("Crear");
        btnCrearArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArbolActionPerformed(evt);
            }
        });

        txtRefresh.setText("Refresh");
        txtRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefreshActionPerformed(evt);
            }
        });

        txtAdd.setText("Mas");
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });

        btnMostrarArbol.setText("Mostrar Arbol");
        btnMostrarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarArbolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnCrearArbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrar)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarArbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAdd)
                .addGap(18, 18, 18)
                .addComponent(txtRefresh)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar)
                    .addComponent(btnAgregar)
                    .addComponent(btnMostrar)
                    .addComponent(btnCrearArbol)
                    .addComponent(txtRefresh)
                    .addComponent(txtAdd)
                    .addComponent(btnMostrarArbol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(rbUno);
        rbUno.setText("One");
        rbUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUnoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDos);
        rbDos.setText("Two");
        rbDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTres);
        rbTres.setText("Three");
        rbTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTresActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbCuatro);
        rbCuatro.setText("Four");
        rbCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCuatroActionPerformed(evt);
            }
        });

        rbtInOrden.setText("InOrden");

        rbtPreOrden.setText("PreOrden");

        rbtPostOrden.setText("PostOrden");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(rbTres)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbUno)
                                    .addComponent(rbDos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtInOrden)
                                    .addComponent(rbtPreOrden)
                                    .addComponent(rbtPostOrden))))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rbCuatro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(rbUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbDos)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(rbtPreOrden)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(rbTres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbCuatro)
                            .addComponent(rbtPostOrden)))
                    .addComponent(rbtInOrden))
                .addGap(126, 126, 126))
        );

        lblEtiquetaStock.setText("TOTAL STOCK");

        lblStock.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(550, 550, 550))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEtiquetaStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEtiquetaStock)
                    .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        //Primer Punto 
        if (rbUno.isSelected()) {
            CargarOpcionUno();
        }
        //Segundo Punto 
        if (rbDos.isSelected()) {
            txtMostrar.setText(segundo.mostrarProducto());
        }
        //Tercer Punto 
        if (rbTres.isSelected()) {
            txtMostrar.setText(tercer.mostrarProductos());
        }
        //Cuarto Punto 
        if (rbCuatro.isSelected()) {
            if (rbtPreOrden.isSelected()) {
                txtMostrar.setText(cuarto.muestraValores(1));
            }
            if (rbtInOrden.isSelected()) {
                txtMostrar.setText(cuarto.muestraValores(2));
            }
            if (rbtPostOrden.isSelected()) {
                txtMostrar.setText(cuarto.muestraValores(3));
            }

        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void rbUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUnoActionPerformed
        // Recursividad.- Implementar un programa recursivo, que permita mostrar dos atributos relevantes de la lista de datos de su proyecto, además sumar los valores de un atributo numérico de su lista de datos
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCrearArbol.setEnabled(false);
        btnMostrarArbol.setEnabled(false);
        rbtInOrden.setEnabled(false);
        rbtPostOrden.setEnabled(false);
        rbtPreOrden.setEnabled(false);
        LimpiarFormulario();
        lblEtiquetaStock.setVisible(true);
        lblStock.setVisible(true);

    }//GEN-LAST:event_rbUnoActionPerformed

    private void rbDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDosActionPerformed
        // Hash.- Implementar una función hash que almacene los objetos de su lista de datos. También debe mostrar todos los datos del arreglo
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCrearArbol.setEnabled(true);
        btnMostrarArbol.setEnabled(false);
        rbtInOrden.setEnabled(false);
        rbtPostOrden.setEnabled(false);
        rbtPreOrden.setEnabled(false);
        LimpiarFormulario();
    }//GEN-LAST:event_rbDosActionPerformed

    private void rbTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTresActionPerformed
        // Hashtable.- Implementar un hashtable, con inserción de objetos de la lista, recuperar objetos , listar los objetos del hashtable
        btnBuscar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnCrearArbol.setEnabled(true);
        btnMostrarArbol.setEnabled(false);
        rbtInOrden.setEnabled(false);
        rbtPostOrden.setEnabled(false);
        rbtPreOrden.setEnabled(false);
        LimpiarFormulario();
    }//GEN-LAST:event_rbTresActionPerformed

    private void rbCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCuatroActionPerformed
        // Arbol ABB.- Implementar un programa que permita crear un árbol ABB, realice Búsqueda de un valor en el árbol. Mostrar los datos usando los 3 tipos de recorrido.
        btnBuscar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnCrearArbol.setEnabled(true);
        btnMostrarArbol.setEnabled(true);
        rbtInOrden.setEnabled(true);
        rbtPostOrden.setEnabled(true);
        rbtPreOrden.setEnabled(true);
        LimpiarFormulario();
    }//GEN-LAST:event_rbCuatroActionPerformed

    private void CargarOpcionUno() {
        txtMostrar.setText("");
        listData.clear();
        listData = primero.mostrarRecursivo(0);

        String cadena = "";
        int cont = 0;

        for (int i = 0; i < listData.size(); i++) {
            cadena = cadena + listData.get(i) + "\n";
            cont++;
        }

        txtMostrar.append(cadena);

        int stock = primero.sumarValores(cont);
        lblStock.setText(String.valueOf(stock));
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        //Primer Punto 
        if (rbUno.isSelected()) {
            this.formulario();
            Producto p = new Producto(codigo, nombre, stock, precio, descripcion, provedor);
            int resp = primero.AgregarProducto(p);
            if (resp == 200) {
                mensaje = "Registro Exitoso";
                CargarOpcionUno();
            } else {
                mensaje = "Error de registro";
            }
            this.mostrarMensaje(mensaje);
        }
        //Segundo Punto 
        if (rbDos.isSelected()) {
            this.formulario();
            Producto p = new Producto(codigo, nombre, stock, precio, descripcion, provedor);
            if (segundo.agregarProducto(p) == 200) {
                mensaje = "Registro Exitoso";
                this.mostrarMensaje(mensaje);
                System.out.println(segundo.mostrarProducto());
            } else if (segundo.agregarProducto(p) == 500) {
                mensaje = "Error, no hay espacio.";
                this.mostrarMensaje(mensaje);
            }
        }
        //Tercer Punto 
        if (rbTres.isSelected()) {
            this.formulario();
            Producto p = new Producto(codigo, nombre, stock, precio, descripcion, provedor);
            if (tercer.agregarProducto(p) == 200) {
                mensaje = "Registro Exitoso";
                this.mostrarMensaje(mensaje);
            }
        }
        //Cuarto Punto 
        if (rbCuatro.isSelected()) {
            this.formulario();
            Producto p = new Producto(codigo, nombre, stock, precio, descripcion, provedor);
            if (cuarto.insertar(p) == 200) {
                mensaje = "Registro Exitoso";
                this.mostrarMensaje(mensaje);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Primer Punto 
        if (rbUno.isSelected()) {

        }
        //Segundo Punto 
        if (rbDos.isSelected()) {

        }
        //Tercer Punto 
        if (rbTres.isSelected()) {

        }
        //Cuarto Punto 
        if (rbCuatro.isSelected()) {
            this.formulario();
            nombre = txtNombre.getText();

            if (cuarto.eliminaNodo(nombre) == true) {
                mensaje = "Producto Eliminado Correctamente";
                this.mostrarMensaje(mensaje);
                txtMostrar.setText(cuarto.muestraValores(1));
            } else {
                mensaje = "Producto No Eliminado";
                this.mostrarMensaje(mensaje);
                txtMostrar.setText(cuarto.muestraValores(1));
            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Primer Punto 
        if (rbUno.isSelected()) {

        }
        //Segundo Punto 
        if (rbDos.isSelected()) {

        }
        //Tercer Punto 
        if (rbTres.isSelected()) {
            buscar = null;
            this.formulario();
            codigo = txtCodigo.getText();
            buscar = tercer.buscarProducto(codigo);
            if (buscar != null) {
                mensaje = "Producto Encontrado";
                this.mostrarMensaje(mensaje);
                txtMostrar.setText(buscar.toString());
            } else {
                mensaje = "Producto No Encontrado";
                this.mostrarMensaje(mensaje);
                txtMostrar.setText("");
            }

        }
        //Cuarto Punto 
        if (rbCuatro.isSelected()) {
            buscar = null;
            this.formulario();
            nombre = txtNombre.getText();
            if (rbtPreOrden.isSelected()) {
                buscar = cuarto.buscaValores(nombre, 1);
            }
            if (rbtInOrden.isSelected()) {
                buscar = cuarto.buscaValores(nombre, 2);
            }
            if (rbtPostOrden.isSelected()) {
                buscar = cuarto.buscaValores(nombre, 3);
            }

            if (buscar != null) {
                mensaje = "Producto Encontrado";
                this.mostrarMensaje(mensaje);
                txtMostrar.setText(buscar.toString());
            } else {
                mensaje = "Producto No Encontrado";
                this.mostrarMensaje(mensaje);
                txtMostrar.setText("");
            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        rbUno.setSelected(true);
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCrearArbol.setEnabled(false);
        btnMostrarArbol.setEnabled(false);
        rbtInOrden.setEnabled(false);
        rbtPostOrden.setEnabled(false);
        rbtPreOrden.setEnabled(false);
        LimpiarFormulario();
        lblEtiquetaStock.setVisible(true);
        lblStock.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        txtCodigo.setText("AB005");
        txtNombre.setText("Chifles");
        txtStock.setText("20");
        txtPrecio.setText("3.50");
        txtDescripcion.setText("Ricos Chifles Norteños");
        txtProovedor.setText("Zair-Costero");
    }//GEN-LAST:event_txtAddActionPerformed

    private void txtRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefreshActionPerformed
        txtCodigo.setText("");
        txtNombre.setText("");
        txtStock.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");
        txtProovedor.setText("");
        txtMostrar.setText("");
    }//GEN-LAST:event_txtRefreshActionPerformed

    private void btnCrearArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArbolActionPerformed
        Producto p;
        p = new Producto("AB001", "Arroz", 10, 1.5, "Arroz integral de grano largo", "San Fernando");
        if (rbTres.isSelected()) {
            tercer.agregarProducto(p);
        } else if (rbCuatro.isSelected()) {
            cuarto.insertar(p);
        } else if (rbDos.isSelected()) {
            segundo.agregarProducto(p);
        }
        p = new Producto("AB002", "Lentejas", 20, 2.5, "Lentejas secas", "Bartolome");
        if (rbTres.isSelected()) {
            tercer.agregarProducto(p);
        } else if (rbCuatro.isSelected()) {
            cuarto.insertar(p);
        } else if (rbDos.isSelected()) {
            segundo.agregarProducto(p);
        }
        p = new Producto("AB003", "Fideos", 30, 3.5, "Fideos Costeñita", "MarcoPolo");
        if (rbTres.isSelected()) {
            tercer.agregarProducto(p);
        } else if (rbCuatro.isSelected()) {
            cuarto.insertar(p);
        } else if (rbDos.isSelected()) {
            segundo.agregarProducto(p);
        }
        p = new Producto("AB004", "Azúcar", 15, 2.0, "Azúcar blanca refinada", "La Chancaca");
        if (rbTres.isSelected()) {
            tercer.agregarProducto(p);
            mensaje = "Data de Hashtable creado con Exito";
            this.mostrarMensaje(mensaje);
        } else if (rbCuatro.isSelected()) {
            cuarto.insertar(p);
            mensaje = "Data de Arbol creado con Exito";
            this.mostrarMensaje(mensaje);
        } else if (rbDos.isSelected()) {
            segundo.agregarProducto(p);
            mensaje = "Data de Hash con Exito";
            this.mostrarMensaje(mensaje);
        }

    }//GEN-LAST:event_btnCrearArbolActionPerformed

    private void btnMostrarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarArbolActionPerformed
        txtMostrar.setText(cuarto.muestraValores(4));
    }//GEN-LAST:event_btnMostrarArbolActionPerformed

    //Metodos Reutilizables
    public void agruparBotones() {
        // Que solo se pueda seleccionar uno
        buttonGroup1.add(rbUno);
        buttonGroup1.add(rbDos);
        buttonGroup1.add(rbTres);
        buttonGroup1.add(rbCuatro);
    }

    public void agruparSubBotones() {
        // Que solo se pueda seleccionar uno
        buttonGroup2.add(rbtInOrden);
        buttonGroup2.add(rbtPostOrden);
        buttonGroup2.add(rbtPreOrden);
    }

    public void validarBotones() {

    }

    public void formulario() {
        codigo = txtCodigo.getText();
        nombre = txtNombre.getText();
        stock = Integer.parseInt(txtStock.getText());
        precio = Double.parseDouble(txtPrecio.getText());
        descripcion = txtDescripcion.getText();
        provedor = txtProovedor.getText();
    }

    public void LimpiarFormulario() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtStock.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");
        txtProovedor.setText("");
        txtMostrar.setText("");
        lblEtiquetaStock.setVisible(false);
        lblStock.setVisible(false);
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
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
            java.util.logging.Logger.getLogger(Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearArbol;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarArbol;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEtiquetaStock;
    private javax.swing.JLabel lblStock;
    private javax.swing.JRadioButton rbCuatro;
    private javax.swing.JRadioButton rbDos;
    private javax.swing.JRadioButton rbTres;
    private javax.swing.JRadioButton rbUno;
    private javax.swing.JRadioButton rbtInOrden;
    private javax.swing.JRadioButton rbtPostOrden;
    private javax.swing.JRadioButton rbtPreOrden;
    private javax.swing.JButton txtAdd;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextArea txtMostrar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProovedor;
    private javax.swing.JButton txtRefresh;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
