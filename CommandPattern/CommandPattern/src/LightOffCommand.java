public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void excute(){
        light.off();
    }

    public void undo(){
        light.on();
    }

}
