package section8.composition;

import javax.management.monitor.Monitor;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("v9","dell","450");
        Monitor theMonitor = new Monitor("27 inch hd","Asus",27,"1080 x 1980");
        Motherboard theMotherboard = new Motherboard("b450","asus tuf",2,2,"v1.00");
        PersonalComputer thePc = new PersonalComputer("x3d","amd",theMonitor,theCase,theMotherboard);
//        thePc.getMonitor().drawPixelAt(1,2,"red");
        thePc.powerUp();
    }
}
