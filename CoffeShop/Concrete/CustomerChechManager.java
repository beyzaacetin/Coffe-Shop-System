package OopIntro_1.Odev4_2CoffeShop.Concrete;

import OopIntro_1.Odev4_2CoffeShop.Abstract.ICustomerCheckService;
import OopIntro_1.Odev4_2CoffeShop.Abstract.ICustomerService;
import OopIntro_1.Odev4_2CoffeShop.Entities.Customer;
import jdk.jshell.spi.ExecutionControl;

public class CustomerChechManager implements ICustomerCheckService {
    public boolean checkIfRealPerson(Customer customer){
        return true;


    }


}
