package hello;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.capaciteReservoirEssence= 70 ;
		car.consommationEssencePar100Km=8 ;
		
		System.out.println(car.distanceMaximumtheorique());
		
		
		

	}

}
