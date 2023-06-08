/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import java.util.LinkedList;
import sop_corba.ObtenerEstadisticasIntPackage.estadisticasDTO;

/**
 *
 * @author INGESIS
 */
public class calcularEstadisticas {
    private estadisticasDTO estadisticas;
    
    public calcularEstadisticas(){
        
    }
    
    public estadisticasDTO realizarCalculos(LinkedList<Float> ofertas){
        this.estadisticas.cantidadSolicitudes = ofertas.size();
        this.estadisticas.promedioValorSolicitudes = calcularPromedio(ofertas);
        this.estadisticas.diferenciaMenorSolicitudMayorSolicitud = calcularDiferencia(ofertas);
        this.estadisticas.tasaCrecimiento = calcularTasaCrecimiento(ofertas);
        return this.estadisticas;
    }
    
    public float calcularPromedio(LinkedList<Float> ofertas){
        float valor=0;
        for(int i = 0 ; i<ofertas.size();i++){
            valor = valor + ofertas.get(i);
        }
        return valor/ofertas.size();
    }
    
    public float calcularDiferencia(LinkedList<Float> ofertas){
        if (ofertas == null || ofertas.isEmpty()) {
                throw new IllegalArgumentException("La lista está vacía o es nula");
            }

            float mayor = ofertas.getFirst();
            float menor = ofertas.getFirst();

            for (float numero : ofertas) {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

            return menor - mayor;
    }
    
    public float calcularTasaCrecimiento(LinkedList<Float> ofertas){
        if (ofertas == null || ofertas.isEmpty()) {
            throw new IllegalArgumentException("La lista está vacía o es nula");
        }

        float ofertaInicial = ofertas.getFirst();

        float ofertaFinal = ofertas.getFirst();
        for (float numero : ofertas) {
            if (numero > ofertaFinal) {
                ofertaFinal = numero;
            }
        }
        
        return ((ofertaFinal - ofertaInicial)/ofertaInicial)*100; 
    }
}
