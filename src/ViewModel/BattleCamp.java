package ViewModel;
import ViewModel.Data.Columna;
import ViewModel.Data.Fila;
import ViewModel.Data.Lista;
import ViewModel.Data.Nodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BattleCamp extends JPanel implements MouseListener, ActionListener
{

    boolean yes = true;
    Lista Filas;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width, hegith;
    public BattleCamp()
    {
        setVisible(yes);
        setFocusable(yes);
        setLayout(null);

        width = screenSize.width;
        hegith = screenSize.height;
        setSize(width,hegith);

        Filas = new Lista();
        int posicionInicial = 110, separadorY = 110;
        for(int i = 0; i < 5; i++)
        {
            Fila fila = new Fila();
            fila.y = posicionInicial;
            Filas.InsertarFinal(new Nodo(fila));
            for(int x = 0; x < fila.colunmas.Length(); x++)
            {
                Columna columna = (Columna) fila.colunmas.ObtenerNodoPorIndice(x).Info;
                columna.y = fila.y;
                columna.setBounds(columna.x,columna.y,110,110);
                add(columna);
            }
            posicionInicial += separadorY;
        }

        ImageIcon icon = new ImageIcon("src/img/fondo.png");
        Icon imagen = new ImageIcon(
                icon.getImage().getScaledInstance(
                        icon.getIconWidth(),icon.getIconHeight(),Image.SCALE_DEFAULT)
        );
        JLabel button = new JLabel();
        button.setBounds(0,-20,width,hegith);
        button.setIcon(imagen);

        addMouseListener(this);
        add(button);
    }

    Graphics cuadro = null;
    public void paint(Graphics g)
    {
        super.paint(g);
        if(cuadro != null)
        {
            cuadro.setColor(Color.WHITE);
            cuadro.fill3DRect(xPoint,yPoint,20,20,true);
        }
        repaint();
    }


    int xPoint = 0;
    int yPoint = 0;
    @Override
    public void mouseClicked(MouseEvent e)
    {
        xPoint = e.getX();
        yPoint = e.getY();
        cuadro = getGraphics();
        System.out.println(xPoint+"\n"+yPoint);
    }
    @Override
    public void mousePressed(MouseEvent e)
    {

    }
    @Override
    public void mouseReleased(MouseEvent e)
    {

    }
    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(e.getSource());
    }
}
