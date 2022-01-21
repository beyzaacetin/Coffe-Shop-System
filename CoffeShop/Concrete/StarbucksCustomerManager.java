package OopIntro_1.Odev4_2CoffeShop.Concrete;

import OopIntro_1.Odev4_2CoffeShop.Abstract.BaseCustomerManager;
import OopIntro_1.Odev4_2CoffeShop.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    public void save(Customer customer) throws Exception {
        if(CheckIfRealPerson(customer)){
            super.save(customer);
        }
        else {
            throw new Exception("Not a valid person");
        }

    }

    private boolean CheckIfRealPerson(Customer customer) {
        throw new RuntimeException();
    }


}
