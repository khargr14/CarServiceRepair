package util;

import enums.CustomerServiceRating;
import enums.UserPaymentMethod;

public class UserRating {
    public static CustomerServiceRating UserRatingcCustomerService() {

        CustomerServiceRating myCustomerServiceRating = CustomerServiceRating.GOOD;
        return myCustomerServiceRating;
    }

    public static UserPaymentMethod UserCustomerService() {

        UserPaymentMethod  myCustomerServiceRating = UserPaymentMethod.CREDIT;
        return myCustomerServiceRating;
    }

}
