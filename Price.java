public abstract class Price {
   public abstract int getPriceCode();

   public double getCharge(int daysRented) {
    
    switch (getMovie().getPriceCode()) {
        case Movie.REGULAR:
            thisAmount += 2;
            if (getDaysRented() > 2)
                thisAmount += (getDaysRented() - 2) * 1.5;
            break;
        case Movie.NEW_RELEASE:
            thisAmount +=getDaysRented() * 3;
            break;
        case Movie.CHILDRENS:
            thisAmount += 1.5;
            if (getDaysRented() > 3)
                thisAmount += (getDaysRented() - 3) * 1.5;
            break;
     }
 }
 public abstract double getCharge(int daysRented);

 public int getFrequentRenterPoints(int daysRented) {
    frequentRenterPoints ++;
 }
}

