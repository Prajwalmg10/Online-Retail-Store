package com.example.retailStore.Util;

import com.example.retailStore.Models.Customer;
import com.example.retailStore.uiResponse.DataException;
import org.springframework.http.HttpStatus;

public class ValidationHelper {
    public static void validateCustomerBean(Customer customer) throws DataException {
        if(NullEmptyUtils.isEmpty(customer.getCustomerName())){
            throw new DataException(StringConstants.EXCEPTION,StringConstants.CUSTOMER_NAME_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isEmpty(customer.getCustomerEmail())){
            throw new DataException(StringConstants.EXCEPTION,StringConstants.CUSTOMER_EMAIL_REQUIRED, HttpStatus.BAD_REQUEST);
        }

    }
}
