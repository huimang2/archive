package design_pattern.behavioral.command;

public class Client {
    
    public static void main(String[] args) {
        
        Light livingRoomLight = new Light("거실");
        Light restRoomLight = new Light("화장실");

        TurnOnLightCommand turnOnLivingRommLightCommand = new TurnOnLightCommand(livingRoomLight);
        TurnOffLightCommand turnOffLivingRoomLightCommand = new TurnOffLightCommand(livingRoomLight);

        TurnOnLightCommand turnOnRestRoomLightCommand = new TurnOnLightCommand(restRoomLight);
        TurnOffLightCommand turnOffRestRoomLightCommand = new TurnOffLightCommand(restRoomLight);
        
        LightInvoker livingRoomLightInvoker = new LightInvoker(turnOnLivingRommLightCommand, turnOffLivingRoomLightCommand);
        LightInvoker restRoomLightInvoker = new LightInvoker(turnOnRestRoomLightCommand, turnOffRestRoomLightCommand);

        livingRoomLightInvoker.turnOn();
        livingRoomLightInvoker.turnOff();

        restRoomLightInvoker.turnOn();
        restRoomLightInvoker.turnOff();
        
    }
}
