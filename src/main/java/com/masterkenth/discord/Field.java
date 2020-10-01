package com.masterkenth.discord;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
public class Field extends Object {
  @Getter @Setter private String name;
  @Getter @Setter private String value;
  @Getter @Setter private boolean inline;
}
