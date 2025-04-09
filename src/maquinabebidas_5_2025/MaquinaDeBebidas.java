/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinabebidas_5_2025;

/**
 * @author Daniela Matei
 * Clase MaquinaDeBebidas
 */
class MaquinaDeBebidas {
    private ContadorDeMonedas contador; //Contador de monedas de la maquina
    private DispensadorDeBotes cola, limon, naranja, tonica, agua; //Cinco dispensadores de botes
    private float precio; //Precio de las bebidas(común para todas)
    /* Inicializa la maquina y todos los elementos asociados */

    /**
     * Constructor por defecto
     */
    public MaquinaDeBebidas (){
        
    }

    /**
     * Constructor con 3 parametros
     * Entradas:
     * @param m float m, cantidad inicial de monedas para el cambio
     * @param b int b, cantidad inicial de botes en los dispensadores
     * @param pvp float pvp, precio de las bebidas
     * Salidas: Ninguna
     */
    public MaquinaDeBebidas (float m, int b, float pvp){
        
    }

    /**
     * Responder a una acción del usuario. Discrimina el tipo de accion
     * y utiliza las operaciones privadas
     * Introduce la oreden
     * Entradas:
     * @param o char o, la orden del usuario
     * Salidas: Ninguna
     */
    public void darOrden (char o){

    }

    /**
     * Visualiza la informacion de interes sobre la maquina 
     * Botes en cada dispensador, precio de las bebidas, saldo del cliente
     * Entradas: Ninguna
     * Salidas: Ninguna
     */
    public void visualizarMaquina (){

    }
   
    /**
     * Realiza las acciones relacionadas con la introducción de monedas 
     * @param o char o, la orden del usuario
     * Salidas: Ninguna 
     */
    private void ordenMonedas (char o){

    }

    /**
     * Realiza las acciones relacionadas con la selección de una bebida
     * Entradas:
     * @param o char o, la orden del usuario
     * Salidas: Ninguna
     */
    private void ordenSeleccion (char o){

    }
}

