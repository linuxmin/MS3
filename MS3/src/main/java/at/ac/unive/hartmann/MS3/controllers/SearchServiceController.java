package at.ac.unive.hartmann.MS3.controllers;


import at.ac.unive.hartmann.MS3.config.ServiceConfig;
import at.ac.unive.hartmann.MS3.model.Advertisement;
import at.ac.unive.hartmann.MS3.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController      //Spring Controller class, exposing http endpoints (e.g. for GET,POST...)
@RequestMapping(value = "ms3/")   //root uri for controller
public class SearchServiceController {
    @Autowired
    private SearchService searchService;

    @Autowired
    private ServiceConfig config;

    @RequestMapping(value="/{ad_item_id}", method = RequestMethod.GET)
    public Advertisement getAdvertisment (@PathVariable("ad_item_id") String ad_item_id){
        searchService.saveAdvertisement(ad_item_id);
        return searchService.getAdvertisment(ad_item_id);
    }
}
