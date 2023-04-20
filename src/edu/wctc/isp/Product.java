package edu.wctc.isp;

import java.time.LocalDate;

public interface Product {

    String getTitle();

    double getCost();

    String getFormattedReleaseDate();

    LocalDate getReleaseDate();

    int getQuantityOnHand();

    void order(int quantity);

}
