 import java.util.Scanner;

public class Exercise4_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] questions = {
            "1. What is the primary greenhouse gas responsible for global warming?\n" +
            "   1. Oxygen\n   2. Carbon dioxide\n   3. Nitrogen\n   4. Helium\nYour answer: ",
            
            "2. Some skeptics argue that recent global temperature increases are primarily due to:\n" +
            "   1. Natural climate variability\n   2. Increased volcanic activity\n   3. Changes in the Earth's orbit\n   4. Human activity\nYour answer: ",
            
            "3. Which of the following is a potential consequence of global warming?\n" +
            "   1. Rising sea levels\n   2. Decreased hurricane activity\n   3. Increased polar ice sheets\n   4. Cooler global temperatures\nYour answer: ",
            
            "4. What has been a common scientific consensus regarding human impact on climate change?\n" +
            "   1. Humans have no effect on climate change\n   2. Human activities significantly contribute to global warming\n   3. Climate change is solely due to solar cycles\n   4. Climate change is a myth\nYour answer: ",
            
            "5. Which of these measures is often proposed to reduce greenhouse gas emissions?\n" +
            "   1. Burning more fossil fuels\n   2. Deforestation\n   3. Using renewable energy sources\n   4. Increasing industrial activity\nYour answer: "
        };

        int[] correctAnswers = {2, 4, 1, 2, 3};

        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i]);
            int answer = scanner.nextInt();

            if (answer == correctAnswers[i]) {
                score++;
            }
        }

        System.out.println("\nYour score: " + score + " out of 5.");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score == 4) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Some useful websites for further information:");
            System.out.println("- NASA Climate Change: https://climate.nasa.gov/");
            System.out.println("- Intergovernmental Panel on Climate Change (IPCC): https://www.ipcc.ch/");
            System.out.println("- EPA Climate Change: https://www.epa.gov/climate-change");
        }

        scanner.close();
    }
}
 