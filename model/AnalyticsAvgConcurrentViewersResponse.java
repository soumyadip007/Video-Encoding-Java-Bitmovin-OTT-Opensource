package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsColumnLabel;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsAvgConcurrentViewersResponse
 */

public class AnalyticsAvgConcurrentViewersResponse {
  @JsonProperty("rows")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Double> rows = new ArrayList<Double>();

  @JsonProperty("rowCount")
  private Long rowCount;

  @JsonProperty("columnLabels")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsColumnLabel> columnLabels = new ArrayList<AnalyticsColumnLabel>();


  public AnalyticsAvgConcurrentViewersResponse addRowsItem(Double rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * Get rows
   * @return rows
   */
  public List<Double> getRows() {
    return rows;
  }

  /**
   * Set rows
   *
   * @param rows
   */
  public void setRows(List<Double> rows) {
    this.rows = rows;
  }


  /**
   * Number of rows returned
   * @return rowCount
   */
  public Long getRowCount() {
    return rowCount;
  }

  /**
   * Number of rows returned
   *
   * @param rowCount
   *        Number of rows returned
   */
  public void setRowCount(Long rowCount) {
    this.rowCount = rowCount;
  }


  public AnalyticsAvgConcurrentViewersResponse addColumnLabelsItem(AnalyticsColumnLabel columnLabelsItem) {
    this.columnLabels.add(columnLabelsItem);
    return this;
  }

  /**
   * Get columnLabels
   * @return columnLabels
   */
  public List<AnalyticsColumnLabel> getColumnLabels() {
    return columnLabels;
  }

  /**
   * Set columnLabels
   *
   * @param columnLabels
   */
  public void setColumnLabels(List<AnalyticsColumnLabel> columnLabels) {
    this.columnLabels = columnLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAvgConcurrentViewersResponse analyticsAvgConcurrentViewersResponse = (AnalyticsAvgConcurrentViewersResponse) o;
    return Objects.equals(this.rows, analyticsAvgConcurrentViewersResponse.rows) &&
        Objects.equals(this.rowCount, analyticsAvgConcurrentViewersResponse.rowCount) &&
        Objects.equals(this.columnLabels, analyticsAvgConcurrentViewersResponse.columnLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows, rowCount, columnLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAvgConcurrentViewersResponse {\n");
    
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    columnLabels: ").append(toIndentedString(columnLabels)).append("\n");
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

