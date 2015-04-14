public class CarDriver {
	public static void main(String [] args){
		Car Lambo = new Car("silver", 210, 2.0);

		System.out.println(Lambo);

		Car car1 = new Car();

		System.out.println(car1);

		

		Car Supra = new Car("pearly", 300, 3.0);

		System.out.println(Supra);

		Car car2 = new Car();

		System.out.println(car2);

		

		Car toyota = new Car("gold", 260, 2.5);

		System.out.println(toyota);

		Car car3 = new Car();

		System.out.println(car3);
		
		toyota.setColor("red");
	 
		toyota.setHorsePower(320);
		 
		toyota.setEngineSize(3.0);
		System.out.println(toyota);

}
}
