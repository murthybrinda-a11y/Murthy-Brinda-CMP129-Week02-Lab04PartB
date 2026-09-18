public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String nName, int nAge, String nEmail) 
    {
        name = nName;
        age = nAge;
        email = nEmail;
    }

    public Person() 
    {
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String newName) 
    {
        name = newName;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int newAge) 
    {
        if (newAge >= 0) 
        {
            age = newAge;
        } 
        else
        {
            System.out.println("Age cant negative.");
        }
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String newEmail) 
    {
        email = newEmail;
    }

    public void displayInfo() 
    {
        System.out.println("        Person Details     ");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Email : " + email);
        System.out.println("\n");
    }
}