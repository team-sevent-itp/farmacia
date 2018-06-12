
package com.core.farmacia.cambiarpanel;

import javax.swing.JPanel;

/**
 *
 * @author desconocido
 */
public class CambiaPanel {
    
     private JPanel container;
    private JPanel content;


    /**
     * Constructor de clase
     */
    public CambiaPanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }
    
    
}
