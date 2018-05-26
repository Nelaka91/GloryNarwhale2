/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glorynarwhale;

/**
 *
 *
 */
public class ConstantElement extends GloryElement {
    
    private double value;
   
    public void Show(){
        System.out.println("This is the ConstantElement class that inherit from GloryElement class");
   
   }
    

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    private void setValue(double value) {
        this.value = value;
    }
    
    
}
