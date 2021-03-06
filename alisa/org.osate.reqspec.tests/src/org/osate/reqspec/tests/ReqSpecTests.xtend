/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 *
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 *
 * See COPYRIGHT file for full details.
 */

package org.osate.reqspec.tests

import com.google.inject.Inject
import com.itemis.xtext.testing.XtextTest
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.osate.reqspec.reqSpec.ReqSpec
import org.osate.reqspec.reqSpec.ReqValDeclaration
import org.osate.reqspec.reqSpec.Requirement
import org.osate.reqspec.reqSpec.SystemRequirementSet
import org.osate.testsupport.TestHelper

import static org.junit.Assert.*
import static org.osate.reqspec.util.ReqSpecUtilExtension.*
import org.osate.reqspec.util.ReqSpecUtilExtension
import org.osate.alisa.common.common.ValDeclaration
import org.osate.reqspec.reqSpec.ReqSpecPackage
import com.itemis.xtext.testing.FluentIssueCollection
import static extension org.osate.testsupport.AssertHelper.*
 
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ReqSpecAadl2InjectorProvider))
class ReqSpecTests extends XtextTest {
	
	@Inject
	TestHelper<ReqSpec> reqspecTestHelper
	
	@Inject extension ValidationTestHelper

	val projectprefix = "org.osate.reqspec.tests/models/ControlSystem/"

	
	@Test
	def void testUnitResolution() {
		val reqspec = reqspecTestHelper.parseFile(projectprefix+"CSUnitTest.reqspec", projectprefix+"sei.org", projectprefix+"ControlSystem.aadl")
		reqspec.eResource.assertNoErrors
			assertEquals(reqspec.parts.size, 1)
			val srs = reqspec.parts.get(0) as SystemRequirementSet 
			assertEquals(srs.name, "csunittest")
			val req = srs.requirements.get(0) as Requirement 
			assertEquals(req.name,"R1")
			assertTrue(req.constants.size > 0)
			val vd = req.constants.get(0) as ReqValDeclaration
			assertEquals(vd.name,"MaximumWeight")
	}

	@Test
	// this test uses ValidationTestHelper.
	// Its methods use text position for the model element.
	// If position is set to -1,-1 then any object that is of the specified class is considered a match.
	// When using these methods we are not able to determine whether there are issues in the model that are not asserted
	def void testControlSystemNoGoalsReqs() {
		val reqspec = reqspecTestHelper.parseFile(projectprefix+"CSReqs.reqspec", projectprefix+"predefined.cat",projectprefix+"sei.org", projectprefix+"ControlSystem.aadl")
			assertEquals(reqspec.parts.size, 1)
			assertTrue(reqspec.parts.size > 0)
			val srs = reqspec.parts.get(0) as SystemRequirementSet 
			assertEquals(srs.name, "dcsreqs")
			val req = srs.requirements.get(0) as Requirement 
			assertEquals(req.name,"R1")
			assertEquals(req.constants.size ,1)
			val vd = req.constants.get(0) as ReqValDeclaration
			assertEquals(vd.name,"MaximumWeight")
			req.assertError(ReqSpecPackage.Literals.REQUIREMENT, "org.eclipse.xtext.diagnostics.Diagnostic.Linking", 469,11,"Couldn't resolve reference to Goal 'CSgoals.ng2'.")
			srs.assertWarning(ReqSpecPackage.Literals.SYSTEM_REQUIREMENT_SET, "featuresWithoutRequirement", 200,283, "Features without requirement: R1")
	}
	
		@Test
	// This test uses the FluentIssueCollection as mechanism to track asserted issues
	def void testControlSystemNoGoalsReqsFluency() {
		val testFileResult = issues = reqspecTestHelper.testFile(projectprefix+"CSReqs.reqspec", projectprefix+"predefined.cat",projectprefix+"sei.org", projectprefix+"ControlSystem.aadl")
		val issueCollection = new FluentIssueCollection(testFileResult.resource, newArrayList, newArrayList)
		val reqspec = issues.resource.contents.get(0) as ReqSpec
			assertEquals(reqspec.parts.size, 1)
			assertTrue(reqspec.parts.size > 0)
			val srs = reqspec.parts.get(0) as SystemRequirementSet 
			assertEquals(srs.name, "dcsreqs")
			val req = srs.requirements.get(0) as Requirement 
			assertEquals(req.name,"R1")
			assertEquals(req.constants.size ,1)
			val vd = req.constants.get(0) as ReqValDeclaration
			assertEquals(vd.name,"MaximumWeight")
			req.assertError(testFileResult.issues, issueCollection, "Couldn't resolve reference to Goal 'CSgoals.ng2'.")
			srs.assertWarning(testFileResult.issues, issueCollection, "Features without requirement: R1")
		issueCollection.sizeIs(testFileResult.issues.size)
		assertConstraints(issueCollection)
	}
	

}