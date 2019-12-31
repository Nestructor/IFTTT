public class Sensor {
    
    private int temperature, bright, type;
    
    public Sensor(int type , int value) {
        this.type = type;
        switch(type) {
            case 1:
                temperature = value;
                break;
            case 2:
                bright = value;
                break;
            default:
                System.out.println("El sensor especificado (1 ó 2) es incorrecto");
        }
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public int getBrightness() {
        return bright;
    }
    
    public int getType() {
        return type;
    }
    
}
