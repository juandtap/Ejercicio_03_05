/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ups.ejercicio_03_05.View;

import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import ups.ejercicio_03_05.Controller.EmpleadoController;
import ups.ejercicio_03_05.Model.Departamento;

/**
 *
 * @author Diego
 */
public class EmpleadoVentana extends javax.swing.JFrame {

    
    private final EmpleadoController empleadoController;
    private TableModel modeloTablaEmpleados;
    
    public EmpleadoVentana() {
        initComponents();
        this.empleadoController = new EmpleadoController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonAgregarEmpleado = new javax.swing.JButton();
        jButtonMostrarEmpleados = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jComboBoxNacionalidad = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxDepartamentosEmpleado = new javax.swing.JComboBox<>();
        jTextFieldCargo = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jComboBoxAnioNac = new javax.swing.JComboBox<>();
        jComboBoxMesNac = new javax.swing.JComboBox<>();
        jComboBoxDiaNac = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jButtonEdicion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "EMPLEADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.black)); // NOI18N

        jLabel19.setText("Nombre");

        jTextFieldCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCedulaKeyReleased(evt);
            }
        });

        jButtonAgregarEmpleado.setText("Agregar");
        jButtonAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarEmpleadoActionPerformed(evt);
            }
        });

        jButtonMostrarEmpleados.setText("Mostrar");
        jButtonMostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarEmpleadosActionPerformed(evt);
            }
        });

        jLabel7.setText("Cedula");

        jLabel11.setText("Fecha Nacimiento");

        jLabel12.setText("Nacionalidad");

        jLabel13.setText("direccion");

        jComboBoxNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alemania", "Argentina", "Belgica", "Brasil", "Bolivia", "Canada", "Chile", "Colombia", "Corea", "Cuba", "Dinamarca", "Ecuador", "Egipto", "España", "Estados Unidos", "Francia", "Honduras", "Inglaterra", "Italia", "Japon", "Mexico", "Paraguay", "Peru", "Uruguay" }));

        jLabel20.setText("Cargo");

        jLabel21.setText("Salario");

        jLabel22.setText("Departamento");

        jComboBoxDepartamentosEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Asignar" }));
        jComboBoxDepartamentosEmpleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxDepartamentosEmpleadoFocusGained(evt);
            }
        });

        jTextFieldSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSalarioKeyReleased(evt);
            }
        });

        jComboBoxAnioNac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        jComboBoxMesNac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBoxDiaNac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel23.setText("año");

        jLabel24.setText("mes");

        jLabel25.setText("dia");

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Pais", "Direccion", "Fecha Nac", "Departamento", "Cargo", "Salario"
            }
        ));
        jScrollPane1.setViewportView(jTableEmpleados);

        jButtonEdicion.setText("Editar/Eliminar");
        jButtonEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEdicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addGap(4, 4, 4)
                                                .addComponent(jComboBoxAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                                    .addComponent(jTextFieldDireccion)
                                                    .addComponent(jTextFieldCargo)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jComboBoxDepartamentosEmpleado, 0, 163, Short.MAX_VALUE)
                                        .addGap(254, 254, 254))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jButtonAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMostrarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jComboBoxNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jComboBoxDepartamentosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxAnioNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMesNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDiaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGap(38, 38, 38)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrarEmpleados)
                    .addComponent(jButtonAgregarEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEdicion))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCedulaKeyReleased
        if (!empleadoController.validarSoloNumeros(evt.getKeyChar())) {
            if(jTextFieldCedula.getText().length() > 0){
                String temp =jTextFieldCedula.getText().substring(0,jTextFieldCedula.getText().length()-1);
                jTextFieldCedula.setText(temp);
            }
        }
    }//GEN-LAST:event_jTextFieldCedulaKeyReleased

    private void jButtonAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarEmpleadoActionPerformed
        agregar();
        clearEmpleado();
        mostrarTablaEmpleados();
    }//GEN-LAST:event_jButtonAgregarEmpleadoActionPerformed

    private void jButtonMostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarEmpleadosActionPerformed
        System.out.println("EMPLEADOS:\n");
        for (var emp : empleadoController.listarEmpleados()) {
            // se aniade el anio actual para calcular la edad del empleado

            System.out.println(emp.mostrarInformacion(LocalDate.now().getYear()));
            System.out.println("");
        }
        System.out.println("----------------------------------------------------------------------");

        mostrarTablaEmpleados();
    }//GEN-LAST:event_jButtonMostrarEmpleadosActionPerformed

    private void jTextFieldSalarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSalarioKeyReleased
        if (!empleadoController.validarSoloNumeros(evt.getKeyChar())) {
            if(jTextFieldSalario.getText().length() > 0){
                String temp =jTextFieldSalario.getText().substring(0,jTextFieldSalario.getText().length()-1);
                jTextFieldSalario.setText(temp);
            }
        }
    }//GEN-LAST:event_jTextFieldSalarioKeyReleased

    private void jButtonEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEdicionActionPerformed
       editar(empleadoController.listarEmpleados().get(jTableEmpleados.getSelectedRow()).getCedula());
    }//GEN-LAST:event_jButtonEdicionActionPerformed

    private void jComboBoxDepartamentosEmpleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentosEmpleadoFocusGained
        cargarDepartamentosCombo();
    }//GEN-LAST:event_jComboBoxDepartamentosEmpleadoFocusGained

    private void cargarDepartamentosCombo(){
        jComboBoxDepartamentosEmpleado.removeAllItems();
        jComboBoxDepartamentosEmpleado.addItem("Sin Asignar");
        for (var dep : empleadoController.departamentoService.listarDepartamentos()) {
            jComboBoxDepartamentosEmpleado.addItem(dep.getNombre());
        }
    }
    private void agregar(){
        empleadoController.crearEmpleado(jTextFieldCedula.getText(), jTextFieldNombre.getText(),
                Integer.parseInt(jComboBoxAnioNac.getSelectedItem().toString()), 
                (jComboBoxMesNac.getSelectedIndex()+1), (jComboBoxDiaNac.getSelectedIndex()+1),
                jComboBoxNacionalidad.getSelectedItem().toString(), jTextFieldDireccion.getText(),
                jTextFieldCargo.getText(), Float.parseFloat(jTextFieldSalario.getText()),getDepartamentoFromComboBox() );
        System.out.println("Empleado agregado !");
        
    }
    
    private Departamento getDepartamentoFromComboBox(){
        if(!jComboBoxDepartamentosEmpleado.getSelectedItem().toString().equalsIgnoreCase("Sin Asignar")){
            // Primer item del combo es "Sin Asignar" 
            Departamento dep = empleadoController.departamentoService.listarDepartamentos().get(jComboBoxDepartamentosEmpleado.getSelectedIndex() -1);
            return dep;
        }
        return null;
    }
    
    
     private void clearEmpleado(){
        jTextFieldCedula.setText("");
        jTextFieldNombre.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldCargo.setText("");
        jTextFieldSalario.setText("");
     
    }
     
     private void mostrarTablaEmpleados(){
        
        var header = new String[8];
        
        header[0] = "Cedula";
        header[1] = "Nombre";
        header[2] = "Pais";
        header[3] = "Departamento";
        header[4] = "FechaNacimiento";
        header[5] = "Cargo";
        header[6] = "Salario";
        header[7] = "Direccion";
        
        var data = new Object[this.empleadoController.listarEmpleados().size()][8];
        
        for (int i = 0; i < this.empleadoController.listarEmpleados().size(); i++) {
            
            data[i][0] = this.empleadoController.listarEmpleados().get(i).getCedula();
            data[i][1] = this.empleadoController.listarEmpleados().get(i).getNombre();
            data[i][2] = this.empleadoController.listarEmpleados().get(i).getNacionalidad();
            
            if ( this.empleadoController.listarEmpleados().get(i).getDepartamento() == null) {
                data[i][3] = "Sin Asignar";
            } else{
                data[i][3] = this.empleadoController.listarEmpleados().get(i).getDepartamento().getNombre();
            }
            
            data[i][4] = this.empleadoController.listarEmpleados().get(i).getFechaNacimiento();
            data[i][5] = this.empleadoController.listarEmpleados().get(i).getCargo();
            data[i][6] = this.empleadoController.listarEmpleados().get(i).getSalario();
            data[i][7] = this.empleadoController.listarEmpleados().get(i).getDireccion();
            
            
        }
        
        this.modeloTablaEmpleados = new DefaultTableModel(data, header);
        
        this.jTableEmpleados.setModel(modeloTablaEmpleados);
        
    }
     
     private void editar(String cedula){
         EmpleadoVentanaEdicion empleadoVentanaEdicion = new EmpleadoVentanaEdicion(empleadoController.getEmpleadoByCedula(cedula));
         empleadoVentanaEdicion.setLocationRelativeTo(this);
         empleadoVentanaEdicion.setVisible(true);
     }
     
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarEmpleado;
    private javax.swing.JButton jButtonEdicion;
    private javax.swing.JButton jButtonMostrarEmpleados;
    private javax.swing.JComboBox<String> jComboBoxAnioNac;
    private javax.swing.JComboBox<String> jComboBoxDepartamentosEmpleado;
    private javax.swing.JComboBox<String> jComboBoxDiaNac;
    private javax.swing.JComboBox<String> jComboBoxMesNac;
    private javax.swing.JComboBox<String> jComboBoxNacionalidad;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}
