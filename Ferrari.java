//package abstractClass;

public class Ferrari extends Car {

	public static void main(String[] args) {
		Car c=new Car();
		 c.setModel("Limited Edition");
		 c.setPrice(200);

		 System.out.println("Model is " +c.getModel());
		 System.out.println("Price is "+c.getPrice());
		 
	}

}
