package com.example.model;

import com.example.EnrichSampleService;
import com.example.TextContext;
import com.example.client;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class ObjectMapping {

    @Autowired
    private static EnrichSampleService enrich;

    public static void main(String[] args) throws IOException {
        File jsonFile = new File("src/main/java/com/example/model/data.json");
        ObjectMapper ob = new ObjectMapper();
        List<ObjectPayload> objectPayload = ob.readValue(jsonFile,new TypeReference<List<ObjectPayload>>() {});
        List<ObjectPayload> objectPayload1 = enrich.enrichRequestJson(objectPayload);

        objectPayload1.stream()
                .filter(date-> date.getData().stream().filter(g->g.getPrice()>2018).isParallel());

        objectPayload1.stream().forEach(s-> System.out.println(s));
        TextContext textContext = new TextContext();
        textContext.setObjectPayload(objectPayload1);

        client c = new client();

        ResponseEntity<JsonNode> jsonNodeResponseEntity = c.restClient().get()
                .uri("/objects")
                .retrieve()
                .toEntity(JsonNode.class);
        textContext.setResponseEntity(jsonNodeResponseEntity);

        //verify response
            String statusCode = textContext.getResponseEntity().getStatusCode().toString();
            if(statusCode.equals("200 OK")){
                System.out.println("Success response");

            String s = Objects.requireNonNull(textContext.getResponseEntity().getBody()).toString();
            System.out.println(s);
        }


    }
}
