package com.example.todoapi.controller.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-17T16:21:22.105723600+09:00[Asia/Tokyo]")
public class TaskDTO {

  private Long id;

  private String title;

  /**
   * Default constructor
   * @deprecated Use {@link TaskDTO#TaskDTO(Long, String)}
   */
  @Deprecated
  public TaskDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskDTO(Long id, String title) {
    this.id = id;
    this.title = title;
  }

  public TaskDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * タスクのID
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "タスクのID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TaskDTO title(String title) {
    this.title = title;
    return this;
  }

  /**
   * タスクの処理
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "タスクの処理", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDTO taskDTO = (TaskDTO) o;
    return Objects.equals(this.id, taskDTO.id) &&
        Objects.equals(this.title, taskDTO.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

