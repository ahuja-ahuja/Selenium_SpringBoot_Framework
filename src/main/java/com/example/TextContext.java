package com.example;

import com.example.model.ObjectPayload;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TextContext {
    public ResponseEntity<JsonNode> getResponseEntity() {
        return responseEntity;
    }

    public List<ObjectPayload> getObjectPayload() {
        return objectPayload;
    }

    public void setResponseEntity(ResponseEntity<JsonNode> responseEntity) {
        this.responseEntity = responseEntity;
    }

    public void setObjectPayload( List<ObjectPayload> objectPayload) {
        this.objectPayload = objectPayload;
    }

    private ResponseEntity<JsonNode> responseEntity;
    private List<ObjectPayload> objectPayload;
}
