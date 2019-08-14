/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto.domain;

/**
 *
 * @author edmayen
 */
public abstract class FiguraGeometrica 
{
    
    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura)
    {
        this.tipoFigura=tipoFigura;
    }
    
    //la clase padre no define comportamiento
    public abstract void dibujar();

    /**
     * @return the tipoFigura
     */
    public String getTipoFigura() 
    {    
        return tipoFigura;
    }

    /**
     * @param tipoFigura the tipoFigura to set
     */
    public void setTipoFigura(String tipoFigura)
    {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + this.tipoFigura + '}';
    }
    
    
    
}
