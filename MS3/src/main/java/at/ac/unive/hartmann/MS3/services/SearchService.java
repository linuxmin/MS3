package at.ac.unive.hartmann.MS3.services;

import at.ac.unive.hartmann.MS3.config.ServiceConfig;
import at.ac.unive.hartmann.MS3.model.Advertisement;
import at.ac.unive.hartmann.MS3.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private SearchRepository searchRepository;

    @Autowired
    ServiceConfig config;

    public Advertisement getAdvertisment(String adItemId){
        Advertisement advertisement = new Advertisement();
        advertisement.setAdItemId(adItemId);
        advertisement.setAdItemName("TestItem");
        advertisement.setAdItemPrice(0.0);
        return advertisement;
    }

    public List<Advertisement> getAdvertisementByName(String adItemName){
        return searchRepository.findAdvertisementByAdItemName(adItemName);
    }

    public void saveAdvertisement(String adName){
        Advertisement advertisement = new Advertisement();
        advertisement.setAdItemId("1");
        advertisement.setAdItemName(adName);
        searchRepository.save(advertisement);
    }


}
