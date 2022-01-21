package OopIntro_1.Odev4_2CoffeShop.Abstract;

import OopIntro_1.Odev4_2CoffeShop.Entities.Customer;

public interface ICustomerCheckService {
    static void CheckIfRealPerson(Customer customer) throws Exception {
        throw new Exception();
    }
}
