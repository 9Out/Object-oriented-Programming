/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

/**
 *
 * @author RPL-11-PC
 */
public class cars {
    int cadence;
    int speed;
    int gear;

    void changeCadence (int changeCadence) {
    cadence = changeCadence;
    }
    
    void speedUp (int speedUp) {
    speed = speedUp;
    }
    
    void changeGear (int changeGear) {
    gear = changeGear;
    }
        
    void printInfo () {
        System.out.println(
        "changeCadence : " + cadence + "\n" +
        "speedUp : " + speed + "\n" +
        "changeGear : " + gear + "\n");
    }
}
