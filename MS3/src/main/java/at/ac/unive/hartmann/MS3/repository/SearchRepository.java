package at.ac.unive.hartmann.MS3.repository;

import at.ac.unive.hartmann.MS3.model.Advertisement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository extends CrudRepository<Advertisement, String> {

       public List<Advertisement> findAdvertisementByAdItemName(String adItemName);
}
