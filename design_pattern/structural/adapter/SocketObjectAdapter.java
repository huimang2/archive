package design_pattern.structural.adapter;

public class SocketObjectAdapter implements SocketAdapter {
    
    private Socket socket = new Socket();

    @Override
    public Volt get220Volt() {
        return socket.getVolt();
    }
    
    @Override
    public Volt get110Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 2);
    }

    private Volt convertVolt(Volt volt, int i){
        return new Volt(volt.getVolt()/i);
    }
}
