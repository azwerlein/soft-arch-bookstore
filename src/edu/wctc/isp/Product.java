package edu.wctc.isp;

import java.time.LocalDate;

/**
 * Common methods for all products
 * @author Archie
 */
public interface Product {

    String getTitle();

    double getCost();

    String getFormattedReleaseDate();

    LocalDate getReleaseDate();

    int getQuantityOnHand();

    void order(int quantity);

}
