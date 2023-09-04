package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * ForecastWind
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class ForecastWind   {
  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("direction")
  private String direction = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("avg")
  private Integer avg = null;

  @JsonProperty("min")
  private String min = null;

  @JsonProperty("max")
  private String max = null;

  @JsonProperty("gusts")
  private ForecastWindGusts gusts = null;

  @JsonProperty("significationWind")
  private Boolean significationWind = null;

  public ForecastWind unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   **/
  @Schema(description = "")
  
    public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ForecastWind direction(String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   **/
  @Schema(description = "")
  
    public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public ForecastWind text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   **/
  @Schema(description = "")
  
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ForecastWind avg(Integer avg) {
    this.avg = avg;
    return this;
  }

  /**
   * Get avg
   * @return avg
   **/
  @Schema(description = "")
  
    public Integer getAvg() {
    return avg;
  }

  public void setAvg(Integer avg) {
    this.avg = avg;
  }

  public ForecastWind min(String min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
   **/
  @Schema(description = "")
  
    public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
  }

  public ForecastWind max(String max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
   **/
  @Schema(description = "")
  
    public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public ForecastWind gusts(ForecastWindGusts gusts) {
    this.gusts = gusts;
    return this;
  }

  /**
   * Get gusts
   * @return gusts
   **/
  @Schema(description = "")
  
    @Valid
    public ForecastWindGusts getGusts() {
    return gusts;
  }

  public void setGusts(ForecastWindGusts gusts) {
    this.gusts = gusts;
  }

  public ForecastWind significationWind(Boolean significationWind) {
    this.significationWind = significationWind;
    return this;
  }

  /**
   * Get significationWind
   * @return significationWind
   **/
  @Schema(description = "")
  
    public Boolean isSignificationWind() {
    return significationWind;
  }

  public void setSignificationWind(Boolean significationWind) {
    this.significationWind = significationWind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastWind forecastWind = (ForecastWind) o;
    return Objects.equals(this.unit, forecastWind.unit) &&
        Objects.equals(this.direction, forecastWind.direction) &&
        Objects.equals(this.text, forecastWind.text) &&
        Objects.equals(this.avg, forecastWind.avg) &&
        Objects.equals(this.min, forecastWind.min) &&
        Objects.equals(this.max, forecastWind.max) &&
        Objects.equals(this.gusts, forecastWind.gusts) &&
        Objects.equals(this.significationWind, forecastWind.significationWind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, direction, text, avg, min, max, gusts, significationWind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastWind {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    gusts: ").append(toIndentedString(gusts)).append("\n");
    sb.append("    significationWind: ").append(toIndentedString(significationWind)).append("\n");
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
