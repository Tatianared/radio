import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void shouldRadioStation() {
        Radio num = new Radio();
        num.setStationNumber(5);

        int expected = 5;
        int actual = num.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationMoreMax() {
        Radio num = new Radio();
        num.setStationNumber(15);

        int expected = 0;
        int actual = num.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationLessMax() {
        Radio num = new Radio();
        num.setStationNumber(-1);

        int expected = 0;
        int actual = num.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationMoreMax() {

        Radio num = new Radio();
        num.nextNumber();
        num.setStationNumber(9);
        int expected = 0;
        int actual = num.nextNumber();
        ;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStation() {

        Radio num = new Radio();
        num.prevNumber();
        num.setStationNumber(9);
        int expected = 8;
        int actual = num.prevNumber();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldPrevStationLessMin() {

        Radio num = new Radio();
        num.prevNumber();
        num.setStationNumber(0);
        int expected = 9;
        int actual = num.prevNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolume() {
        Radio num = new Radio();
        num.plusVolume();
        num.setVolume(4);

        int expected = 5;
        int actual = num.plusVolume();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldVolumeMoreMax() {
        Radio num = new Radio();
        num.setVolume(15);

        int expected = 0;
        int actual = num.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume(){
        Radio num = new Radio();
        num.plusVolume();
        num.setVolume(10);
        int expected = 10;
        int actual = num.plusVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMinusVolume() {
        Radio num = new Radio();
        num.minusVolume();
        num.setVolume(10);

        int expected = 9;
        int actual = num.minusVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusVolumeLessMin() {
        Radio num = new Radio();
        num.setVolume(-1);

        int expected = 0;
        int actual = num.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
