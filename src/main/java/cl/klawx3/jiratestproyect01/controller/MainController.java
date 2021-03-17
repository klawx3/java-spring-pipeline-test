package cl.klawx3.jiratestproyect01.controller;

import cl.klawx3.jiratestproyect01.model.Point;
import cl.klawx3.jiratestproyect01.service.MainService;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    @Value("${controller.main.MAX_VALUE}")
    Integer maxValue;

    @Autowired
    MainService mainService;

    @GetMapping("/{n}")
    public List<Point> getAllPoints(@PathVariable Optional<Integer> n){
        if(n.isPresent())
            return mainService.getListOfPoints(n.get());
        return mainService.getListOfPoints(maxValue);
    }

}
