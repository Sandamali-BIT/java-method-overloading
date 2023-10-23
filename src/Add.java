public class Add {
    // method 01
    static int add(int a, int b){
        return a+b;
    }
    //same method 02
    static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        //calling method without creating an object
        System.out.println(Add.add(25,25));
        System.out.println(Add.add(25,25,25));

    }
}