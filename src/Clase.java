/*
* public class Clase
{
    public void eliminarPos(int pos)
    {
        if(pos == 1)p= p.sig;
        else{
            int cont = 1;
            Nodo temp = p;
            Nodo atras = n;
            while(temp.sig != null){
                if(pos==cont)
                {
                    atras.sig = temp.sig;
                    return;
                }

                atras = temp;
                cont++;
                temp = temp.sig;
            }
            atras.sig = null;

        }
    }
}
* */
