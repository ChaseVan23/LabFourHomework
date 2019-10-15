import java.io.IOException;

public class TestCar {

    public static void main(String[] args) throws IOException{

        Car car = new Car(2019, "Mustang");
   
        System.out.println("Starting Car Speed : " + car.getCarSpeed());
 
        for(int i=0;i<5;i++)

            car.accelerate();

        for(int i=0;i<5;i++)

            car.brake();

        System.out.println("Final Car Speed : " + car.getCarSpeed());
 
       }

   }


