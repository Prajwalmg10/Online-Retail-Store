package com.example.retailStore.Util;

import com.example.retailStore.Models.Customer;
import com.example.retailStore.Models.CustomerAddress;
import com.example.retailStore.Models.Product;
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
                for(CustomerAddress address: customer.getShippingAddress()){
                    validateAddress(address,"Shipping");
                }
                for(CustomerAddress address: customer.getBillingAddress()) {
                    validateAddress(address, "Billing");
                }
    }

    public static void validateAddress(CustomerAddress address,String type) throws DataException{
        if(NullEmptyUtils.isEmpty(address.getDoorNo())){
            throw new DataException(StringConstants.EXCEPTION,type+StringConstants.DOORNO_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isEmpty(address.getCity())){
            throw new DataException(StringConstants.EXCEPTION,type+StringConstants.CITY_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isEmpty(address.getLayout())){
            throw new DataException(StringConstants.EXCEPTION,type+StringConstants.LAYOUT_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isEmpty(address.getPincode())){
            throw new DataException(StringConstants.EXCEPTION,type+StringConstants.PINCODE_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isEmpty(address.getStreetName())){
            throw new DataException(StringConstants.EXCEPTION,type+StringConstants.STREETNAME_REQUIRED, HttpStatus.BAD_REQUEST);
        }
    }

    public static void validateProduct(Product product) throws DataException {
        if(NullEmptyUtils.isEmpty(product.getProductName())){
            throw new DataException(StringConstants.EXCEPTION,StringConstants.PRODUCT_NAME_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isEmpty(product.getDescription())){
            throw new DataException(StringConstants.EXCEPTION,StringConstants.PRODUCT_DESCRIPTION_REQUIRED, HttpStatus.BAD_REQUEST);
        }
        if(NullEmptyUtils.isNullorEmpty(product.getProductPrice())){
            throw new DataException(StringConstants.EXCEPTION,StringConstants.PRODUCT_PRICE_REQUIRED, HttpStatus.BAD_REQUEST);
        }
    }
}
