package design_pattern.structural.adapter;

public class AdapterPattern {
    public static void main(String[] args) {

        SocketAdapter socketAdapter = new SocketObjectAdapter();

        Volt volt220 = socketAdapter.get220Volt();
        Volt volt110 = socketAdapter.get110Volt();

        System.out.println("220V 어댑터 사용 : " + volt220.getVolt() + "V");
        System.out.println("110V 어댑터 사용 : " + volt110.getVolt() + "V");
    }
}
