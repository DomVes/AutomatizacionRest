package models;

import java.util.Locale;
import com.github.javafaker.Faker;

public class DataInyection {
    Faker faker= new  Faker (new Locale("en-US"));
    private String url, headers, bodyUser, bodyOrden;
    private final int RESPONSECODE;
    public DataInyection(){
        this.url = "https://petstore.swagger.io/v2/user";
        this.headers = "application/json";
        this.bodyUser = "{\n" +
                "  \"id\": 0,\n" +
                "  \"username\": \"Juan\",\n" +
                "  \"firstName\": \"Esteban\",\n" +
                "  \"lastName\": \"Castillo\",\n" +
                "  \"email\": \"rest@pruebas.com\",\n" +
                "  \"password\": \"Abc1234%\",\n" +
                "  \"phone\": \"3004421236\",\n" +
                "  \"userStatus\": 0\n" +
                "}";
        this.bodyOrden= "{\n" +
                "  \"id\": 0,\n" +
                "  \"petId\": 36,\n" +
                "  \"quantity\": 1,\n" +
                "  \"shipDate\": \"2022-08-23T19:30:01.318Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}";
        this.RESPONSECODE = 200;
    }

    //getters
    public String getUrl() {
        return url;
    }
    public String getHeaders() {
        return headers;
    }
    public String getBodyUser() {
        return bodyUser;
    }
    public String getBodyOrden() {
        return bodyOrden;
    }
    public int getRESPONSECODE() {
        return RESPONSECODE;
    }
}