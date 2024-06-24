package com.example.retailStore.Controllers;
import com.example.retailStore.Models.Customer;
import com.example.retailStore.Services.CustomerServices;
import com.example.retailStore.uiResponse.DataException;
import com.example.retailStore.uiResponse.UIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/customer")
public class CustomerController extends AbstarctController {

    @Autowired
    private CustomerServices customerServices;

    @PostMapping("/save")
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer){
        try {
             return  buildResponse(customerServices.saveCustomer(customer));
        }catch (DataException e){
             return  buildError(e);
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateCustomer(@RequestBody Customer customer){
        try {
            return  buildResponse(customerServices.updateCustomer(customer));
        }catch (DataException e){
            return  buildError(e);
        }
    }

    @PostMapping("/get")
    public ResponseEntity<?> getCustomer(@RequestParam int customer){
        try {
            return  buildResponse(customerServices.getCustomer(customer));
        }catch (DataException e){
            return  buildError(e);
        }
    }

    @PostMapping("/delete")
    public ResponseEntity<?> deleteCustomer(@RequestParam int customerId){
        try {
            return  buildResponse(customerServices.deleteCustomer(customerId));
        }catch (DataException e){
            return  buildError(e);
        }
    }
}
