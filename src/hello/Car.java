package hello;

public class Car {

	int capaciteReservoirEssence;
	int consommationEssencePar100Km;
	public double distanceMaximumtheorique() {
		
		double distance = 100*(1.0*capaciteReservoirEssence/consommationEssencePar100Km);
		
		return distance;
	}
}
