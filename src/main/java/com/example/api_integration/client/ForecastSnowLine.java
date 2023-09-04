package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ForecastSnowLine
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class ForecastSnowLine   {
  @JsonProperty("avg")
  private String avg = null;

  @JsonProperty("min")
  private String min = null;

  @JsonProperty("max")
  private String max = null;

  @JsonProperty("unit")
  private String unit = null;

  public ForecastSnowLine avg(String avg) {
    this.avg = avg;
    return this;
  }

  /**
   * Get avg
   * @return avg
   **/
  @Schema(description = "")
  
    public String getAvg() {
    return avg;
  }

  public void setAvg(String avg) {
    this.avg = avg;
  }

  public ForecastSnowLine min(String min) {
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

  public ForecastSnowLine max(String max) {
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

  public ForecastSnowLine unit(String unit) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastSnowLine forecastSnowLine = (ForecastSnowLine) o;
    return Objects.equals(this.avg, forecastSnowLine.avg) &&
        Objects.equals(this.min, forecastSnowLine.min) &&
        Objects.equals(this.max, forecastSnowLine.max) &&
        Objects.equals(this.unit, forecastSnowLine.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avg, min, max, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastSnowLine {\n");
    
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
