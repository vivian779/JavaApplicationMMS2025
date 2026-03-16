enum TrafficLight {

    RED(30),
    GREEN(45),
    YELLOW(5);

    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class Exercise8_10 {

    public static void main(String[] args) {

        for(TrafficLight t : TrafficLight.values()) {

            System.out.println(t + " duration: " + t.getDuration());
        }
    }
}