/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shirley;

import javax.swing.JFrame;
public class registroVenta {
    private JFrame frame;
    private component componentes;
    public registroVenta() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("venta de automoviles al contado ");
        componentes = new component(frame);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        registroVenta pantalla = new registroVenta();
    }
}
