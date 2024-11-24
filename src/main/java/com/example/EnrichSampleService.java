package com.example;

import com.example.model.ObjectPayload;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EnrichSampleService {
    public static List<ObjectPayload> enrichRequestJson(final List<ObjectPayload> objectpayload){
        objectpayload.get(0).setName(objectpayload.get(0).getName() + "modified Data");
        if(!CollectionUtils.isEmpty(objectpayload.get(0).getData())){
            List<String> collect = objectpayload.get(0).getData().stream().map(
                    s -> s.getHardDiskSize() + "modified"
            ).collect(Collectors.toList());
        }
        return objectpayload;
    }

}
