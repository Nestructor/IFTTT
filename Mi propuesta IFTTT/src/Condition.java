
import java.util.ArrayList;
import java.util.List;


public class Condition {

    private static List<Sensor> sensors;
    
    public Condition(Sensor s) {
        //sensors.add(s);
        if(s.getType() == 1) verifyTemperature(s);
    }

    public List<Sensor> getSensors() {
        List<Sensor> mySensors = new ArrayList<>();
        for (Sensor r : sensors) {
            mySensors.add(r);
        }
        return mySensors;
    }
    
    public boolean evaluate(){
        return this.relationaloperator.evaluate.(this.th,this.sensor);
    }
    
    public void verifyTemperature(Sensor temp) {
        if(temp.getTemperature() <= 22) {
            System.out.println("Calentando..."); //Llamar al actuador
        }
    }
    
    public boolean verifyBrightness() {
        
    }
    
    public boolean verifyFood() {
        
    }
    
    public void changeConditions() {
        
    }
    

}
