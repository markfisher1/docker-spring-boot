package com.devops.coach;
  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
@Controller
public class StartApplication {

    private static final Map<String,String> modelMap;
    static{
        modelMap=new HashMap<String, String>();
        modelMap.put("title", "Howdy Folks from Coach AK Training..!!!! ");
        modelMap.put("msg", "Hello All..We are deploying springboot application into EKS cluster using Helm + Jenkins Pipeline!!!!");
    }
    
    @GetMapping("/")
    public String index(final Model model) {
        model.addAllAttributes(modelMap);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
