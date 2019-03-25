package com.pluralsight.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public java.util.List<com.boot.model.Shipwreck> list(){
        return com.boot.controller.ShipwreckStub.list();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public com.boot.model.Shipwreck create(@PathVariable com.boot.model.Shipwreck shipwreck){
        return com.boot.controller.ShipwreckStub.create(shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public com.boot.model.Shipwreck get(@PathVariable long id){
        return com.boot.controller.ShipwreckStub.get(id);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public com.boot.model.Shipwreck update(@PathVariable long id, @RequestBody com.boot.model.Shipwreck shipwreck){
        return com.boot.controller.ShipwreckStub.update(id, shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public com.boot.model.Shipwreck delete(@PathVariable long id){
        return com.boot.controller.ShipwreckStub.delete(id);
    }

}
