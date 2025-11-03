import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentInfo student = new StudentInfo();

        System.out.println("=== Enter Student Information ===");

        System.out.print("Enter the Name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter the ID: ");
        student.setID(sc.nextLine());

        System.out.print("Enter the Phone Number: ");
        student.setPhoneNumber(sc.nextLine());

        System.out.print("Enter the Email ID: ");
        student.setEmailID(sc.nextLine());

        System.out.print("Enter the Caste: ");
        student.setCaste(sc.nextLine());

        System.out.print("Enter the City: ");
        student.setCity(sc.nextLine());

        System.out.print("Enter the State: ");
        student.setState(sc.nextLine());

        System.out.print("Enter the Pincode: ");
        student.setPincode(sc.nextLine());

        System.out.print("Enter the Division: ");
        student.setDivision(sc.nextLine());

        System.out.println("\nEnter marks for 5 subjects (out of 100):");
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid integer: ");
                sc.next(); // discard invalid input
            }
            marks[i] = sc.nextInt();
        }
        sc.close();

        student.setMarks(marks);

        // Display result
        System.out.println("\n======= STUDENT DETAILS =======");
        System.out.println("Name      : " + student.getName());
        System.out.println("ID        : " + student.getID());
        System.out.println("Phone     : +91 " + student.getPhoneNumber());
        System.out.println("Email     : " + student.getEmailID());
        System.out.println("Caste     : " + student.getCaste());
        System.out.println("City      : " + student.getCity());
        System.out.println("State     : " + student.getState());
        System.out.println("Pincode   : " + student.getPincode());
        System.out.println("Division  : " + student.getDivision());

        System.out.println("\n======= RESULT =======");
        System.out.println("Result     : " + student.getResult());
        System.out.println("Percentage : " + student.getPercentage());
    }
}

class StudentInfo {
    private String name;
    private String id;
    private String phoneNumber;
    private String emailID;
    private String caste;
    private String city;
    private String state;
    private String pincode;
    private String division;
    private int[] marks = new int[5];

    private String result = "Pass";
    private double percentage;
    private boolean showPercentage = true;

    // ====== Setters and Getters ======
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public void setID(String id) { this.id = id; }
    public String getID() { return this.id; }

    public void setPhoneNumber(String number) {
        if (number != null && number.matches("\\d{10}")) {
            this.phoneNumber = number;
        } else {
            this.phoneNumber = "Invalid number";
            System.out.println("⚠ Please enter a valid 10-digit phone number.");
        }
    }
    public String getPhoneNumber() { return this.phoneNumber; }

    public void setEmailID(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.emailID = email;
        } else {
            this.emailID = "Invalid email";
            System.out.println("⚠ Please enter a valid email ID.");
        }
    }
    public String getEmailID() { return this.emailID; }

    public void setCaste(String caste) { this.caste = caste; }
    public String getCaste() { return this.caste; }

    public void setCity(String city) { this.city = city; }
    public String getCity() { return this.city; }

    public void setState(String state) { this.state = state; }
    public String getState() { return this.state; }

    public void setPincode(String pincode) { this.pincode = pincode; }
    public String getPincode() { return this.pincode; }

    public void setDivision(String division) { this.division = division; }
    public String getDivision() { return this.division; }

    // ====== Marks, Result, Percentage ======
    public void setMarks(int[] marks) {
        this.marks = marks;
        int sum = 0;
        boolean failed = false;

        for (int mark : marks) {
            if (mark < 35) {
                failed = true;
            }
            sum += mark;
        }

        if (failed) {
            result = "Fail";
            showPercentage = false;
        } else {
            result = "Pass";
            percentage = (double) sum / marks.length;
            showPercentage = true;
        }
    }

    public int[] getMarks() { return this.marks; }

    public String getResult() { return this.result; }

    public String getPercentage() {
        if (showPercentage)
            return String.format("%.2f%%", percentage);
        else
            return "Not available (failed in one or more subjects)";
    }
}
