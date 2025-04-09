class DispensadorDeBotes{

    private int botes; //Numero actual de botes.

    /* Inicializa el dispensador y pone i botes en él*/
    /* Entrada: int i, numero de botes en el dispensador*/
    /* Salidas: Ninguna */
    public DispensadorDeBotes (int i){
        this.botes = i;
    }


    /* Intenta dar un bote, devuelve true si es posible y falso
    si no hay botes */
    /* Entrada: Ninguna */
    /* Salidas: bool, true si entrega el bote */
    public boolean pulsarBoton (){
        boolean condicion;
        if (botes == 0){
            condicion = false;
        } else{ 
            condicion = true;
        }
        return condicion;
    }

    /*Muestra el numero de botes disponibles en el dispensador*/
    /* Entrada: Ninguna */
    /* Salidas: int, el numero de botes */
    public int botesDisponibles (){
        return botes;
    }

}