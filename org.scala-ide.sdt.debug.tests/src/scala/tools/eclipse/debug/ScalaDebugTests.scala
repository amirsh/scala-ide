package scala.tools.eclipse.debug

import junit.framework.TestSuite
import org.junit.runners.Suite
import org.junit.runner.RunWith
import scala.tools.eclipse.debug.model.ScalaThreadTest
import scala.tools.eclipse.debug.model.ScalaDebugModelPresentationTest
import scala.tools.eclipse.debug.model.ScalaStackFrameTest
import scala.tools.eclipse.debug.model.ScalaValueTest
import scala.tools.eclipse.debug.model.ScalaDebugTargetTest
import scala.tools.eclipse.launching.LibraryJarInBootstrapTest

/**
 * Junit test suite for the Scala debugger.
 */

@RunWith(classOf[Suite])
@Suite.SuiteClasses(
  Array(
    classOf[ScalaDebugSteppingTest],
    classOf[ScalaDebugResumeTest],
    classOf[ScalaThreadTest],
//    classOf[ScalaDebugModelPresentationTest], // TODO: find where to put this test
    classOf[ScalaStackFrameTest],
    classOf[ScalaValueTest],
//    classOf[LibraryJarInBootstrapTest], // the test is not running on command line right now
    classOf[ScalaDebugTargetTest]))
class ScalaDebugTestSuite {
}