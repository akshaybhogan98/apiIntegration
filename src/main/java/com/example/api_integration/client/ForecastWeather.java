package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ForecastWeather
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class ForecastWeather   {
  @JsonProperty("state")
  private Integer state = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("icon")
  private String icon = null;

  public ForecastWeather state(Integer state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @Schema(description = "")
  
    public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public ForecastWeather text(String text) {
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

  public ForecastWeather icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   **/
  @Schema(description = "")
  
    public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastWeather forecastWeather = (ForecastWeather) o;
    return Objects.equals(this.state, forecastWeather.state) &&
        Objects.equals(this.text, forecastWeather.text) &&
        Objects.equals(this.icon, forecastWeather.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, text, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastWeather {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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
