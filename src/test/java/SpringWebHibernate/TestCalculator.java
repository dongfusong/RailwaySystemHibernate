package SpringWebHibernate;

import SpringWebHibernate.models.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by Thoughtworks on 15/8/12.
 */
public class TestCalculator {
    @Mock
    private Calculator calculator;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAbs(){
        //指派行为
        when(calculator.Abs(20)).thenReturn(40);
        assertEquals(40, calculator.Abs(20));
    }
}
