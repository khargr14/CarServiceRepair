package enums;

public enum CustomerServiceRating {

    BAD(0, 5),
    GOOD(5, 7);
    private int rating;
    private int Satisfaction;






    CustomerServiceRating(int rating, int Satisfaction) {
        this.rating = rating;
        this.Satisfaction = Satisfaction;
    }

    // ------------------------ Getters -------------------------//
    public int getRating() {
        return rating;
    }

    public int getOverallSatisfaction() {
        return Satisfaction;
    }
}
