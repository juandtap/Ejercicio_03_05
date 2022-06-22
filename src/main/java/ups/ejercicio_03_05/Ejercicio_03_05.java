/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.ejercicio_03_05;

import ups.ejercicio_03_05.View.DepartamentoVentana;
import ups.ejercicio_03_05.View.EmpleadoVentana;
import ups.ejercicio_03_05.View.EmpresaVentana;

/**
 *
 * @author Diego
 */
public class Ejercicio_03_05 {

    public static void main(String[] args) {
        
        EmpresaVentana empresaVentana = new EmpresaVentana();
        empresaVentana.setVisible(true);
        DepartamentoVentana departamentoVentana = new DepartamentoVentana();
        departamentoVentana.setVisible(true);
        EmpleadoVentana empleadoVentana = new EmpleadoVentana();
        empleadoVentana.setVisible(true);
    }
}
