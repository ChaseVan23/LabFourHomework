public class Car {
     
    private int yearModel;
    private String make;
    private int speed;

public Car(int yearModel, String make) {

    this.yearModel = yearModel;
    this.make = make;
    this.speed = 0;
  
}

public void accelerate() {

    this.speed = this.speed + 5;

    System.out.println("Current Car Speed: " + this.speed);

}

public void brake() {

    this.speed = this.speed - 5;

    System.out.println("Current Car Speed : " + this.speed);

}

public int getCarSpeed() {

    return this.speed;
  }

}
