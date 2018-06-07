package personalizar_combo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author David
 */
public class Propiedades extends BasicComboBoxUI {

    // private ImageIcon espacio =  new ImageIcon(getClass().getResource("/icons/espacio.png"));  
    int ancho = 32; // ancho en pixeles que tendra el icono escalado
    int alto = -1;
    Color c = new Color(225,198,198);
    Border empty = BorderFactory.createEmptyBorder(0, 0, 0, 0);
    ImageIcon iconOriginal = new ImageIcon("src/main/resources/icons/lupa.png");
    private Border border;

    // alto (para que conserve la proporcion pasamos -1)
// Obtiene un icono en escala con las dimensiones especificadas
    ImageIcon iconoEscala = new ImageIcon(iconOriginal.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

    public static ComboBoxUI createUI(JComponent c) {
        return new Propiedades();
    }

    @Override
    protected JButton createArrowButton() {
        JButton btn = new JButton();
        //  .getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
        btn.setIcon(iconoEscala);
        //btn.setBorder(empty);
        btn.setContentAreaFilled(false);
        return btn;
    }

    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        g.setColor(c);
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);

    }

    @Override
    protected ListCellRenderer createRenderer() {
        border = BorderFactory.createLineBorder(Color.RED, 1);

        return new DefaultListCellRenderer() {

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.

                list.setSelectionBackground(c);
                //setBorder(empty);
                return this;
            }

        };
    }



}
