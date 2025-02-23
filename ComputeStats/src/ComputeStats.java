import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ComputeStats {
    public static void main(String[] args) throws FileNotFoundException {

        double value = 0;
        double sum = 0;
        int count = 0;
        double mean = 0;
        double variance = 0;
        double stdDev = 0;
        double difference;
        String filename;
        Scanner keyboard = new Scanner(System.in);
        PrintWriter fw = new PrintWriter("Results.txt");
        System.out.print("File Name:");
        filename = keyboard.nextLine();
        Scanner Inputfile = new Scanner(new File(filename));
        while (Inputfile.hasNextDouble()) {
            value = Inputfile.nextDouble();
            sum += value;
            count++;

        }
        Inputfile.close();
        mean = sum / count;
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdDev);
        fw.printf("Mean = %.3f%n", mean);


        Scanner Inputfile2 = new Scanner(new File(filename));
        sum = 0;
        count = 0;
        while (Inputfile2.hasNextDouble()) {
            value = Inputfile2.nextDouble();
            difference = mean - value;
            sum += Math.pow(difference, 2);
            count++;


        }
        variance = sum / count;
        stdDev = Math.sqrt(variance);

        System.out.println("Mean:" + mean);
        System.out.println("Standard Deviation:" + stdDev);
        fw.printf("Standard Deviation: %.3f%n", stdDev);

        fw.close();
    }
}