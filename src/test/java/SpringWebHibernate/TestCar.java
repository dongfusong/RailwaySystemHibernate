package SpringWebHibernate;

import SpringWebHibernate.models.Car;
import SpringWebHibernate.models.CarEngine;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


/**
 * Created by Thoughtworks on 15/8/12.
 */
public class TestCar {
    @Mock
    private CarEngine engine;

    @InjectMocks
    private Car car;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public  void testCarEngine(){
        when(engine.getRmp()).thenReturn(4000);
        car.accelerate();
        assertEquals("warning info", car.getWarningMessages()) ;
    }
}
