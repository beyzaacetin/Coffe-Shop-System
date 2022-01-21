package OopIntro_1.Odev4_2CoffeShop.Abstract;

import OopIntro_1.Odev4_2CoffeShop.Entities.Customer;

public interface ICustomerService {
    void save(Customer customer) throws Exception;
}
