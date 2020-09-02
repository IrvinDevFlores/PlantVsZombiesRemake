package ViewModel.Data;

public class Fila
{
    public Lista colunmas;

    public int x;
    public int y;
    public final int ANCHO = 180;
    public Fila()
    {
        colunmas = new Lista();
        int distanciaCuadradro = ANCHO;
        x = 0;
        y = 0;
        for(int i = 0; i < 9; i++)
        {
            Columna columna = new Columna();
            columna.x = distanciaCuadradro;
            colunmas.InsertarFinal(new Nodo(columna));
            distanciaCuadradro += 110;
        }

    }
}
