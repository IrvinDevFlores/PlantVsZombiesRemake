package ViewModel.DragAndDrop;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Lab  extends JFrame {

    JLabel pic1, pic2, pic3;

    public Lab()
    {
        super("Drag an drop");

        pic1 = new JLabel();
        pic2 = new JLabel();
        pic3 = new JLabel();

        pic1.setBounds(20,30,100,100);
        pic2.setBounds(250,30,100,100);
        pic3.setBounds(20,140,100,100);

        pic1.setIcon(new ImageIcon("src/img/1.jpg"));
        pic2.setIcon(new ImageIcon("src/img/2.jpg"));
        pic3.setIcon(new ImageIcon("src/img/3.jpg"));


        MouseListener mouseListener1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                        JComponent component = (JComponent)e.getSource();
                        TransferHandler transfer = component.getTransferHandler();
                        transfer.exportAsDrag(component,e,TransferHandler.COPY);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };

        pic1.addMouseListener(mouseListener1);
        pic2.addMouseListener(mouseListener1);
        pic3.addMouseListener(mouseListener1);


        pic1.setTransferHandler(new TransferHandler("icon"));
        pic2.setTransferHandler(new TransferHandler("icon"));
        pic3.setTransferHandler(new TransferHandler("icon"));

        add(pic1);
        add(pic2);
        add(pic3);

        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static  void main(String... args)
    {
        new Lab();
    }
}
