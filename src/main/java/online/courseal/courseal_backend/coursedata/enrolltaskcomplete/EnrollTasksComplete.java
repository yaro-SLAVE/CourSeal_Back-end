package online.courseal.courseal_backend.coursedata.enrolltaskcomplete;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", include = JsonTypeInfo.As.EXTERNAL_PROPERTY)
@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = EnrollTasksCompleteExam.class, name = "exam"),
        @JsonSubTypes.Type(value = EnrollTasksCompleteLecture.class, name = "exam"),
        @JsonSubTypes.Type(value = EnrollTasksCompletePracticeTraining.class, name = "exam")
})
public abstract sealed class EnrollTasksComplete
        permits EnrollTasksCompleteExam, EnrollTasksCompleteLecture, EnrollTasksCompletePracticeTraining {
}
