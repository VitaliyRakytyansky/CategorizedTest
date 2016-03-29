package allWork;

import allWork.categories.Buggy;
import allWork.featureTests.TodoE2ETest;
import allWork.featureTests.TodoOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TodoOperationsAtAllFilterTest.class, TodoE2ETest.class})
@Categories.ExcludeCategory(Buggy.class)
public class FullAcceptanceSuitesTest {
}
