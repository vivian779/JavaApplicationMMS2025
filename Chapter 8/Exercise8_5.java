class Time2 {

    private int seconds;

    public Time2() {
        this(0,0,0);
    }

    public Time2(int hour,int minute,int second) {
        setTime(hour,minute,second);
    }

    public void setTime(int hour,int minute,int second) {

        if(hour<0 || hour>=24)
            throw new IllegalArgumentException("hour 0-23");

        if(minute<0 || minute>=60)
            throw new IllegalArgumentException("minute 0-59");

        if(second<0 || second>=60)
            throw new IllegalArgumentException("second 0-59");

        seconds = hour*3600 + minute*60 + second;
    }

    public int getHour() { return seconds/3600; }

    public int getMinute() { return (seconds%3600)/60; }

    public int getSecond() { return seconds%60; }

    public String toUniversalString() {

        return String.format("%02d:%02d:%02d",
                getHour(),getMinute(),getSecond());
    }
}

public class Exercise8_5 {

    public static void main(String[] args) {

        Time2 t = new Time2(13,27,6);

        System.out.println(t.toUniversalString());
    }
}