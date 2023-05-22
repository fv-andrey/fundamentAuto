package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldCalculateRemain() {

        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(500, service.remain(500));
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsZero() {

        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsOne() {

        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(999, service.remain(1));
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountLessOneThanThousand() {

        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountEqualsThousand() {

        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateRemain1() {

        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(500, service.remain(500));
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateRemainIfAmountIsZero1() {

        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateRemainIfAmountIsOne1() {

        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(999, service.remain(1));
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateRemainIfAmountLessOneThanThousand1() {

        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateRemainIfAmountEqualsThousand1() {

        CashbackHackService service = new CashbackHackService();

        org.junit.Assert.assertEquals(0, service.remain(1000));
    }
}