package allWork;

import allWork.caterories.Buggy;
import allWork.featureTests.TodoOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import allWork.caterories.Smoke;

/**
 * Created by Winterfall on 27.03.2016.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses(TodoOperationsAtAllFilterTest.class)
@Categories.IncludeCategory(Smoke.class)
public class SmokeSuiteTest {
}
