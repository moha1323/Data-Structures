package structures;

import java.util.Timer;
import java.util.TimerTask;

public class Time {
    int secondsPassed = 0;
    boolean stop = false;

    public Time() {

    }

    Timer timer = new Timer();
    TimerTask task = new TimerTask () {
        @Override
        public void run() {
            secondsPassed++;
            System.out.println("Time: " + secondsPassed);
        }
    };

    public void start(){
        timer.scheduleAtFixedRate(task,1000,1000);

    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
