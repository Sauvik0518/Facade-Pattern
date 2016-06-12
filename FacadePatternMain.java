package iit.du.ac.bd;

public class FacadePatternMain {
	public static void main(String[] args){
		ICar car = new CarFacade();
		car.buildCar();
	}
}
