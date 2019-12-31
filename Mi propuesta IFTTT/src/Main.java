//import java.util.Scanner

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        //System.out.println(Main.getUniqueID());

        //System.out.println(Main.verifyEmail("bianx.gp@gmail.com"));
        
        //Main.alarm();
        
        /*while(true){
            System.out.println(LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond());
            Thread.sleep(1000);
        }*/
        
        //Hora - Clock
        Clock c = new Clock(3);
        
    }

    //Unique ID
    public static final String getUniqueID() {
        return java.util.UUID.randomUUID()
                .toString()
                .replaceAll("-", "")
                .substring(0, 8);
    }

    //Verificar un mail
    public static boolean verifyEmail(String email) {
        Pattern pat = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");
        Matcher mat = pat.matcher(email);
        return mat.find();
    }

    //Sonido Alarma
    public static void alarm() {
        try {
            Clip sonido = AudioSystem.getClip();
            File a = new File(new File(".").getCanonicalPath() + "\\clockSound.wav");
            sonido.open(AudioSystem.getAudioInputStream(a));
            sonido.start();
            System.out.println("Reproduciendo 3s. de sonido...");
            Thread.sleep(3000); // 3 segundos (3000 milisegundos)
            sonido.close();
        } catch (Exception tipoError) {
            System.out.println("ERROR\n  El archivo no se puede reproducir o su ruta no existe");
        }
    }
    
    
    
}
