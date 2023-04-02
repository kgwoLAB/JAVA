public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;
    
    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        ceilingFan.high();
        prevSpeed = ceilingFan.getSpeed();
    }
    public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == 0) {
			ceilingFan.off();
		}
	} 
}
