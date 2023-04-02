public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void excute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo(){
        //stereo.off();
    }
}
