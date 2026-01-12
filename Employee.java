public class Employee {
    int empId;
    String name;
    int attendance;
    int experience;
    int performanceScore;

    public Employee(int empId, String name, int attendance,
                    int experience, int performanceScore) {
        this.empId = empId;
        this.name = name;
        this.attendance = attendance;
        this.experience = experience;
        this.performanceScore = performanceScore;
    }

    public double calculateFinalScore() {
        return (attendance * 0.3) + (experience * 5) + (performanceScore * 0.5);
    }
}
