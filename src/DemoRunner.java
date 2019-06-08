/*
 * Zadanie 4: Demo Runner
 * Wykonali:
 * Adrian Witkowski
 */

public class DemoRunner
{
    public static void main()
    {
        Machine machine = new Machine();
        PoliticalCandidate politicalCandidate = new PoliticalCandidate();
        Athlete athlete = new Athlete();
        machine.run();
        politicalCandidate.run();
        athlete.run();
    }
}