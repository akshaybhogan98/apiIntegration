package com.example.api_integration.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * LocationCoordinates
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-01T15:51:31.721839369Z[GMT]")


public class LocationCoordinates   {
  @JsonProperty("latitude")
  private BigDecimal latitude = null;

  @JsonProperty("longitude")
  private BigDecimal longitude = null;

  public LocationCoordinates latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public LocationCoordinates longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationCoordinates locationCoordinates = (LocationCoordinates) o;
    return Objects.equals(this.latitude, locationCoordinates.latitude) &&
        Objects.equals(this.longitude, locationCoordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationCoordinates {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
