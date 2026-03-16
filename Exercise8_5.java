 public class Exercise8_5 {
    private int totalSeconds; // number of seconds since midnight

    // No-argument constructor
    public Time2() {
        this(0, 0, 0);
    }

    // Constructor with hour only
    public Time2(int hour) {
        this(hour, 0, 0);
    }

    // Constructor with hour and minute
    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    // Constructor with hour, minute and second
    public Time2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Copy constructor
    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set full time
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        totalSeconds = hour * 3600 + minute * 60 + second;
    }

    // Set hour
    public void setHour(int hour) {
        setTime(hour, getMinute(), getSecond());
    }

    // Set minute
    public void setMinute(int minute) {
        setTime(getHour(), minute, getSecond());
    }

    // Set second
    public void setSecond(int second) {
        setTime(getHour(), getMinute(), second);
    }

    // Get hour
    public int getHour() {
        return totalSeconds / 3600;
    }

    // Get minute
    public int getMinute() {
        return (totalSeconds % 3600) / 60;
    }

    // Get second
    public int getSecond() {
        return totalSeconds % 60;
    }

    // Universal format
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // Standard format
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(),
                (getHour() < 12 ? "AM" : "PM"));
    }

    // Test main method
    public static void main(String[] args) {
        Time2 t1 = new Time2(13, 27, 6);

        System.out.println("Universal time: " + t1.toUniversalString());
        System.out.println("Standard time: " + t1.toString());
    }
}
