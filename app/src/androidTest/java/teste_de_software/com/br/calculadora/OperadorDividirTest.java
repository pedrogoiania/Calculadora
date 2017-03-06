package teste_de_software.com.br.calculadora;

import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class OperadorDividirTest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void dividirDoisPositivos() throws Exception{
        onView(withId(R.id.numero9)).perform(ViewActions.click());

        onView(withId(R.id.operador_dividir)).perform(ViewActions.click());

        onView(withId(R.id.numero3)).perform(ViewActions.click());

        onView(withId(R.id.operador_resultado)).perform(ViewActions.click());

        onView(withId(R.id.display)).check(matches(withText("3.0")));

    }

    @Test
    public void dividirNegativoComPositivo() throws Exception{
        onView(withId(R.id.operador_subtrair)).perform(ViewActions.click());

        onView(withId(R.id.numero9)).perform(ViewActions.click());

        onView(withId(R.id.operador_dividir)).perform(ViewActions.click());

        onView(withId(R.id.numero3)).perform(ViewActions.click());

        onView(withId(R.id.operador_resultado)).perform(ViewActions.click());

        onView(withId(R.id.display)).check(matches(withText("-3.0")));

    }


    @Test
    public void dividirPositivoComNegativo() throws Exception{
        onView(withId(R.id.numero3)).perform(ViewActions.click());

        onView(withId(R.id.operador_dividir)).perform(ViewActions.click());

        onView(withId(R.id.operador_subtrair)).perform(ViewActions.click());

        onView(withId(R.id.numero1)).perform(ViewActions.click());

        onView(withId(R.id.operador_resultado)).perform(ViewActions.click());

        onView(withId(R.id.display)).check(matches(withText("-3.0")));

    }

    @Test
    public void dividirNegativoComNegativo() throws Exception{
        onView(withId(R.id.operador_subtrair)).perform(ViewActions.click());

        onView(withId(R.id.numero3)).perform(ViewActions.click());

        onView(withId(R.id.operador_dividir)).perform(ViewActions.click());

        onView(withId(R.id.operador_subtrair)).perform(ViewActions.click());

        onView(withId(R.id.numero1)).perform(ViewActions.click());

        onView(withId(R.id.operador_resultado)).perform(ViewActions.click());

        onView(withId(R.id.display)).check(matches(withText("3.0")));

    }

    @Test
    public void dividirInteiroPorZero() throws Exception{
        onView(withId(R.id.numero3)).perform(ViewActions.click());

        onView(withId(R.id.operador_dividir)).perform(ViewActions.click());

        onView(withId(R.id.numero0)).perform(ViewActions.click());

        onView(withId(R.id.operador_resultado)).perform(ViewActions.click());

        onView(withId(R.id.display)).check(matches(withText("Infinity")));

    }

    @Test
    public void dividirZeroPorInteiro() throws Exception{
        onView(withId(R.id.numero0)).perform(ViewActions.click());

        onView(withId(R.id.operador_dividir)).perform(ViewActions.click());

        onView(withId(R.id.numero9)).perform(ViewActions.click());

        onView(withId(R.id.operador_resultado)).perform(ViewActions.click());

        onView(withId(R.id.display)).check(matches(withText("0.0")));

    }


}
