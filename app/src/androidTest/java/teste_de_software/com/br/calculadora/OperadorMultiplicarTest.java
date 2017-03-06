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
public class OperadorMultiplicarTest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void multiplicarDoisPositivos() throws Exception{
        onView(withId(R.id.numero1)).perform(ViewActions.click());

        onView(withId(R.id.operador_multiplicar)).perform(ViewActions.click());

        onView(withId(R.id.numero3)).perform(ViewActions.click());

        onView(withId(R.id.operador_resultado)).perform(ViewActions.click());

        onView(withId(R.id.display)).check(matches(withText("3.0")));

    }

    @Test
    public void multiplicarNegativoComPositivo() throws Exception{
        onView(withId(R.id.operador_subtrair)).perform(ViewActions.click());

        onView(withId(R.id.numero1)).perform(ViewActions.click());

        onView(withId(R.id.operador_multiplicar)).perform(ViewActions.click());

        onView(withId(R.id.numero3)).perform(ViewActions.click());

        onView(withId(R.id.operador_resultado)).perform(ViewActions.click());

        onView(withId(R.id.display)).check(matches(withText("-3.0")));

    }


    @Test
    public void multiplicarPositivoComNegativo() throws Exception{
        onView(withId(R.id.numero3)).perform(ViewActions.click());

        onView(withId(R.id.operador_multiplicar)).perform(ViewActions.click());

        onView(withId(R.id.operador_subtrair)).perform(ViewActions.click());

        onView(withId(R.id.numero1)).perform(ViewActions.click());

        onView(withId(R.id.operador_resultado)).perform(ViewActions.click());

        onView(withId(R.id.display)).check(matches(withText("-3.0")));

    }

    @Test
    public void multiplicarNegativoComNegativo() throws Exception{
        onView(withId(R.id.operador_subtrair)).perform(ViewActions.click());

        onView(withId(R.id.numero3)).perform(ViewActions.click());

        onView(withId(R.id.operador_multiplicar)).perform(ViewActions.click());

        onView(withId(R.id.operador_subtrair)).perform(ViewActions.click());

        onView(withId(R.id.numero1)).perform(ViewActions.click());

        onView(withId(R.id.operador_resultado)).perform(ViewActions.click());

        onView(withId(R.id.display)).check(matches(withText("3.0")));

    }

}
