public class Vehicle {

    public void get(int id, String name, int year){
        System.out.println("Id number is: " + id + ", the vehicle name is: " + name + " & the imported year is: " + year);
    }
    public void get(int id, int year,String name){
        System.out.println("Id number is: " + id + ", the imported year is: " + name + "& the vehicle name is");
    }
}
class methodOverloading{
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.get(1,"PANDA Car",1980);
        vehicle.get(2,1900,"KDH Van");
    }
}
