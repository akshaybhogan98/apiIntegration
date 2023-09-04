# APIIntegration

## Requirements

For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [Gradle](https://https://gradle.org/)

## Running the application locally

# Clone the repository
git clone https://github.com/yourusername/your-repo.git

Open the cloned project in any IDE

# Build the project using Gradle
./gradlew build

If the above command doesn't work then in Intellij follow the below steps as shown in the image below:
- Press on the Gradle Tab
- Click Execute Gradle Task button(A new tab will appear)
- Type build after gradle in the new tab and press enter
- After build is successful,again click on Execute Gradle Task Button and type bootRun and press Enter
- Now your service will start working

<img width="1440" alt="Screenshot 2023-09-04 at 2 53 18 PM" src="https://github.com/akshaybhogan98/apiIntegration/assets/59681162/d93626f0-4438-4a23-92c7-857a812b1157">

# Accessing the API
Once the service starts the API's can be accessed using the below url's

- API 1: Get the Weather forecast summary of Any city using API url  :-http://localhost:8090/v1/forecastSummary/location/locationName .Here locationName can be any specific location Mumbai,Berlin etc

-API 2: Get hourly Weather forecast details of Any city using API url :--http://localhost:8090/v1/hourlyForecastSummary/location/locationName.Here locationName can be any specific location Mumbai,Berlin etc


## API Credentials
- RapidApi provides subscription to there API's.In the code I have added one API Key and API host of a demo account in the application.yml file.The daily limit for the API's access is 10.
- Parameters like API Key ,API host ,header key (client-id ,client-secret) for authentication as mentioned in the task is kept configurable and can be accessed in application.yml
- The Rapid API URL is also accessible in application.yml
- POJO's(models) required to map the API response from Rapid API are generated using swagger(yaml file :- response.yaml)
