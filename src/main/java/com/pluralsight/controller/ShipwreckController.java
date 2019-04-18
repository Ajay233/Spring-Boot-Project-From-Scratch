package com.pluralsight.controller;

import com.pluralsight.model.Shipwreck;
import com.pluralsight.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    //Create a shipwreck repository
    @Autowired
    private ShipwreckRepository shipwreckRepository;



    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public java.util.List<com.pluralsight.model.Shipwreck> list(){
        // ** The return statement below was a stub **
        // return com.pluralsight.controller.ShipwreckStub.list();
        return shipwreckRepository.findAll();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public com.pluralsight.model.Shipwreck create(@PathVariable com.pluralsight.model.Shipwreck shipwreck){
        // return com.pluralsight.controller.ShipwreckStub.create(shipwreck);
        return shipwreckRepository.saveAndFlush(shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public com.pluralsight.model.Shipwreck get(@PathVariable long id){
        // return com.pluralsight.controller.ShipwreckStub.get(id);
        return shipwreckRepository.findOne(id);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public com.pluralsight.model.Shipwreck update(@PathVariable long id, @RequestBody com.pluralsight.model.Shipwreck shipwreck){
        // return com.pluralsight.controller.ShipwreckStub.update(id, shipwreck);
        Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
        BeanUtils.copyProperties(shipwreck, existingShipwreck);
        return shipwreckRepository.saveAndFlush(existingShipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public com.pluralsight.model.Shipwreck delete(@PathVariable long id){
        // return com.pluralsight.controller.ShipwreckStub.delete(id);
        Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
        shipwreckRepository.delete(existingShipwreck);
        return existingShipwreck;
        // Could also be done by shipwreckRepository.delete(id);
    }

}
