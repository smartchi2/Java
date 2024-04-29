import java.util.ArrayList;
import java.util.*;

class Student {
    private String name;
    private ArrayList<Double> scores;

    public int Grade(ArrayList<Double> scores) {
    public int nameGrade(ArrayList<String> name){
        this.name = name;
        this.scores = scores;
     	}
    public String getName(){
        return name;
    }

    public ArrayList<Double> getScores() {
        return scores;
    }

    public  double getAverageScore() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    public char getGrade() {
        double average = getAverageScore();
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

public class StudentGrade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i+1) + ": ");
            String name = scanner.next();
            ArrayList<Double> scores = new ArrayList<>();

            System.out.println("Enter scores for " + name + ": ");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Score for subject " + (j+1) + ": ");
                double score = scanner.nextDouble();
                scores.add(score);
            }

            Student studentGrade = new Student(name, scores);
            students.add(studentGrade);
        }

        System.out.println("\nClass Summary:");
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            System.out.println("Average Score: " + student.getAverageScore());
            System.out.println("Grade: " + student.getGrade());
            System.out.println();
        }
    }
}
