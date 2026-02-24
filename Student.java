package org.example;

public class Student {

    // =========================
    // FIELDS
    // =========================
    private final String firstName;
    private final String middleInitial;
    private final String lastName;
    private final int age;
    private final String course;
    private final int section;
    private final int studentNumber;
    private final String address;
    private final String phoneNumber;  // changed from int to String
    private final boolean isEnrolled;

    // =========================
    // PRIVATE CONSTRUCTOR
    // =========================
    private Student(Builder builder) {
        this.firstName = builder.firstName;
        this.middleInitial = builder.middleInitial;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.course = builder.course;
        this.section = builder.section;
        this.studentNumber = builder.studentNumber;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.isEnrolled = builder.isEnrolled;
    }
    // =========================
    // GETTERS
    // =========================
    public String getFirstName() {return firstName;}
    public String getMiddleInitial() {return middleInitial;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public String getCourse() {return course;}
    public int getSection() {return section;}
    public int getStudentNumber() {return studentNumber;}
    public String getAddress() {return address;}
    public String getPhoneNumber() {return phoneNumber;}
    public boolean isEnrolled() {return isEnrolled;}

    @Override
    public String toString() {
        return

                "\n" + "--Student Info--" + "\n" +
                        "-------------------------" +"\n" +
                        "Name: " + firstName + " " + middleInitial + " " + lastName + "\n" +
                        "Age: " + age + "\n" +
                        "Course: " + course + "\n" +
                        "Section: " + section + "\n" +
                        "Student Number: " + studentNumber + "\n" +
                        "Address: " + address + "\n" +
                        "Phone Number: " + phoneNumber + "\n" +
                        "Enrolled: " + (isEnrolled ? "Yes" : "No");
    }

    // =========================
    // BUILDER CLASS
    // =========================
    public static class Builder {
        private String firstName;
        private String middleInitial;
        private String lastName;
        private int age;
        private String course;
        private int section;
        private int studentNumber;
        private String address;
        private String phoneNumber;  // changed from int to String
        private boolean isEnrolled;

        public Builder setFirstName(String firstName) {this.firstName = firstName;return this;}
        public Builder setMiddleInitial(String middleInitial) {this.middleInitial = middleInitial;return this;}
        public Builder setLastName(String lastName) {this.lastName = lastName;return this;}
        public Builder setAge(int age) {this.age = age;return this;}
        public Builder setCourse(String course) {this.course = course;return this;}
        public Builder setSection(int section) {this.section = section;return this;}
        public Builder setStudentNumber(int studentNumber) {this.studentNumber = studentNumber;return this;}
        public Builder setAddress(String address) {this.address = address;return this;}
        public Builder setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;return this;}
        public Builder setIsEnrolled(boolean isEnrolled) {this.isEnrolled = isEnrolled;return this;}

        public Student build() {return new Student(this);}
    }
}
