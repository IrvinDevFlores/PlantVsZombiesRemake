package ViewModel.Data;
import ViewModel.Data.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Columna extends JButton
{
    public int x;
    public int y;

    public Columna()
    {
        x = 0;
        y = 0;
        setOpaque(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBorderPainted(false);
        setFocusPainted(true);
        setBackground(Color.red);

        addActionListener((e)-> {
            System.out.println("x: "+x+"\ny: "+y);
        });
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setContentAreaFilled(true);
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                setContentAreaFilled(true);
                setBackground(Color.YELLOW);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                setContentAreaFilled(false);
            }
        });
    }

}
