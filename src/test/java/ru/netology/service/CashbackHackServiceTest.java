package ru.netology.service;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculateRemain() {

        CashbackHackService service = new CashbackHackService();

        org.testng.Assert.assertEquals(service.remain(500), 500);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainIfAmountIsZero() {

        CashbackHackService service = new CashbackHackService();

        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainIfAmountIsOne() {

        CashbackHackService service = new CashbackHackService();

        org.testng.Assert.assertEquals(service.remain(1), 999);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainIfAmountLessOneThanThousand() {

        CashbackHackService service = new CashbackHackService();

        org.testng.Assert.assertEquals(service.remain(999),1);
    }

    @org.testng.annotations.Test
    public void shouldCalculateRemainIfAmountEqualsThousand() {

        CashbackHackService service = new CashbackHackService();

        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }
}