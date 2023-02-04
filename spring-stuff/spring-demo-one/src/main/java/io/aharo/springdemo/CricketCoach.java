package io.aharo.springdemo;

public class CricketCoach implements Coach
{
    private FortuneService fortuneService;
    private String emailAddress;
    private String  team;


    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) 
    {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) 
    {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    // create a no-arg constructuctor DVC
    public CricketCoach(){
        System.out.println("CricketCoach: inside DVC ");
    }

    

    @Override
    public String getDailyWorkout() {
        
        return "Practice fast bowling for 15 minutess";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }
    
    
}
