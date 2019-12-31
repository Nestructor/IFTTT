
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

public class Rule {

    private static final int ruleID;
    private String name;
    private String definition;
    private boolean active;
    private Calendar calendar;
    private Clock clock;

    List<Condition> conditions;
    List<Action> actions;
    //List<Sensor> sensors;
    //HashMap<String, String> h = new HashMap<>();
    
    //Crear sensor aqui??
    
    public Rule(String name, String definition, boolean active, Clock clock) {
        this.ruleID = getUniqueID();
        this.name = name;
        this.definition = definition;
        this.active = active;
        calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        this.clock = clock; 
    }

    public int getID() {
        return ruleID;
    }

    public Date getCalendar() {
        return calendar.getTime();
    }

    public String getDescription(int id) {
        return name + ": " + definition;
    }

    /*public boolean isActive() {
        return active;
    }
    
    public void setActive(boolean v) {
        active = v;
    }*/
    
    public boolean deleteRule(int id){
        
    }
    
}
