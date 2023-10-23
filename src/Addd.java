public class Addd {
    // method 01
    static int add(int a, int b){
        return a+b;
    }
    //same method 02
    static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        //create an object by referring class name
        Addd addd = new Addd();

        //calling method through the object
        System.out.println(addd.add(25,25));
        System.out.println(addd.add(25,25,25));

    }
}
