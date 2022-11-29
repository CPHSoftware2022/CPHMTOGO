package dk.msw.feedback.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Feedback {
    @Id
    @GeneratedValue
    private Long feedbackId;
    private Long customerId;
    private Long restaurantId;
    private Long courierId;
    private String title;
    private int foodRating;
    private int courierRating;
    private int overallRating;
    private String description;

    public Feedback(Long customerId, Long restaurantId, Long courierId,
                    String title, int foodRating, int courierRating, int overallRating, String description) {
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.courierId = courierId;
        this.title = title;
        this.foodRating = foodRating;
        this.courierRating = courierRating;
        this.overallRating = (foodRating + courierRating)/ 2;
        this.description = description;
    }

    public Feedback() {
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Long getCourierId() {
        return courierId;
    }

    public void setCourierId(Long courierId) {
        this.courierId = courierId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(int foodRating) {
        this.foodRating = foodRating;
    }

    public int getCourierRating() {
        return courierRating;
    }

    public void setCourierRating(int courierRating) {
        this.courierRating = courierRating;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
