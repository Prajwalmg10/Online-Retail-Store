package com.example.retailStore.Controllers;
import com.example.retailStore.Models.Customer;
import com.example.retailStore.Services.CustomerServices;
import com.example.retailStore.uiResponse.DataException;
import com.example.retailStore.uiResponse.UIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/customer")
public class CustomerController extends AbstarctController {

    @Autowired
    private CustomerServices customerServices;

    @PostMapping("/save")
    public ResponseEntity<?> saveCustomer(Customer customer){
        try {
             return  buildResponse(customerServices.saveCustomer(customer));
        }catch (DataException e){
             return  buildError(e);
        }
    }
}
