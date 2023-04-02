public class RemoteControl {
    Command[] onCommands; // 7개의 ON, OFF명령을 처리할 수 있음.
    Command[] offCommands;
    Command undoCommand;

    // null 값 대입해줌.
    public class NoCommand implements Command{
        public void excute(){}
        public void undo(){}
    }

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i =0; i<7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        // 메소드 로딩 현황을 파악하려면 if(onCommands[slot] !=null) 을 구현하면됨.
        onCommands[slot].excute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].excute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ 리모컨 ------\n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[slot "+i+"]" + onCommands[i].getClass().getName()
            + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    
    }





}
