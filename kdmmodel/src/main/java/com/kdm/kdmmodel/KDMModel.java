package com.kdm.kdmmodel;

import com.google.gson.Gson;

public class KDMModel<T> {

    public T convertJson(String json, Class<T> clazz) {
        Gson gson = new Gson();
        T model = gson.fromJson(json, clazz);
        return model;
    }
}
