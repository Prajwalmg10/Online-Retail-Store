package com.example.retailStore.Util;

import com.example.retailStore.Models.Customer;
import com.example.retailStore.Models.CustomerAddress;
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

    public static void validateAddress(CustomerAddress address,String type) throws DataException{
        if(NullEmptyUtils.isEmpty(address.getDoorNo())){
            throw new DataException(StringConstants.EXCEPTION,StringConstants.DOORNO_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isEmpty(address.getCity())){
            throw new DataException(StringConstants.EXCEPTION,StringConstants.CITY_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isEmpty(address.getLayout())){
            throw new DataException(StringConstants.EXCEPTION,StringConstants.LAYOUT_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isEmpty(address.getPincode())){
            throw new DataException(StringConstants.EXCEPTION,StringConstants.PINCODE_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isEmpty(address.getStreetName())){
            throw new DataException(StringConstants.EXCEPTION,StringConstants.STREETNAME_REQUIRED, HttpStatus.BAD_REQUEST);
        }
    }
}
