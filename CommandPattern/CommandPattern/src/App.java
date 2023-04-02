public class App {
    // RemoteControlTest
    public static void main(String[] args) throws Exception {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light KitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(KitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(KitchenLight);

        //GarageDoorOpenCommand garageDoorup = new GarageDoorOpenCommand(garageDoor);
        //StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        //remoteControl.setCommand(2, garageDoorup, stereoOn);


        // 람다 표현방식 // 
        //GarageDoor garageDoor2 = new GarageDoor();
        //remoteControl.setCommand(2, () ->{garageDoor.up()}, ()->stereo.setCD());

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);    
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}
