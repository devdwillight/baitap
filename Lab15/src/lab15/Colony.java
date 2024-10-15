/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab15;

/**
 *
 * @author PC
 */
public class Colony extends Organization{
    protected String place ;
    
    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }
    public Colony() {
    }
    @Override
    public void communicateByTool() {
    }
    public void  grow (){
    }
    public void reproduce(){
    }
    @Override
    public String toString() {
        return "Colony{" + "name=" + place + '}';
    }
    
        
    
}
