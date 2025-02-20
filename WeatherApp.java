package com.codtech.weather;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherApp {
    private static final String API_KEY = "YOUR_API_KEY"; // Replace with your OpenWeather API key
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";

    public static void main(String[] args) {
        String city = "London"; // Replace with any city
        String url = BASE_URL + "?q=" + city + "&appid=" + API_KEY;

        try {
            // Make an HTTP request to the OpenWeather API
            CloseableHttpClient client = HttpClients.createDefault();
            HttpGet request = new HttpGet(url);
            HttpResponse response = client.execute(request);

            // Parse the response to JSON
            String jsonResponse = EntityUtils.toString(response.getEntity());
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(jsonResponse);

            // Extract the weather information
            String cityName = rootNode.get("name").asText();
            JsonNode weatherNode = rootNode.get("weather").get(0);
            String weatherDescription = weatherNode.get("description").asText();
            JsonNode mainNode = rootNode.get("main");
            double temperature = mainNode.get("temp").asDouble() - 273.15; // Convert from Kelvin to Celsius

            // Print the weather information
            System.out.println("Weather data for: " + cityName);
            System.out.println("Description: " + weatherDescription);
            System.out.println("Temperature: " + String.format("%.2f", temperature) + " °C");

            // Close the HTTP client
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
