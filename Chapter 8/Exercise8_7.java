public class Exercise8_7 {
    private int hour, minute, second;

    // constructors, setTime, getHour/getMinute/getSecond, toUniversalString, toString same as original

    public void tick() {
        setSecond(getSecond() + 1);
        if (getSecond() == 60) {
            setSecond(0);
            incrementMinute();
        }
    }

    public void incrementMinute() {
        setMinute(getMinute() + 1);
        if (getMinute() == 60) {
            setMinute(0);
            incrementHour();
        }
    }

    public void incrementHour() {
        setHour(getHour() + 1);
        if (getHour() == 24) {
            setHour(0);
        }
    }

    // ... rest of original Exercise8_5 methods ...
	
    private int secondsSinceMidnight; // 0 to 86399

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.secondsSinceMidnight = hour * 3600 + minute * 60 + second;
    }

    public Time2(Time2 time) {
        this.secondsSinceMidnight = time.secondsSinceMidnight;
    }

    private void validateTime(int h, int m, int s) {
        if (h < 0 || h >= 24) throw new IllegalArgumentException("hour 0-23");
        if (m < 0 || m >= 60) throw new IllegalArgumentException("minute 0-59");
        if (s < 0 || s >= 60) throw new IllegalArgumentException("second 0-59");
    }

    public void setTime(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        secondsSinceMidnight = hour * 3600 + minute * 60 + second;
    }

    public void setHour(int hour) {
        int m = getMinute(), s = getSecond();
        validateTime(hour, m, s);
        secondsSinceMidnight = hour * 3600 + m * 60 + s;
    }

    public int getHour()   { return secondsSinceMidnight / 3600; }
    public int getMinute() { return (secondsSinceMidnight % 3600) / 60; }
    public int getSecond() { return secondsSinceMidnight % 60; }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        int h = getHour();
        return String.format("%d:%02d:%02d %s", (h == 0 || h == 12) ? 12 : h % 12, getMinute(), getSecond(), h < 12 ? "AM" : "PM");
    }

}