
package models;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class ModelFondo_Block_de_Notas extends javax.swing.JPanel {

    public ModelFondo_Block_de_Notas() {
        this.setSize(500,500); //se selecciona el tamaño del panel
    }

//Se crea un método cuyo parámetro debe ser un objeto Graphics
    @Override
    public void paint(Graphics g) {
        Dimension tam = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
        ImageIcon Img = new ImageIcon(getClass().getResource("/images/Zhikito 20151012_223314.jpg"));

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
        g.drawImage(Img.getImage(),0,0,tam.width,tam.height,null); 

        setOpaque(false);
        super.paintComponent(g);
    }
}
