public class PersonTest 
{
    public static void main(String[] args) 
    {
        Person p1 = new Person();
        p1.setName("lani");
        p1.setAge(17);
        p1.setEmail("lani345@gmail.com");

        Person p2 = new Person("Temp Name", 0, "temp email");

        p2.setName("Sarahi");
        p2.setAge(18);
        p2.setEmail("sarahi21@gmail.com");

        p1.displayInfo();
        p2.displayInfo();
    }
        
    }
    

