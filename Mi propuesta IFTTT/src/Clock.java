
import java.util.Calendar;

import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
//Decirle a la condition concreta el sensor
public class Clock {
    
    private List<Condition> conditions;
    private Sensor sensor;
    private enum TimeOfDay {H, m};
    private TimeOfDay timeOfDay;
    private int time;
    
    public Clock(int time/*, TimeOfDay hourMinute*/) {
        //this.timeOfDay = hourMinute;
        //this.time = timeOfDay == TimeOfDay.H ? time*60*60*1000 : time*60*1000;
        timer(time);
    }
    
    /*public void crearSensor() {
        LocalDateTime l = LocalDateTime.now();
        sensor = new Sensor(l);
    }*/
    
    public void timer(int t) {
        
        Date horaDespertar = new Date(System.currentTimeMillis());

        Calendar c = Calendar.getInstance();
        c.setTime(horaDespertar);
        //System.out.println(c.get(Calendar.DAY_OF_WEEK));

        if (c.get(Calendar.HOUR_OF_DAY) >= 22) {
            c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + 1);
        }
        
        /*c.set(Calendar.HOUR_OF_DAY, 18);
        c.set(Calendar.MINUTE, 7);
        c.set(Calendar.SECOND, 0);*/
        
        horaDespertar = c.getTime();
        //System.out.println(horaDespertar);
        //System.out.println(c.get(Calendar.DAY_OF_WEEK));


        Timer timer = new Timer();
        timer.schedule(new Temporizador(), 0, t*1000);
        
    }

    public class Temporizador extends TimerTask {

        @Override
        public void run() {
            Sensor s = new Sensor(1, 22);
            Condition c = new Condition(s);
            //System.out.println("Funciona!!"/*sensor.getTemperatura()*/);
            this.cancel();
        }

    }
   
}

