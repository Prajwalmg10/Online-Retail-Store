package com.example.retailStore.Services.Implementation;

import com.example.retailStore.Models.Inventory;
import com.example.retailStore.Services.InventoryServices;
import com.example.retailStore.uiResponse.DataException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InventoryServiceImpl implements InventoryServices {
    @Override
    public Inventory addToInventory(Inventory inventory) throws DataException {
        return null;
    }

    @Override
    public Inventory searchInventory(int inventoryId) throws DataException {
        return null;
    }

    @Override
    public String deleteInventory(int Inventory) throws DataException {
        return "";
    }

    @Override
    public Inventory updateInventory(Inventory inventory) throws DataException {
        return null;
    }
}
