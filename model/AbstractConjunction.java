package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AbstractCondition;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AbstractConjunction
 */

public class AbstractConjunction extends AbstractCondition {
  @JsonProperty("conditions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AbstractCondition> conditions = new ArrayList<AbstractCondition>();


  public AbstractConjunction addConditionsItem(AbstractCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Array to perform the AND/OR evaluation on
   * @return conditions
   */
  public List<AbstractCondition> getConditions() {
    return conditions;
  }

  /**
   * Array to perform the AND/OR evaluation on
   *
   * @param conditions
   *        Array to perform the AND/OR evaluation on
   */
  public void setConditions(List<AbstractCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractConjunction abstractConjunction = (AbstractConjunction) o;
    return Objects.equals(this.conditions, abstractConjunction.conditions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractConjunction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

