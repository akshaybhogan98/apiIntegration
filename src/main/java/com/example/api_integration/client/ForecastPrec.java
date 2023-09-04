package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ForecastPrec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class ForecastPrec   {
  @JsonProperty("sum")
  private Integer sum = null;

  @JsonProperty("probability")
  private Integer probability = null;

  @JsonProperty("sumAsRain")
  private String sumAsRain = null;

  @JsonProperty("class")
  private Integer propertyClass = null;

  public ForecastPrec sum(Integer sum) {
    this.sum = sum;
    return this;
  }

  /**
   * Get sum
   * @return sum
   **/
  @Schema(description = "")
  
    public Integer getSum() {
    return sum;
  }

  public void setSum(Integer sum) {
    this.sum = sum;
  }

  public ForecastPrec probability(Integer probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Get probability
   * @return probability
   **/
  @Schema(description = "")
  
    public Integer getProbability() {
    return probability;
  }

  public void setProbability(Integer probability) {
    this.probability = probability;
  }

  public ForecastPrec sumAsRain(String sumAsRain) {
    this.sumAsRain = sumAsRain;
    return this;
  }

  /**
   * Get sumAsRain
   * @return sumAsRain
   **/
  @Schema(description = "")
  
    public String getSumAsRain() {
    return sumAsRain;
  }

  public void setSumAsRain(String sumAsRain) {
    this.sumAsRain = sumAsRain;
  }

  public ForecastPrec propertyClass(Integer propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
   **/
  @Schema(description = "")
  
    public Integer getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(Integer propertyClass) {
    this.propertyClass = propertyClass;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastPrec forecastPrec = (ForecastPrec) o;
    return Objects.equals(this.sum, forecastPrec.sum) &&
        Objects.equals(this.probability, forecastPrec.probability) &&
        Objects.equals(this.sumAsRain, forecastPrec.sumAsRain) &&
        Objects.equals(this.propertyClass, forecastPrec.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sum, probability, sumAsRain, propertyClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastPrec {\n");
    
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    sumAsRain: ").append(toIndentedString(sumAsRain)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
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
