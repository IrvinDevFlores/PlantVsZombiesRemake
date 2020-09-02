package ViewModel.DragAndDrop;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
    public Main()
    {
        InitFrameComponents();
        JPanel back = CreateContainer();
        Icon scaledIcon = GetScalableIcon();
        InitComponents(back,scaledIcon);
        Movement movement = new Movement(back.getComponents());
        add(back);
        setVisible(true);
    }

    public JPanel CreateContainer()
    {
        JPanel back = new JPanel();
        Dimension dimensionOfFrame = getSize();
        back.setSize(dimensionOfFrame);
        back.setBackground(Color.WHITE);
        back.setLayout(null);
        back.setLocation(0,0);
        return back;
    }

    public void InitFrameComponents()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,500);
        setLocationRelativeTo(this);
    }

    public Icon GetScalableIcon()
    {
        ImageIcon imagen = new ImageIcon("src/img/fondo.png");
        int imageWidth = imagen.getIconWidth();
        int imageHeight = imagen.getIconHeight();
        int typeScale = Image.SCALE_DEFAULT;
        Image scaledImage = imagen.getImage().getScaledInstance(imageWidth, imageHeight, typeScale);
        Icon scaledIcon = new ImageIcon(scaledImage);
        return scaledIcon;
    }

    public void InitComponents(JPanel back, Icon scaledIcon)
    {
        for(int i = 0; i < 3; i++)
        {
            JLabel button = new JLabel();
            button.setIcon(scaledIcon);
            button.setSize(100,100);
            button.setName("Panel ");
            back.add(button);
        }
    }

    public static void main(String... args)
    {
            new Main();
    }
}
