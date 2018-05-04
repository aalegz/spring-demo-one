package com.aalegz.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setEmailAddress method");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setTeam method");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setFortuneService method");
        this.fortuneService = fortuneService;
    }

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-args constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
