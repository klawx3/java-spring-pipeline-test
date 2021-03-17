package cl.klawx3.jiratestproyect01.service.impl;

import cl.klawx3.jiratestproyect01.model.Point;
import cl.klawx3.jiratestproyect01.service.MainService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MainServiceImpl implements MainService {

    @Override
    public List<Point> getListOfPoints(int quantity) {
        return Arrays.asList(
                new Point(4,-4,"asd"),
                new Point(2,1,"f1243sdg"),
                new Point(5,6,"sadf"),
                new Point(8,3,"942yerhng")
        ).stream().limit(quantity).collect(Collectors.toList());
    }
}
