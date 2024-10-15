/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab15;

/**
 *
 * @author PC
 */
public abstract class Organization {
    protected  int size ;

    public Organization() {
    }
    public Organization( String string){
    }

    public Organization(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Organization{" + "size=" + size + '}';
    }
    public abstract  void communicateByTool();
    
    
}
