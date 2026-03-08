public class Exercise4_32 {
    public static void main(String[] args) {
        double currentUsers = 1_000_000_000; // 1 billion
        double growthRate = 0.04; // 4% per month
        
        int target1 = 1500000000; // 1.5 billion
        int target2 = 2000000000; // 2 billion

        int monthsTo1_5B = (int) Math.ceil(
            Math.log(target1 / currentUsers) / Math.log(1 + growthRate)
        );

        int monthsTo2B = (int) Math.ceil(
            Math.log(target2 / currentUsers) / Math.log(1 + growthRate)
        );

        System.out.println("Months to reach 1.5 billion users: " + monthsTo1_5B);
        System.out.println("Months to reach 2 billion users: " + monthsTo2B);
    }
}
