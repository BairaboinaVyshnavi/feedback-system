package feedback_system.service;

import feedback_system.dto.FeedbackCategoryDto;
import feedback_system.dto.FeedbackDto;
import feedback_system.utility.ApiResponse;

public interface FeedbackService {
    ApiResponse showFeedbackCategories();
    ApiResponse addFeedbackCategories(FeedbackCategoryDto feedbackCategoryDto);
    ApiResponse submitFeedback(FeedbackDto feedbackDto);
    ApiResponse showFeedback(String username);
    ApiResponse showAllFeedback();
    ApiResponse resolveFeedback(FeedbackDto feedbackDto);


    ApiResponse getDashboardData(String username);
    ApiResponse getFeedbackDetails(String feedbackName);
    ApiResponse getFeedbackDetail(Long feedbackId);
    ApiResponse updateFeedback(FeedbackDto feedbackDto);

}
