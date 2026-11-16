public class Student {
   

    // 1. Private attributes
    private String name;
    private String studentId;
    private double grade;

    // 2. Constructor
    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    // 3. Getters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    // 4. Setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // 5. Display student information
    public void displayInfo() {
        System.out.println("Name: " + name +
                " | ID: " + studentId +
                " | Grade: " + grade);
    }

    // 6. Main method
    public static void main(String[] args) {

        // Create two Student objects
        Student student1 = new Student("Jendel Rian Teodoro Lilan", "251-0099-1", 87.1);

        Student student2 = new Student("Ricky Buccat", "251-0098-2", 88.5);

        // Change the first student's grade
        student1.setGrade(87.1);

        // Display both students
        student1.displayInfo();
        student2.displayInfo();
    
}
}
