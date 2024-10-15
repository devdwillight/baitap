/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab15;

/**
 *
 * @author PC
 */
public class FPTUniversity extends University implements Role{
    private String address ;

    public FPTUniversity() {    }

    public FPTUniversity(String address, String name, int size) {
        super(name, size);
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void createWorker() {
    }

    @Override
    public String toString() {
        return "FPTUniversity{" + "size" + size + "name" + name + "address=" + address + '}';
    }
    
}
