package es.upm.miw.iwvg_devops.code;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchTest {

    @Test
    void testFindDecimalFractionByUserName() {
        assertEquals(List.of(0.0, -0.0, 0.0), new Searches().findDecimalFractionByUserName("Antonio")
                .collect(Collectors.toList()));
    }
}
