/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab15;

/**
 *
 * @author PC
 */
public class University extends Organization{
    protected String name ;

    public University() {
    }
    public University(String name, int size) {
        super(size);
        this.name = name;
    }

    @Override
    public void communicateByTool() {
    }
    public void enroll(){}
    public void educate(){}

    @Override
    public String toString() {
        return "University{" + "name=" + name + '}';
    }
    
    
}
