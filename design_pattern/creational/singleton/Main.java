package design_pattern.creational.singleton;

public class Main {
    
    public static void main(String[] args) {
        
        Donation donationInstance = Donation.getInstance();

        Person person1 = new Person("마석도");
        Person person2 = new Person("강해상");
        Person person3 = new Person("장이수");

        person1.donation(100);
        person2.donation(20);
        person3.donation(60);

        System.out.println("총 기부액 : " + donationInstance.getTotal());
        System.out.println("기부자 명단 : " + donationInstance.getContributors());
    } 
}
