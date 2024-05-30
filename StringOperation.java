public class StringOperation {
    public static void main(String[] args) {
        String name = "Naved";  // %s
        String country = "Bangladesh";   //%s
        int age = 22;   //%d

        System.out.println("Hello! I am "+ name +" from "+ country + ". I am "+age+ " years old." );

        //formatted string
        String university = "BRAC University in CSE department."; // %s
        double cgpa = 3.4;   //f
        boolean isclaim = true;    //%b
        char percent = '%';      //%c
       
        String formattedString = String.format("Hello! I am %s from %s. I am %d years old. I study in %s. I've %f cgpa", name, country, age, university,cgpa);
        System.out.println(formattedString);

        String formattedString2 = String.format("My age is 22 which is %b and i scored only 80%c.", isclaim, percent);
        System.out.println(formattedString2);

        System.out.println(name.length());   //prints length of a string
        System.out.println(name.isEmpty());  // returns if the variable is empty in boolean

        System.out.println(name.toUpperCase()); // makes uppercase 
        System.out.println(name.toLowerCase());   // makes lowercase
        System.out.println(name.equals(university)); 
        System.out.println(university.replace("CSE", "CS")); 


        String new1 = "It is night time now.";
        new1 = new1.replace("night", "day");
        System.out.println(new1);
        System.out.println(new1.contains("day"));

        


    }
}
