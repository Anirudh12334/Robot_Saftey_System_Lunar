public class Main {

public static void main(String[] args) {

    double batteryVoltage = 11.8;
    boolean robotEnabled = true;
    int shooterRPM = 3200;
   

if (robotEnabled == true && batteryVoltage > 10.0){
    System.out.println("Battery is good");
}
else if (robotEnabled == true && batteryVoltage < 10.0){
    System.out.println("Battery is low");
}
else{
    System.out.println("Robot is disabled, cannot check battery");


}


if (shooterRPM > 3000 && batteryVoltage > 10.0){
    System.out.println("Shooter is at full speed");
}
else if (shooterRPM < 3000 && batteryVoltage > 10.0){
    System.out.println("Shooter is at low speed");
}
else{
    System.out.println("Shooter is not running");

}
 System.out.println("Mission complete, Commande");

}

    
}