package com.vitaly.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class BeanFilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue filter() {
        SimpleBean bean = new SimpleBean("val1","val2","val3");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(bean);

        applyFilters(mappingJacksonValue, "field2");

        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue filterList() {
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(Arrays.asList(new SimpleBean("val1","val2","val3"),
                new SimpleBean("val1","val2","val3"),
                new SimpleBean("val1","val2","val3")));

        applyFilters(mappingJacksonValue, "field1", "field3");

        return mappingJacksonValue;
    }

    public static void applyFilters(MappingJacksonValue mappingJacksonValue, String... fields) {
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(fields);
        SimpleFilterProvider filterProvider = new SimpleFilterProvider().addFilter("SimpleFilter", filter);
        mappingJacksonValue.setFilters(filterProvider);
    }

}
