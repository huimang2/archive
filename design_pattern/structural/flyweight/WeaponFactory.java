package design_pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WeaponFactory {

    public enum WeaponList { FIST, KNIFE, SORD, SPEAR }
    
    private static final Map<WeaponList, Weapon> weaponMap = new HashMap<>();

    private WeaponFactory() {}

    private static class SingletonHolder {
        private static final WeaponFactory INSTANCE = new WeaponFactory();
    }

    public static WeaponFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Weapon getWeapon(WeaponList weapon) {
        
        if(weaponMap.containsKey(weapon)) return weaponMap.get(weapon);
        
        switch(weapon) {
            case FIST: WeaponFactory.weaponMap.put(WeaponList.FIST, new Fist()); break;
            case KNIFE: WeaponFactory.weaponMap.put(WeaponList.KNIFE, new Knife()); break;
            case SORD: WeaponFactory.weaponMap.put(WeaponList.SORD, new Sord()); break;
            case SPEAR: WeaponFactory.weaponMap.put(WeaponList.SPEAR, new Spear()); break;
            default: return null;
        }

        return weaponMap.get(weapon);
    }
}
