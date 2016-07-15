package repository;

import com.aston.snowboard.Application;
import com.aston.snowboard.configuration.RepositoryConfiguration;
import com.aston.snowboard.domain.*;
import com.aston.snowboard.repositories.SnowboardRepository;
import com.aston.snowboard.services.PersonService;
import com.aston.snowboard.services.SnowboardService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
/**
 * Created by jonagill1 on 6/28/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
public class SnowboardRepositoryTest {

    @Autowired
    private SnowboardRepository snowboardRepository;

    @Before
    public void loadStuff(){
        List<Snowboard> snowboardList = new ArrayList<Snowboard>();
        Snowboard snowboard1 = new Snowboard();
        snowboard1.setBrandName("Burton");
        snowboard1.setBoardName("JuiceWagon");
        snowboard1.setBoardType(BoardType.camber);
        Snowboard snowboard2 = new Snowboard();
        snowboard2.setBrandName("GNU");
        snowboard2.setBoardName("Riders Choice");
        snowboard2.setBoardType(BoardType.combo);
        Snowboard snowboard3 = new Snowboard();
        snowboard3.setBrandName("Arbor");
        snowboard3.setBoardName("Westmark");
        snowboard3.setBoardType(BoardType.rocker);

        snowboardList.add(snowboard1);
        snowboardList.add(snowboard2);
        snowboardList.add(snowboard3);

        snowboardRepository.save(snowboardList);
    }


    @Test
    public void testFindByBoardType(){
        List<Snowboard> foundByType = snowboardRepository.findByBoardType(BoardType.combo);
        assertEquals(1, foundByType.size());
    }
}
