/**
 *
 * @author Ramayanti
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class gambarJDesktop extends JDesktopPane{
    protected void paintComponent (Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();
        Image img = new ImageIcon(getClass().getResource("/icons/keuangan-tetta.png")).getImage();
        g2d.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        g2d.dispose();
    }
}
