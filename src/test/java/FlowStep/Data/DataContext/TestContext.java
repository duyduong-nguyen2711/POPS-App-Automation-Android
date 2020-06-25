package FlowStep.Data.DataContext;

public class TestContext {
    private static ScenarioContext scenarioContext;
    public static ScenarioContext getScenarioContext() {
        if(scenarioContext == null){
            scenarioContext = new ScenarioContext();
        }
        return  scenarioContext;
    }
}
