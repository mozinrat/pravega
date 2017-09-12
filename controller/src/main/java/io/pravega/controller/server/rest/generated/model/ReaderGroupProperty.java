/*
 * Pravega Controller APIs
 * List of admin REST APIs for the pravega controller service.
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.pravega.controller.server.rest.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * ReaderGroupProperty
 */

public class ReaderGroupProperty   {
  @JsonProperty("scopeName")
  private String scopeName = null;

  @JsonProperty("readerGroupName")
  private String readerGroupName = null;

  @JsonProperty("streamList")
  private List<String> streamList = null;

  @JsonProperty("onlineReaderIds")
  private List<String> onlineReaderIds = null;

  public ReaderGroupProperty scopeName(String scopeName) {
    this.scopeName = scopeName;
    return this;
  }

  /**
   * Get scopeName
   * @return scopeName
   **/
  @JsonProperty("scopeName")
  @ApiModelProperty(value = "")
  public String getScopeName() {
    return scopeName;
  }

  public void setScopeName(String scopeName) {
    this.scopeName = scopeName;
  }

  public ReaderGroupProperty readerGroupName(String readerGroupName) {
    this.readerGroupName = readerGroupName;
    return this;
  }

  /**
   * Get readerGroupName
   * @return readerGroupName
   **/
  @JsonProperty("readerGroupName")
  @ApiModelProperty(value = "")
  public String getReaderGroupName() {
    return readerGroupName;
  }

  public void setReaderGroupName(String readerGroupName) {
    this.readerGroupName = readerGroupName;
  }

  public ReaderGroupProperty streamList(List<String> streamList) {
    this.streamList = streamList;
    return this;
  }

  public ReaderGroupProperty addStreamListItem(String streamListItem) {
    if (this.streamList == null) {
      this.streamList = new ArrayList<String>();
    }
    this.streamList.add(streamListItem);
    return this;
  }

  /**
   * Get streamList
   * @return streamList
   **/
  @JsonProperty("streamList")
  @ApiModelProperty(value = "")
  public List<String> getStreamList() {
    return streamList;
  }

  public void setStreamList(List<String> streamList) {
    this.streamList = streamList;
  }

  public ReaderGroupProperty onlineReaderIds(List<String> onlineReaderIds) {
    this.onlineReaderIds = onlineReaderIds;
    return this;
  }

  public ReaderGroupProperty addOnlineReaderIdsItem(String onlineReaderIdsItem) {
    if (this.onlineReaderIds == null) {
      this.onlineReaderIds = new ArrayList<String>();
    }
    this.onlineReaderIds.add(onlineReaderIdsItem);
    return this;
  }

  /**
   * Get onlineReaderIds
   * @return onlineReaderIds
   **/
  @JsonProperty("onlineReaderIds")
  @ApiModelProperty(value = "")
  public List<String> getOnlineReaderIds() {
    return onlineReaderIds;
  }

  public void setOnlineReaderIds(List<String> onlineReaderIds) {
    this.onlineReaderIds = onlineReaderIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReaderGroupProperty readerGroupProperty = (ReaderGroupProperty) o;
    return Objects.equals(this.scopeName, readerGroupProperty.scopeName) &&
        Objects.equals(this.readerGroupName, readerGroupProperty.readerGroupName) &&
        Objects.equals(this.streamList, readerGroupProperty.streamList) &&
        Objects.equals(this.onlineReaderIds, readerGroupProperty.onlineReaderIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeName, readerGroupName, streamList, onlineReaderIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReaderGroupProperty {\n");
    
    sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
    sb.append("    readerGroupName: ").append(toIndentedString(readerGroupName)).append("\n");
    sb.append("    streamList: ").append(toIndentedString(streamList)).append("\n");
    sb.append("    onlineReaderIds: ").append(toIndentedString(onlineReaderIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

