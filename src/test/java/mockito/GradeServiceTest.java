package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    private GradeService gradeService;
    private GradeSystem mockGradeSystem;

    @BeforeEach
    void setUp() {
        mockGradeSystem= mock(GradeSystem.class);
        gradeService = new GradeService(mockGradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(mockGradeSystem.gradesFor(10L)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        Double result = gradeService.calculateAverageGrades(10L);
        Assertions.assertEquals(90.0,result);
    }
}

