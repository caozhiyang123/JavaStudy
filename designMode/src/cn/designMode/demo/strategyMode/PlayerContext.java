package cn.designMode.demo.strategyMode;

public class PlayerContext
{
    private PlayerStrategy playerStrategy;

    public PlayerContext(PlayerStrategy playerStrategy)
    {
        this.playerStrategy = playerStrategy;
    }

    public void setPlayerStrategy(PlayerStrategy playerStrategy)
    {
        this.playerStrategy = playerStrategy;
    }
    
    public void discount(){
        playerStrategy.discount();
    }
    
}
