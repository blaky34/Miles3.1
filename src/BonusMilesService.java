public class BonusMilesService {
    public int calculate(int cost) {
        int bonusMiles = 1;
        int rubles = 20;
        int miles = cost * bonusMiles / rubles;
        return miles;
    }
}
