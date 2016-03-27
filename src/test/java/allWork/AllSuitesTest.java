package allWork;

import allWork.caterories.Buggy;
import allWork.caterories.Smoke;
import allWork.featureTests.TodoE2ETest;
import allWork.featureTests.TodoOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TodoOperationsAtAllFilterTest.class, TodoE2ETest.class, Buggy.class})
public class AllSuitesTest {
}
