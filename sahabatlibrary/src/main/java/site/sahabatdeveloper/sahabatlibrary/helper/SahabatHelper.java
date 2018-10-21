package site.sahabatdeveloper.sahabatlibrary.helper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class SahabatHelper<T> {
    public T convertJsonToModel(String response) {
        Gson gson = new Gson();
        Type type = new TypeToken<T>() {
        }.getType();
        T obj = gson.fromJson(response, type);
        if (obj != null) {
            return obj;
        } else return null;
    }

    public String convertModelToJson(T response) {
        Gson gson = new Gson();
        return gson.toJson(response);
    }
}
