package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ForecastTemperature
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class ForecastTemperature   {
  @JsonProperty("avg")
  private Integer avg = null;

  public ForecastTemperature avg(Integer avg) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastTemperature forecastTemperature = (ForecastTemperature) o;
    return Objects.equals(this.avg, forecastTemperature.avg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastTemperature {\n");
    
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
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
