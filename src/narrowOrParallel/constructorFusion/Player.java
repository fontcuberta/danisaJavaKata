package narrowOrParallel.constructorFusion;

public class Player {
    private int birthYear;
    private int score;
    private Role role;

    public Player(Role role, int birthYear){
        this.role = role;
        this.birthYear = birthYear;
        this.score = 0;
    }

    public Player(Role role, int birth, int score){
        this.role = role;
        this.birthYear = birth;
        this.score = score;
    }

    public void play(){
        if (role == Role.Dragon){
            score += 20;
        }
        else {
            score = score - 10;
        }
    }

    public int getScore(){
        return score;
    }
}
