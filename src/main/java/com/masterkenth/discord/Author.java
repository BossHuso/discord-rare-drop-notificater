package com.masterkenth.discord;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
public class Author extends Object {
  @Getter @Setter private String name;
  @Getter @Setter private String icon_url;
}
