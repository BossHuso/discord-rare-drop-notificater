package com.masterkenth.discord;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
public class Embed extends Object {
  @Getter @Setter private Author author;
  @Getter @Setter private String description;
  @Getter @Setter private Image thumbnail;
  @Getter @Setter private Image image;
  @Getter @Setter private Field[] fields;
}