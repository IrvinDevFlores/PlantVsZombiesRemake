package ViewModel.DragAndDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Movement implements MouseListener, MouseMotionListener {
    private int x, y;
    public Movement(Component... component)
    {
        for(Component panel: component)
        {
            panel.addMouseListener(this);
            panel.addMouseMotionListener(this);
        }
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        int deltaX = e.getX() + e.getComponent().getX() - x;
        int deltaY = e.getY() + e.getComponent().getY() - y;
        e.getComponent().setLocation(deltaX,deltaY);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }














    @Override
    public void mouseClicked(MouseEvent e) {

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
    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
