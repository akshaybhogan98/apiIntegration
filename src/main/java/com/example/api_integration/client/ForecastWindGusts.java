package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ForecastWindGusts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class ForecastWindGusts   {
  @JsonProperty("value")
  private Integer value = null;

  @JsonProperty("text")
  private String text = null;

  public ForecastWindGusts value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public ForecastWindGusts text(String text) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastWindGusts forecastWindGusts = (ForecastWindGusts) o;
    return Objects.equals(this.value, forecastWindGusts.value) &&
        Objects.equals(this.text, forecastWindGusts.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastWindGusts {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
