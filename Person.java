public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String newName, int newAge, String newEmail) {
        name = newName;
        age = newAge;
        email = newEmail;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public void displayInfo() {
        System.out.println("----- Person Details -----");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Email : " + email);
        System.out.println("--------------------------\n");
    }
}