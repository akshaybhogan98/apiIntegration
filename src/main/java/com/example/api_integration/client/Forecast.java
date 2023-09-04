package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Forecast
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class Forecast   {
  @JsonProperty("items")
  @Valid
  private List<ForecastItems> items = null;

  @JsonProperty("forecastDate")
  private String forecastDate = null;

  @JsonProperty("nextUpdate")
  private String nextUpdate = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("point")
  private String point = null;

  @JsonProperty("fingerprint")
  private String fingerprint = null;

  public Forecast items(List<ForecastItems> items) {
    this.items = items;
    return this;
  }

  public Forecast addItemsItem(ForecastItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ForecastItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   **/
  @Schema(description = "")
      @Valid
    public List<ForecastItems> getItems() {
    return items;
  }

  public void setItems(List<ForecastItems> items) {
    this.items = items;
  }

  public Forecast forecastDate(String forecastDate) {
    this.forecastDate = forecastDate;
    return this;
  }

  /**
   * Get forecastDate
   * @return forecastDate
   **/
  @Schema(description = "")
  
    @Valid
    public String getForecastDate() {
    return forecastDate;
  }

  public void setForecastDate(String forecastDate) {
    this.forecastDate = forecastDate;
  }

  public Forecast nextUpdate(String nextUpdate) {
    this.nextUpdate = nextUpdate;
    return this;
  }

  /**
   * Get nextUpdate
   * @return nextUpdate
   **/
  @Schema(description = "")
  
    @Valid
    public String getNextUpdate() {
    return nextUpdate;
  }

  public void setNextUpdate(String nextUpdate) {
    this.nextUpdate = nextUpdate;
  }

  public Forecast source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @Schema(description = "")
  
    public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Forecast point(String point) {
    this.point = point;
    return this;
  }

  /**
   * Get point
   * @return point
   **/
  @Schema(description = "")
  
    public String getPoint() {
    return point;
  }

  public void setPoint(String point) {
    this.point = point;
  }

  public Forecast fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Get fingerprint
   * @return fingerprint
   **/
  @Schema(description = "")
  
    public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Forecast forecast = (Forecast) o;
    return Objects.equals(this.items, forecast.items) &&
        Objects.equals(this.forecastDate, forecast.forecastDate) &&
        Objects.equals(this.nextUpdate, forecast.nextUpdate) &&
        Objects.equals(this.source, forecast.source) &&
        Objects.equals(this.point, forecast.point) &&
        Objects.equals(this.fingerprint, forecast.fingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, forecastDate, nextUpdate, source, point, fingerprint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Forecast {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    forecastDate: ").append(toIndentedString(forecastDate)).append("\n");
    sb.append("    nextUpdate: ").append(toIndentedString(nextUpdate)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
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
