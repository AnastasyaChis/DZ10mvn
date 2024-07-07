import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.Radio;

public class RadioTest {
    @Test
    public void currentStatoinTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        Radio radio1 = new Radio();
        radio1.setCurrentStation(15);
        int expected1 = 0;
        int actual1 = radio1.getCurrentStation();
        Assertions.assertEquals(expected1, actual1);

        Radio radio2 = new Radio();
        radio2.setCurrentStation(-1);
        int expected2 = 0;
        int actual2 = radio2.getCurrentStation();
        Assertions.assertEquals(expected2, actual2);

        Radio radio3 = new Radio();
        radio3.setCurrentStation(0);
        int expected3 = 0;
        int actual3 = radio3.getCurrentStation();
        Assertions.assertEquals(expected3, actual3);

        Radio radio4 = new Radio();
        radio4.setCurrentStation(1);
        int expected4 = 1;
        int actual4 = radio4.getCurrentStation();
        Assertions.assertEquals(expected4, actual4);

        Radio radio5 = new Radio();
        radio5.setCurrentStation(8);
        int expected5 = 8;
        int actual5 = radio5.getCurrentStation();
        Assertions.assertEquals(expected5, actual5);

        Radio radio6 = new Radio();
        radio6.setCurrentStation(9);
        int expected6 = 9;
        int actual6 = radio6.getCurrentStation();
        Assertions.assertEquals(expected6, actual6);

        Radio radio7 = new Radio();
        radio7.setCurrentStation(10);
        int expected7 = 0;
        int actual7 = radio7.getCurrentStation();
        Assertions.assertEquals(expected7, actual7);
    }

    @Test
    public void nextStatoinTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        Radio radio1 = new Radio();
        radio1.setCurrentStation(0);
        radio1.nextStation();
        int expected1 = 1;
        int actual1 = radio1.getCurrentStation();
        Assertions.assertEquals(expected1, actual1);

        Radio radio2 = new Radio();
        radio2.setCurrentStation(1);
        radio2.nextStation();
        int expected2 = 2;
        int actual2 = radio2.getCurrentStation();
        Assertions.assertEquals(expected2, actual2);

        Radio radio3 = new Radio();
        radio3.setCurrentStation(8);
        radio3.nextStation();
        int expected3 = 9;
        int actual3 = radio3.getCurrentStation();
        Assertions.assertEquals(expected3, actual3);

        Radio radio4 = new Radio();
        radio4.setCurrentStation(9);
        radio4.nextStation();
        int expected4 = 0;
        int actual4 = radio4.getCurrentStation();
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    public void prevStatoinTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.prevStation();
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

        Radio radio1 = new Radio();
        radio1.setCurrentStation(1);
        radio1.prevStation();
        int expected1 = 0;
        int actual1 = radio1.getCurrentStation();
        Assertions.assertEquals(expected1, actual1);

        Radio radio2 = new Radio();
        radio2.setCurrentStation(2);
        radio2.prevStation();
        int expected2 = 1;
        int actual2 = radio2.getCurrentStation();
        Assertions.assertEquals(expected2, actual2);

        Radio radio3 = new Radio();
        radio3.setCurrentStation(9);
        radio3.prevStation();
        int expected3 = 8;
        int actual3 = radio3.getCurrentStation();
        Assertions.assertEquals(expected3, actual3);

        Radio radio4 = new Radio();
        radio4.setCurrentStation(0);
        radio4.prevStation();
        ;
        int expected4 = 9;
        int actual4 = radio4.getCurrentStation();
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    public void currentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(56);
        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        Radio radio1 = new Radio();
        radio1.setCurrentVolume(150);
        int expected1 = 0;
        int actual1 = radio1.getCurrentVolume();
        Assertions.assertEquals(expected1, actual1);

        Radio radio2 = new Radio();
        radio2.setCurrentVolume(-1);
        int expected2 = 0;
        int actual2 = radio2.getCurrentVolume();
        Assertions.assertEquals(expected2, actual2);

        Radio radio3 = new Radio();
        radio3.setCurrentVolume(0);
        int expected3 = 0;
        int actual3 = radio3.getCurrentVolume();
        Assertions.assertEquals(expected3, actual3);

        Radio radio4 = new Radio();
        radio4.setCurrentVolume(1);
        int expected4 = 1;
        int actual4 = radio4.getCurrentVolume();
        Assertions.assertEquals(expected4, actual4);

        Radio radio5 = new Radio();
        radio5.setCurrentVolume(99);
        int expected5 = 99;
        int actual5 = radio5.getCurrentVolume();
        Assertions.assertEquals(expected5, actual5);

        Radio radio6 = new Radio();
        radio6.setCurrentVolume(100);
        int expected6 = 100;
        int actual6 = radio6.getCurrentVolume();
        Assertions.assertEquals(expected6, actual6);

        Radio radio7 = new Radio();
        radio7.setCurrentVolume(101);
        int expected7 = 0;
        int actual7 = radio7.getCurrentVolume();
        Assertions.assertEquals(expected7, actual7);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(56);
        radio.increaseVolume();
        int expected = 57;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        Radio radio1 = new Radio();
        radio1.setCurrentVolume(0);
        radio1.increaseVolume();
        int expected1 = 1;
        int actual1 = radio1.getCurrentVolume();
        Assertions.assertEquals(expected1, actual1);

        Radio radio2 = new Radio();
        radio2.setCurrentVolume(1);
        radio2.increaseVolume();
        int expected2 = 2;
        int actual2 = radio2.getCurrentVolume();
        Assertions.assertEquals(expected2, actual2);

        Radio radio3 = new Radio();
        radio3.setCurrentVolume(99);
        radio3.increaseVolume();
        int expected3 = 100;
        int actual3 = radio3.getCurrentVolume();
        Assertions.assertEquals(expected3, actual3);

        Radio radio4 = new Radio();
        radio4.setCurrentVolume(100);
        radio4.increaseVolume();
        int expected4 = 0;
        int actual4 = radio4.getCurrentVolume();
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(57);
        radio.decreaseVolume();
        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        Radio radio1 = new Radio();
        radio1.setCurrentVolume(1);
        radio1.decreaseVolume();
        int expected1 = 0;
        int actual1 = radio1.getCurrentVolume();
        Assertions.assertEquals(expected1, actual1);

        Radio radio2 = new Radio();
        radio2.setCurrentVolume(2);
        radio2.decreaseVolume();
        int expected2 = 1;
        int actual2 = radio2.getCurrentVolume();
        Assertions.assertEquals(expected2, actual2);

        Radio radio3 = new Radio();
        radio3.setCurrentVolume(99);
        radio3.decreaseVolume();
        int expected3 = 98;
        int actual3 = radio3.getCurrentVolume();
        Assertions.assertEquals(expected3, actual3);

        Radio radio4 = new Radio();
        radio4.setCurrentVolume(0);
        radio4.decreaseVolume();
        ;
        int expected4 = 100;
        int actual4 = radio4.getCurrentVolume();
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    public void RadioTest() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
//    @Test
//    public void VolumeTest() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(101);
//
//        int expected = 100;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected,actual);
//    }

}