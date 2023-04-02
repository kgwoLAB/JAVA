public class GarageDoorOpenCommand implements Command {
    
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void excute(){
        garageDoor.up();
    }

    public void undo(){
        garageDoor.down();
    }


}
