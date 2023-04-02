public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){}
    
    // 슬롯을 가지고 제어할 명령을 설정하는 메소드, 해당 메소드로 기능을 언제든 바꿀수 있음.
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.excute();
    }
}
