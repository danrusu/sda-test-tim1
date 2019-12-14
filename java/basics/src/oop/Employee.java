package oop;

public class Employee {
    // private encapsulation
    private String firstName;
    private String lastName;
    private int age;
    private String jobTitle;
    private String employerName;
    private String employerCity;

    public Employee(String firstName,
                    String lastName,
                    int age,
                    String jobTitle,
                    String employerName,
                    String employerCity) {
        this.firstName = firstName;

        this.lastName = lastName;
        this.age = age;
        this.jobTitle = jobTitle;
        this.employerName = employerName;
        this.employerCity = employerCity;
    }

    @Override
    public String toString() {
        // John Doe, age 35: Timisoara | NAGARRO | SDET
        return firstName + " " + lastName
                + ", age " + age
                + ": " + employerCity
                + " | " + employerName
                + " | " + jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getEmployerCity() {
        return employerCity;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public void setEmployerCity(String employerCity) {
        this.employerCity = employerCity;
    }

    // modified setter
    public void incrementAge() {
        this.age++;
    }

    public static String getYoungestEmployeeName(Employee e1, Employee e2) {

        if (e1.getAge() < e2.getAge()) {
            // #1. e1.age < e2.age
            return e1.getFirstName() + " " + e1.getLastName();
        } else { // e1.age >= e2.age
            if (e1.getAge() > e2.getAge()) {
                // #2. e1.age > e2.age
                return e2.getFirstName() + " " + e2.getLastName();
            } else {
                // #3. e1.age == e2.age
                return e1.getFirstName() + " " + e1.getLastName()
                        + ", " + e2.getFirstName() + " " + e2.getLastName();
            }
        }
    }

    public static String getYoungestEmployeeName2(Employee e1, Employee e2) {

        // #1. e1.age == e2.age
        if (e1.getAge() == e2.getAge()) {
            return e1.getFullName() + ", " + e2.getFullName();
        }

        // #2. e1.age < e2.age
        if (e1.getAge() < e2.getAge()) {
            return e1.getFullName();
        }

        // #3. e1.age > e2.age
        //if (e1.getAge() > e2.getAge()) {
        return e2.getFullName();
        //}
    }

    // old school - One return - DO NOT USE!!!
    public static String getYoungestEmployeeName3(Employee e1, Employee e2) {
        String youngestEmployeeFullName = "";

        // #1. e1.age == e2.age
        if (e1.getAge() == e2.getAge()) {
            youngestEmployeeFullName = e1.getFullName() + ", " + e2.getFullName();
        }

        // #2. e1.age < e2.age
        if (e1.getAge() < e2.getAge()) {
            youngestEmployeeFullName = e1.getFullName();
        }

        // #3. e1.age > e2.age
        if (e1.getAge() > e2.getAge()) {
            youngestEmployeeFullName = e2.getFullName();
        }

        return youngestEmployeeFullName;
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee(
                "John",
                "Doe",
                35,
                "SDET",
                "NAGARRO",
                "Timisoara");

        // John Doe, age 35: Timisoara | NAGARRO | SDET
        System.out.println(employee1);
        //System.out.println(employee1.toString());  // toString from Object class

        // modification
        // job title: DEV employer name: ING employer city: Bucuresti
        // increment age
        employee1.setJobTitle("DEV");
        employee1.setEmployerName("ING");
        employee1.setEmployerCity("Bucuresti");
        employee1.incrementAge();
        System.out.println(employee1);

        System.out.println("#10 ***************");
        Employee employee2 = new Employee(
                "Michael",
                "Jackson",
                36,
                "MUSICIAN",
                "SONY RECORDS",
                "California");

        String youngestEmployeeName = Employee.getYoungestEmployeeName3(employee1, employee2);
        System.out.println(youngestEmployeeName);

        employee2.incrementAge();
        System.out.println(Employee.getYoungestEmployeeName3(employee1, employee2));

    }
}
