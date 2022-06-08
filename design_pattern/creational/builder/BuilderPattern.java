package design_pattern.creational.builder;

public class BuilderPattern {
    public static void main(String []args) {
        Rect rect = new Rect.Builder(200, 100)
                            .margin(5)
                            .padding(10)
                            .build();
        System.out.println(rect.toString());
    }
}
