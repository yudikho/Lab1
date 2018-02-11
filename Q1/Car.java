public class Car{
    private String model;
    private double maxSpeed;
    public Car(String model, double maxSpeed){
        this.model = model;
        this.maxSpeed = maxSpeed;

    }
    public String getModel(){
        return model;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public boolean isFasterThan(Car anotherCar){
        if(this.getMaxSpeed() > anotherCar.getMaxSpeed()){
            return true;
        }else{
            return false;
        }
    }

}
