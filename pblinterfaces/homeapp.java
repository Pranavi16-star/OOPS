package pblinterfaces;

//Interface
interface SmartDevice {
 void turnOn();
 void turnOff();
 String getStatus();
}

//Implementation 1
class SmartLight implements SmartDevice {
 private boolean isOn = false;

 public void turnOn() {
     isOn = true;
     System.out.println("💡 Smart Light turned ON");
 }
 public void turnOff() {
     isOn = false;
     System.out.println("💡 Smart Light turned OFF");
 }
 public String getStatus() {
     return isOn ? "ON" : "OFF";
 }
}

//Implementation 2
class SmartFan implements SmartDevice {
 private boolean isOn = false;

 public void turnOn() {
     isOn = true;
     System.out.println("🌀 Smart Fan turned ON");
 }
 public void turnOff() {
     isOn = false;
     System.out.println("🌀 Smart Fan turned OFF");
 }
 public String getStatus() {
     return isOn ? "ON" : "OFF";
 }
}

//Main program
class homeapp {
 public static void main(String[] args) {
     SmartDevice[] devices = { new SmartLight(), new SmartFan() };

     for (SmartDevice d : devices) {
         d.turnOn();
         System.out.println("Status: " + d.getStatus());
         d.turnOff();
         System.out.println("Status: " + d.getStatus());
         System.out.println("-----------------");
     }
 }
}
