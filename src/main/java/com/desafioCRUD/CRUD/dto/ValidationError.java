package com.desafioCRUD.CRUD.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends  CustomError{
    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    private List<FieldMessage> erros = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path, List<FieldMessage> erros) {
        super(timestamp, status, error, path);
        this.erros = erros;
    }

    public List<FieldMessage> getErros() {
        return erros;
    }

    public void  addError(String fieldName, String message){
        erros.add(new FieldMessage(fieldName, message));
    }
}
