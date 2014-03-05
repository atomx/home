package javaP.innerclass.controller;

public class GreenHourseController extends Controller {
	
	private boolean light = false;
	public class LightOn extends Event{
		public LightOn(long time){super(time);}
		public void action(){
			light=true;
		}
		
		public String toString(){
			return "Light on";
		}
	}
	
	public class LightOff extends Event{
		public LightOff(long time){super(time);}
		public void action(){
			light=false;
		}
		
		public String toString(){
			return "Light off";
		}
	}
	
	public class Restart extends Event{
		private Event[] eventList;
		public Restart(long time,Event[] eventList){
			super(time);
			this.eventList=eventList;
			for(Event e: eventList){
				addEvent(e);
			}
		}
		@Override
		public void action() {
			for(Event e: eventList){
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		
		public String toString(){
			return "restart";
		}
		
	}
	
	
	public class Bell extends Event{
		private long time;
		public Bell(long time){super(time);this.time=time;}
		
		public void action(){
			addEvent(new Bell(time));
		}
		public String toString(){
			return "Binggggg";
		}
		
	}
	public static void main(String[] args) {
		GreenHourseController gc = new GreenHourseController();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new LightOn(200),
				gc.new LightOff(400)
		};
		gc.addEvent(gc.new Restart(2000,eventList));
		gc.run();

	}

}
