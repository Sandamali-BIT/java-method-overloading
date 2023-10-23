public class Programming {
    //create a variable
    String language;

    //create a constructor 01
    Programming(){
        this.language="Java";
    }
    //create a same constructor 02 by passing an argument
    Programming(String languages){
        this.language=languages;
    }
    //create a method and print statement we needed
    public void getName(){
        System.out.println("Programming language name is : " + this.language);
    }
    // main method and create two objects
    public static void main(String[] args) {
        //no parameter argument
        Programming pr1=new Programming();
        //there are parameter arguments
        Programming pr2=new Programming("Python");
        Programming pr3=new Programming("C++");
        //calling to the method through objects
        pr1.getName();
        pr2.getName();
        pr3.getName();

    }
}
