package design_pattern.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        
        WeaponFactory weafonFactory = WeaponFactory.getInstance();

        Weapon knife1 = weafonFactory.getWeapon(WeaponFactory.WeaponList.KNIFE);
        Weapon knife2 = weafonFactory.getWeapon(WeaponFactory.WeaponList.KNIFE);

        if(knife1 == knife2) {
            System.out.println("동일한 인스턴스를 공유하고 있습니다.");
        } else {
            System.out.println("인스턴스가 다릅니다.");
        }
    }
}
