package iit.du.ac.bd;

public class CarFacade implements ICar{
	private AddBody add_body;
	private AddEngine add_engine;
	private AddSeat add_seat;
	private AddWheel add_wheel;
	private AddColor add_color;
	
	public CarFacade(){
		add_body = new AddBody();
		add_engine = new AddEngine();
		add_seat = new AddSeat();
		add_wheel = new AddWheel();
		add_color = new AddColor();
	}

	@Override
	public void buildCar() {
		// TODO Auto-generated method stub
		System.out.println("Started making a new car....");
		add_body.body();
		add_engine.engine();
		add_seat.seat();
		add_wheel.wheel();
		add_color.color();
		System.out.println("The work is done !!!");
	}

}
