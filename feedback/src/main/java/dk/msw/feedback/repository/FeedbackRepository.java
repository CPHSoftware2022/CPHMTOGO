package dk.msw.feedback.repository;

import dk.msw.feedback.entity.Feedback;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FeedbackRepository extends CrudRepository<Feedback, Long> {

    List<Feedback> findFeedbacksByCustomerIdAndRestaurantId(Long customerId, Long restaurantId);

    List<Feedback> findFeedbacksByCourierId(Long courierId);
}
