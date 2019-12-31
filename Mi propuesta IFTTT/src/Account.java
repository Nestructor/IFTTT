
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {

    private final int ID;
    private String username, passwd, email;
    private Scanner input;
    
    List<Rule> rules;
    List<Sensor> sensors;
    List<Actuator> actuators;

    public Account(String username, String passwd, String email) {
        this.ID = getUniqueID(); //clase
        setUsername(username);
        setPasswd(passwd);
        setMail(email);
    }

    public int getID() {
        return ID;
    }

    public String getMail() {
        return email;
    }
    
    public void setMail(String m) {
        input = new Scanner(System.in);
        this.email = m;
        while (!verifyMail(m)) {
            System.out.println("El correo introducido no es válido");
            this.email = input.nextLine();
        }
    }

    public void setPasswd(String passwd) {
        input = new Scanner(System.in);
        this.passwd = passwd;
        while (passwd.length() < 4) {
            System.out.println("La contraseña debe contener más de 3 caracteres");
            this.passwd = input.nextLine();
        }
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public List<Rule> getRules() {
        List<Rule> myRules = new ArrayList<>();
        rules.forEach((r) -> {
            myRules.add(r);
        });
        return myRules;
    }
    
    public List<Rule> getActuators() {
        List<Rule> myActuators = new ArrayList<>();
        rules.forEach((r) -> {
            myActuators.add(r);
        });
        return myActuators;
    }
    
    public List<Rule> getSensors() {
        List<Rule> mySensors = new ArrayList<>();
        for (Rule r : rules) {
            mySensors.add(r);
        }
        return mySensors;
    }
}