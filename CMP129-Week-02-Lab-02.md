CMP 129 – Computer Science II
Week 2 – Lab 2: Classes, Objects, and Constructors
Learning Objectives

After completing this lab, students should be able to:

Define a Java class with private attributes.
Create objects from a class.
Apply data encapsulation using getter and setter methods.
Create and use a parameterized constructor.
Call instance methods using objects.
Test a class using a separate test class.

Complete both phases in order using the same `Person.java` and `PersonTest.java` files in the repository root. Commit Phase 1 before modifying the files for Phase 2. Only the completed Phase 2 files need to remain when you submit the lab.

Phase 1: Person Class Without a Defined Constructor

Create a Java class named Person that stores information about a person. Do not define a constructor in this version. Java will provide the default no-argument constructor automatically.

Person Class Requirements

Create a file named:

Person.java

The Person class must contain the following private attributes:

name — a String
age — an int
email — a String

Implement getter and setter methods for every attribute:

getName()
setName()
getAge()
setAge()
getEmail()
setEmail()

Create a method named:

displayInfo()

The method must display the person’s name, age, and email in a clear, formatted manner.

PersonTest Class Requirements

Create a separate file named:

PersonTest.java

In the main method:

Create at least two Person objects using the default constructor.
Use the setter methods to assign the name, age, and email of each person.
Use the getter methods to retrieve at least one attribute.
Call displayInfo() for each object.
Example Output Format
Person Information
------------------
Name:  Maria Johnson
Age:   28
Email: maria@example.com

Person Information
------------------
Name:  David Smith
Age:   35
Email: david@example.com

Do not use a parameterized constructor during Phase 1.

Phase 2: Add a Parameterized Constructor

Modify the existing `Person.java` file from Phase 1 by adding a parameterized constructor. Then update the existing `PersonTest.java` file to test the constructor.

Person Class Requirements

Create a file named:

Person.java

The Person class must contain the following private attributes:

name — a String
age — an int
email — a String

Create a constructor that accepts values for all three attributes:

public Person(String name, int age, String email)

The constructor must initialize the object’s attributes using the values received through its parameters.

Implement getter and setter methods for every attribute:

getName()
setName()
getAge()
setAge()
getEmail()
setEmail()

Create a method named:

displayInfo()

The method must display the person’s name, age, and email in a clear, formatted manner.

PersonTest Class Requirements

Create a separate file named:

PersonTest.java

In the main method:

Create at least two Person objects using the parameterized constructor.
Pass a name, age, and email to the constructor for each object.
Use at least one setter method to update an attribute after an object has been created.
Use at least one getter method to retrieve an attribute.
Call displayInfo() for each object.

In the final Phase 2 test, create the required objects using the parameterized constructor.

General Requirements
Keep all attributes private.
Follow standard Java naming conventions.
Use the this keyword where appropriate.
Use meaningful variable and object names.
Indent and format the code correctly.
Include comments explaining the class, attributes, constructor, and important methods.
Do not place the main method inside the Person class.
Each PersonTest class must contain a valid main method.
Both phases must compile and run without errors before you continue.
Test every getter, setter, constructor, and displayInfo() method.
You must be able to explain every part of your submitted code.
Follow the course AI-use policy.
Record any AI assistance in AI-Use-Report.md.
Required Organization

Keep these files directly in the repository root:

- `CMP129-Week-02-Lab-02.md`
- `AI-Use-Report.md`
- `Person.java`
- `PersonTest.java`

Do not create or use a `src` folder.


Submission

Push the following final Phase 2 files to your Week 2, Lab 2 GitHub repository:

- `Person.java`
- `PersonTest.java`
- `AI-Use-Report.md`

Make at least two meaningful commits while completing the lab. Use clear commit messages, such as:

Complete Person class without constructor
Add constructor version and test class
