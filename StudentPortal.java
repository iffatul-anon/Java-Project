import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class Profile {
    int id;
    String name;
    String dateOfBirth;
    String fatherName;
    String motherName;
    String department;
    String email;
    String phone;
    String address;
    String bloodGroup;
    String religion;
}

class Password {
    int id;
    String password;
}

class StudentWaiver {
    int id;
    float givenWaiver;
    float requiredSGPA;
}

class StudentResult {
    int id;
    float sgpa;
    String subject;
    float averageQuiz, quiz1, quiz2, quiz3;
    float assignment;
    float presentation;
    float attendance;
    float midterm;
    float finalExam;
    float total;
    float gradePoint;
    float labPerformance;
    float labReport;
    float proposal;
}

public class StudentPortal {
  
    public static void main(String[] args) {
        while (true) {
            studentLogin();
        }
    }

    static void studentLogin() {
        // code
    }

    static void studentLogout() {
        // code
    }
  
    static void studentDashboard(int id) {
        // code
    }

    static void studentProfile(int id) {
        // code
    }

    static void studentProfileUpdate(int id) {
        // code
    }

    static void studentPasswordChange(int id) {
        // code
    }
  
    static void studentPaymentLedger(int id) {
        // code
    }

    static void studentResult() {
        // code
    }
    
}
