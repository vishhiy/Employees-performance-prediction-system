import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        String csvFile = "employees.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            br.readLine(); // Skip header

            System.out.println("Employee Performance Prediction\n");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                Employee emp = new Employee(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3]),
                        Integer.parseInt(data[4])
                );

                double finalScore = emp.calculateFinalScore();
                String performance = PerformancePredictor.predict(emp);

                System.out.println("Employee ID: " + emp.empId);
                System.out.println("Name: " + emp.name);
                System.out.println("Final Score: " + finalScore);
                System.out.println("Performance: " + performance);
                System.out.println("---------------------------");
            }

        } catch (Exception e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}
