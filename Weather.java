package Lesson_6;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Weather {
    public static void main(String[] args) throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://community-open-weather-map.p.rapidapi.com/weather?q=Kurgan&lon=0&callback=test&id=2172797&lang=en&units=imperial"))
                .header("X-RapidAPI-Key", "1cb3e039ddmsh99151aab8b58dfcp1b8b11jsn9d4ea3a85ad2")
                .header("X-RapidAPI-Host", "community-open-weather-map.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}