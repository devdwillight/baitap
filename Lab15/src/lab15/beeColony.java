/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab15;

/**
 *
 * @author PC
 */
public class beeColony extends Colony implements Role{
    private String type ;
    
    public beeColony(){
    }
    public beeColony(String type, String place, int size) {
        super(place, size);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getPlace() {
        return place;
    }

    public int getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String place) {
        this.place = place;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "beeColony{" + "size" + size + "place" + place + "type=" + type + '}';
    }

    @Override
    public void createWorker() {
    }
    
}
