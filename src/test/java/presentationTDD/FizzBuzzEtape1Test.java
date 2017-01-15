package presentationTDD;


import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Jean-François Le Foll on 05/11/2015.
 */
public class FizzBuzzEtape1Test {

    private List<String> résultat;

    @Before
    public void initFizzBuzz(){
        FizzBuzzEtape1 fizzBuzz = new FizzBuzzEtape1();

        résultat = fizzBuzz.calculer();
    }

    @Test
    public void peutConstuireUneListeDe101Entiers(){

        assertThat(résultat).hasSize(101);
    }

    @Test
    public void peutRetournerUnCasSimple(){

        assertThat(résultat.get(2)).isEqualTo("2");
    }

    @Test
    public void peutCalculerFizzPour3(){

        assertThat(résultat.get(3)).isEqualTo("fizz");
    }

    @Test
    public void peutCalculerFizzPour6(){

        assertThat(résultat.get(6)).isEqualTo("fizz");
    }

    @Test
    public void peutCalculerBuzzPour5(){

        assertThat(résultat.get(5)).isEqualTo("buzz");
    }

    @Test
    public void peutCalculerFizzBuzz45(){

        assertThat(résultat.get(45)).isEqualTo("fizzBuzz");
    }

}


