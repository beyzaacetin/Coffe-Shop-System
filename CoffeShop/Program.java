package OopIntro_1.Odev4_2CoffeShop;

import OopIntro_1.Odev4_2CoffeShop.Abstract.BaseCustomerManager;
import OopIntro_1.Odev4_2CoffeShop.Concrete.StarbucksCustomerManager;
import OopIntro_1.Odev4_2CoffeShop.Entities.Customer;

public class Program {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new BaseCustomerManager();
        customerManager.save(new Customer(14,"Beyza","Çetin","02/03/2001","Turkey"));
        System.out.println();




    }
}
