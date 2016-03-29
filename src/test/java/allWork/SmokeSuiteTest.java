package allWork;

import allWork.featureTests.TodoE2ETest;
import allWork.featureTests.TodoOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import allWork.categories.Smoke;

/**
 * Created by Winterfall on 27.03.2016.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({TodoOperationsAtAllFilterTest.class, TodoE2ETest.class})
@Categories.IncludeCategory(Smoke.class)
public class SmokeSuiteTest {
}
