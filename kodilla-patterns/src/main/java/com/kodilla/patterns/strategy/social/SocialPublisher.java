package com.kodilla.patterns.strategy.social;

public sealed interface SocialPublisher
permits  FacebookPublisher, TwitterPublisher, SnapchatPublisher {

   String share();
}
