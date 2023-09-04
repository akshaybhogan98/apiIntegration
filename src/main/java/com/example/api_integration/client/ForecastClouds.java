package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ForecastClouds
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class ForecastClouds   {
  @JsonProperty("high")
  private Integer high = null;

  @JsonProperty("low")
  private Integer low = null;

  @JsonProperty("middle")
  private Integer middle = null;

  public ForecastClouds high(Integer high) {
    this.high = high;
    return this;
  }

  /**
   * Get high
   * @return high
   **/
  @Schema(description = "")
  
    public Integer getHigh() {
    return high;
  }

  public void setHigh(Integer high) {
    this.high = high;
  }

  public ForecastClouds low(Integer low) {
    this.low = low;
    return this;
  }

  /**
   * Get low
   * @return low
   **/
  @Schema(description = "")
  
    public Integer getLow() {
    return low;
  }

  public void setLow(Integer low) {
    this.low = low;
  }

  public ForecastClouds middle(Integer middle) {
    this.middle = middle;
    return this;
  }

  /**
   * Get middle
   * @return middle
   **/
  @Schema(description = "")
  
    public Integer getMiddle() {
    return middle;
  }

  public void setMiddle(Integer middle) {
    this.middle = middle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastClouds forecastClouds = (ForecastClouds) o;
    return Objects.equals(this.high, forecastClouds.high) &&
        Objects.equals(this.low, forecastClouds.low) &&
        Objects.equals(this.middle, forecastClouds.middle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(high, low, middle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastClouds {\n");
    
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
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
