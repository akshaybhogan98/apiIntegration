package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ForecastWindchill
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class ForecastWindchill   {
  @JsonProperty("avg")
  private Integer avg = null;

  @JsonProperty("min")
  private String min = null;

  @JsonProperty("max")
  private String max = null;

  public ForecastWindchill avg(Integer avg) {
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

  public ForecastWindchill min(String min) {
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

  public ForecastWindchill max(String max) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastWindchill forecastWindchill = (ForecastWindchill) o;
    return Objects.equals(this.avg, forecastWindchill.avg) &&
        Objects.equals(this.min, forecastWindchill.min) &&
        Objects.equals(this.max, forecastWindchill.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avg, min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastWindchill {\n");
    
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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
