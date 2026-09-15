public class PersonTest 
{
    public static void main(String[] args) 
    {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(28);
        person1.setEmail("");

        Person person2 = new Person("Temp Name", 0, "temp email");

        person2.setName("");
        person2.setAge(34);
        person2.setEmail("");

        person1.displayInfo();
        person2.displayInfo();
    }
        
    }
    

