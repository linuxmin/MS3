package at.ac.unive.hartmann.MS3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
  //  @Value("${example.property}")
    private String exampleProperty;

    public String getExampleProperty(){
        return exampleProperty;
    }

}
