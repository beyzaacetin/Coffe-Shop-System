package OopIntro_1.Odev4_2CoffeShop.Abstract;

import OopIntro_1.Odev4_2CoffeShop.Entities.Customer;

public class BaseCustomerManager implements ICustomerService{
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Saved to database : " + customer.getFirstName());
    }
}
