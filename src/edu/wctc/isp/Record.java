package edu.wctc.isp;

import java.time.Duration;

public interface Record extends Product {

    String getArtist();

    Duration getPlayingTime();
}
