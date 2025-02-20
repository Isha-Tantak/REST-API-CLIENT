# REST-API-CLIENT
*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: ISHA TANTAK

*INTERN ID*:CODHC109

*DOMAIN*:JAVA DEVELOPEMENT

*DURATION*:4 WEEKS

*MENTOR*:NEELA SANTOSH
# WeatherApp

WeatherApp is a Java application that consumes weather data from the OpenWeather API and displays the current weather information for a given city in a structured format.

## Features

- Fetches weather data from the [OpenWeather API](https://openweathermap.org/).
- Displays city name, weather description, and temperature in Celsius.
- Converts temperature from Kelvin (default in the API) to Celsius.
- Easy to extend for more weather details.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Maven to manage project dependencies.

## Setup Instructions

1. **Clone this repository** to your local machine:

    ```bash
    git clone https://github.com/your-username/WeatherApp.git
    ```

2. **Navigate to the project directory**:

    ```bash
    cd WeatherApp
    ```

3. **Install dependencies** using Maven:

    ```bash
    mvn install
    ```

4. **Get an API key from OpenWeather**:
   - Go to [OpenWeather](https://openweathermap.org/), sign up, and generate your API key.

5. **Configure the API key**:
   - Open the `WeatherApp.java` file located in `src/main/java/com/codtech/weather/WeatherApp.java`.
   - Replace the placeholder `YOUR_API_KEY` with the API key you obtained from OpenWeather.

   ```java
   private static final String API_KEY = "YOUR_API_KEY"; // Replace with your OpenWeather API key
Run the application:

Use Maven to run the application:
mvn exec:java -Dexec.mainClass="com.codtech.weather.WeatherApp"
7)Output:

The program will display the weather data for a default city (currently set to "London").
You can change the city variable in WeatherApp.java to get the weather for a different city.
OUTPUT:
![Image](https://github.com/user-attachments/assets/3df519f9-f428-4aa0-a62c-6c7f51897e03)
