package Assignment6;

public class Overloaded {
    Overloaded(){
        this("calling one parameterized constructor from default constructor");
    }

    Overloaded(String input){
        System.out.println("parameterized constructor : " + input);
    }
}