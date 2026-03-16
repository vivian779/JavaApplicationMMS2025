public class Exercise8_19 {

    private String callerName;
    private String phoneNumber;
    private String location;
    private String emergencyType;
    private String responseType;
    private String status;
    private String timeReported;

    public Emergency(String callerName,String phoneNumber,
                     String location,String emergencyType,
                     String responseType,String status,
                     String timeReported) {

        this.callerName = callerName;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.emergencyType = emergencyType;
        this.responseType = responseType;
        this.status = status;
        this.timeReported = timeReported;
    }
}