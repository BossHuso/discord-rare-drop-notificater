package com.masterkenth.discord;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
public class Webhook extends Object {
  @Getter @Setter private Embed[] embeds;
}
