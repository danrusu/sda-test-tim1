### 4 Java Homework 
Using a IntelliJ IDEA solve the folowing tasks.

1. Create a new Java project named `basics`, create a package named `oop` inside the project.

2. Create a class named `Employee` that will contain the folowing information:

first name
last name
age
job title
employer name
employer city

3. Create an entrypoint in Employee class, so that we can run/execute the Employee class.

4. Create new employee with the following data:
John 
Doe
35
SDET
Nagarro
Timisoara

and store it in a variable named `employee1`;

5. Make the needed changes so that 

System.out.println(employee1);

will print 
John Doe, age 35: Timisoara | NAGARRO | SDET

6. Create getters for all fields

7. Create setters for: job title, employer name, employer city.

8. Create an instance method that can increment the employee age.

9. Set new values for:
job title: DEV
employer name: ING
employer city: Bucuresti

Increase `employee1` age.

Print `employee1`.

10. Create a class method named `getYoungestEmployeeName` 
that receives 2 Employee objects as parameters and returns the youngest employee full name.
If both employee have same age then the function should return both full names separated by a comma.

Create another employee object named `employee2` with the age of 36.

Call the `getYoungestEmployeeName` function:

String youngestEmployeeName = Employee.getYoungestEmployeeName(employee1, employee2);
Print the `youngestEmployeeName`.

Increase the age of `employee2`.

Run again:
youngestEmployeeName = Employee.getYoungestEmployeeName(employee1, employee2);
Print `youngestEmployeeName`.
