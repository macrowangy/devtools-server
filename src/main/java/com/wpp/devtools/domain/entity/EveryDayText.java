package com.wpp.devtools.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@Table(name = "every_day_text")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class EveryDayText {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private String author;
  private String title;
  private String content;

}
