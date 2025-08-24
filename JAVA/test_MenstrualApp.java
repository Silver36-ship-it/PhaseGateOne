import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class test_MenstrualApp{
@Test
public void TestDisplayWelcomePageFunction() {
	String result = MenstrualApp.displayWelcomePage();
	assertTrue(result instanceof String);
	}
	
@Test
public void TestMenuPage() {
	String result = MenstrualApp.menuPage();
	assertTrue(result instanceof String);
	}

@Test
public void TestInAppDisplayFunction() {
	String result = MenstrualApp.inAppDisplay();
	assertTrue(result instanceof String);
	}
//@Test
//public void TestFlowDateFunction() {
//	int date = 3;
//	MenstrualApp check_flow = new MenstrualApp();
//	int result = check_flow.calculateFlowDate(date);
//	assertTrue(result instanceof Integer);
//	}
	}