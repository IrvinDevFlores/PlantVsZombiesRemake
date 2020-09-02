package ViewModel;

import javax.swing.*;
import java.awt.*;

public class MainScene extends JFrame
{
    public MainScene()
    {
        BattleCamp battleCamp =  new BattleCamp();
        setVisible(true);
        setFocusable(true);
        setSize(battleCamp.width,battleCamp.hegith);

        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(battleCamp);
    }

    public static void main(String args[])
    {
        new MainScene();
    }
}
