package ViewModel.Data;

public class Nodo
{
    public Object Info;
    public Nodo Siguiente;
    public Nodo(Object obj)
    {
        Info = obj;
        Siguiente = null;
    }

    public void EnlazarSiguiente(Nodo n)
    {
        Siguiente = n;
    }

    public Object DatoEnNodo()
    {
        return Info;
    }

    public Nodo Siguiente()
    {
        return Siguiente;
    }

    public String ToString()
    {
        return Info.toString();
    }
}
