package stub;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    private StubGradeSystem stubGradeSystem;
    private GradeService gradeService;

    @BeforeEach
    public void setUp() {
        stubGradeSystem= new StubGradeSystem();
        gradeService = new GradeService(stubGradeSystem);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result = gradeService.calculateAverageGrades(999L);
        assertEquals(result, 90.0);

    }
}
