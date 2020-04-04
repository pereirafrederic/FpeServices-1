package fr.pereirafrederic.fpeservices;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/service1")
@FeignClient("service1-service1")
public class ServiceController {

    @GetMapping("/")
    public String getDedault(){
        return "Service 1";
    }
}