package online.courseal.courseal_backend.coursedata.enrolltasks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import online.courseal.courseal_backend.coursedata.enrolltasks.data.CoursealLessonEnrollExamTask;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EnrollTaskExam extends EnrollTask {
    private List<CoursealLessonEnrollExamTask> tasks;
}
