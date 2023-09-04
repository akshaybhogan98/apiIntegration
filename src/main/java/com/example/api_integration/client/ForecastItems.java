package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * ForecastItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class ForecastItems   {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("period")
  private Integer period = null;

  @JsonProperty("freshSnow")
  private Integer freshSnow = null;

  @JsonProperty("weather")
  private ForecastWeather weather = null;

  @JsonProperty("sunHours")
  private String sunHours = null;

  @JsonProperty("rainHours")
  private String rainHours = null;

  @JsonProperty("prec")
  private ForecastPrec prec = null;

  @JsonProperty("temperature")
  private ForecastTemperature temperature = null;

  @JsonProperty("pressure")
  private Integer pressure = null;

  @JsonProperty("relativeHumidity")
  private Integer relativeHumidity = null;

  @JsonProperty("clouds")
  private ForecastClouds clouds = null;

  @JsonProperty("wind")
  private ForecastWind wind = null;

  @JsonProperty("windchill")
  private ForecastWindchill windchill = null;

  @JsonProperty("snowLine")
  private ForecastSnowLine snowLine = null;

  @JsonProperty("isNight")
  private Boolean isNight = null;

  public ForecastItems date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(description = "")
  
    @Valid
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ForecastItems period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
   **/
  @Schema(description = "")
  
    public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public ForecastItems freshSnow(Integer freshSnow) {
    this.freshSnow = freshSnow;
    return this;
  }

  /**
   * Get freshSnow
   * @return freshSnow
   **/
  @Schema(description = "")
  
    public Integer getFreshSnow() {
    return freshSnow;
  }

  public void setFreshSnow(Integer freshSnow) {
    this.freshSnow = freshSnow;
  }

  public ForecastItems weather(ForecastWeather weather) {
    this.weather = weather;
    return this;
  }

  /**
   * Get weather
   * @return weather
   **/
  @Schema(description = "")
  
    @Valid
    public ForecastWeather getWeather() {
    return weather;
  }

  public void setWeather(ForecastWeather weather) {
    this.weather = weather;
  }

  public ForecastItems sunHours(String sunHours) {
    this.sunHours = sunHours;
    return this;
  }

  /**
   * Get sunHours
   * @return sunHours
   **/
  @Schema(description = "")
  
    public String getSunHours() {
    return sunHours;
  }

  public void setSunHours(String sunHours) {
    this.sunHours = sunHours;
  }

  public ForecastItems rainHours(String rainHours) {
    this.rainHours = rainHours;
    return this;
  }

  /**
   * Get rainHours
   * @return rainHours
   **/
  @Schema(description = "")
  
    public String getRainHours() {
    return rainHours;
  }

  public void setRainHours(String rainHours) {
    this.rainHours = rainHours;
  }

  public ForecastItems prec(ForecastPrec prec) {
    this.prec = prec;
    return this;
  }

  /**
   * Get prec
   * @return prec
   **/
  @Schema(description = "")
  
    @Valid
    public ForecastPrec getPrec() {
    return prec;
  }

  public void setPrec(ForecastPrec prec) {
    this.prec = prec;
  }

  public ForecastItems temperature(ForecastTemperature temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Get temperature
   * @return temperature
   **/
  @Schema(description = "")
  
    @Valid
    public ForecastTemperature getTemperature() {
    return temperature;
  }

  public void setTemperature(ForecastTemperature temperature) {
    this.temperature = temperature;
  }

  public ForecastItems pressure(Integer pressure) {
    this.pressure = pressure;
    return this;
  }

  /**
   * Get pressure
   * @return pressure
   **/
  @Schema(description = "")
  
    public Integer getPressure() {
    return pressure;
  }

  public void setPressure(Integer pressure) {
    this.pressure = pressure;
  }

  public ForecastItems relativeHumidity(Integer relativeHumidity) {
    this.relativeHumidity = relativeHumidity;
    return this;
  }

  /**
   * Get relativeHumidity
   * @return relativeHumidity
   **/
  @Schema(description = "")
  
    public Integer getRelativeHumidity() {
    return relativeHumidity;
  }

  public void setRelativeHumidity(Integer relativeHumidity) {
    this.relativeHumidity = relativeHumidity;
  }

  public ForecastItems clouds(ForecastClouds clouds) {
    this.clouds = clouds;
    return this;
  }

  /**
   * Get clouds
   * @return clouds
   **/
  @Schema(description = "")
  
    @Valid
    public ForecastClouds getClouds() {
    return clouds;
  }

  public void setClouds(ForecastClouds clouds) {
    this.clouds = clouds;
  }

  public ForecastItems wind(ForecastWind wind) {
    this.wind = wind;
    return this;
  }

  /**
   * Get wind
   * @return wind
   **/
  @Schema(description = "")
  
    @Valid
    public ForecastWind getWind() {
    return wind;
  }

  public void setWind(ForecastWind wind) {
    this.wind = wind;
  }

  public ForecastItems windchill(ForecastWindchill windchill) {
    this.windchill = windchill;
    return this;
  }

  /**
   * Get windchill
   * @return windchill
   **/
  @Schema(description = "")
  
    @Valid
    public ForecastWindchill getWindchill() {
    return windchill;
  }

  public void setWindchill(ForecastWindchill windchill) {
    this.windchill = windchill;
  }

  public ForecastItems snowLine(ForecastSnowLine snowLine) {
    this.snowLine = snowLine;
    return this;
  }

  /**
   * Get snowLine
   * @return snowLine
   **/
  @Schema(description = "")
  
    @Valid
    public ForecastSnowLine getSnowLine() {
    return snowLine;
  }

  public void setSnowLine(ForecastSnowLine snowLine) {
    this.snowLine = snowLine;
  }

  public ForecastItems isNight(Boolean isNight) {
    this.isNight = isNight;
    return this;
  }

  /**
   * Get isNight
   * @return isNight
   **/
  @Schema(description = "")
  
    public Boolean isIsNight() {
    return isNight;
  }

  public void setIsNight(Boolean isNight) {
    this.isNight = isNight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastItems forecastItems = (ForecastItems) o;
    return Objects.equals(this.date, forecastItems.date) &&
        Objects.equals(this.period, forecastItems.period) &&
        Objects.equals(this.freshSnow, forecastItems.freshSnow) &&
        Objects.equals(this.weather, forecastItems.weather) &&
        Objects.equals(this.sunHours, forecastItems.sunHours) &&
        Objects.equals(this.rainHours, forecastItems.rainHours) &&
        Objects.equals(this.prec, forecastItems.prec) &&
        Objects.equals(this.temperature, forecastItems.temperature) &&
        Objects.equals(this.pressure, forecastItems.pressure) &&
        Objects.equals(this.relativeHumidity, forecastItems.relativeHumidity) &&
        Objects.equals(this.clouds, forecastItems.clouds) &&
        Objects.equals(this.wind, forecastItems.wind) &&
        Objects.equals(this.windchill, forecastItems.windchill) &&
        Objects.equals(this.snowLine, forecastItems.snowLine) &&
        Objects.equals(this.isNight, forecastItems.isNight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, period, freshSnow, weather, sunHours, rainHours, prec, temperature, pressure, relativeHumidity, clouds, wind, windchill, snowLine, isNight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastItems {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    freshSnow: ").append(toIndentedString(freshSnow)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    sunHours: ").append(toIndentedString(sunHours)).append("\n");
    sb.append("    rainHours: ").append(toIndentedString(rainHours)).append("\n");
    sb.append("    prec: ").append(toIndentedString(prec)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    pressure: ").append(toIndentedString(pressure)).append("\n");
    sb.append("    relativeHumidity: ").append(toIndentedString(relativeHumidity)).append("\n");
    sb.append("    clouds: ").append(toIndentedString(clouds)).append("\n");
    sb.append("    wind: ").append(toIndentedString(wind)).append("\n");
    sb.append("    windchill: ").append(toIndentedString(windchill)).append("\n");
    sb.append("    snowLine: ").append(toIndentedString(snowLine)).append("\n");
    sb.append("    isNight: ").append(toIndentedString(isNight)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
