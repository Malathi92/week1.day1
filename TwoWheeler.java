package week1.day1;

public class TwoWheeler {
	
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=765475469l;
	boolean isPunctured=false;
	String bikeName="hero";
	double runningKm=3000;


	public static void main(String[] args) {
		
		TwoWheeler myTwoWheeler=new TwoWheeler();
		System.out.println("No of wheels:"+ myTwoWheeler.noOfWheels);
		System.out.println("No of mirrors:"+ myTwoWheeler.noOfMirrors);
		System.out.println("Chassisnumber is:"+ myTwoWheeler.chassisNumber);
		System.out.println("Bike is punctured"+ myTwoWheeler.isPunctured);
		System.out.println("Bike Name is:"+ myTwoWheeler.bikeName);
		System.out.println("Running KM is:"+ myTwoWheeler.runningKm);
		// TODO Auto-generated method stub

	}

}
