import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

public class Test {

    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        private JTextArea ta;

        public TestPane() {
            setLayout(new BorderLayout());
            String[] lines = {
                "Idx     Met        MTU        State                Name           ",
                "---  ---------  ----------  ------------  --------------------------",
                "  1         50  4294967295  connected     Loopback Psudo-Interface 1",
                " 11         10        1500  connected     Local Area Connection     ",
                " 11          5        1500  disconnected  Local Area Connection 3   ",};
            StringJoiner joiner = new StringJoiner("\n");
            for (String line : lines) {
                joiner.add(line);
            }
            ta = new JTextArea(joiner.toString());
            ta.setBorder(new LineBorder(Color.RED));
            ta.setFont(new Font("Monospaced", Font.PLAIN, 13));
            ta.setWrapStyleWord(true);
            add(new JScrollPane(ta));

            JButton btn = new JButton("Print");
            add(btn, BorderLayout.SOUTH);

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        ta.print();
                    } catch (PrinterException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }

    }
}