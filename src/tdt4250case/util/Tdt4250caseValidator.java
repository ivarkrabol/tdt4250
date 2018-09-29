/**
 */
package tdt4250case.util;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250case.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250case.Tdt4250casePackage
 * @generated
 */
public class Tdt4250caseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Tdt4250caseValidator INSTANCE = new Tdt4250caseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250case";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tdt4250caseValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Tdt4250casePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Tdt4250casePackage.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case Tdt4250casePackage.COURSE_CREDIT_REDUCTION:
			return validateCourseCreditReduction((CourseCreditReduction) value, diagnostics, context);
		case Tdt4250casePackage.STUDYPROGRAM:
			return validateStudyprogram((Studyprogram) value, diagnostics, context);
		case Tdt4250casePackage.COURSE_INSTANCE:
			return validateCourseInstance((CourseInstance) value, diagnostics, context);
		case Tdt4250casePackage.EXAMINATION:
			return validateExamination((Examination) value, diagnostics, context);
		case Tdt4250casePackage.EXAMINATION_ACTIVITY:
			return validateExaminationActivity((ExaminationActivity) value, diagnostics, context);
		case Tdt4250casePackage.TIMETABLE:
			return validateTimetable((Timetable) value, diagnostics, context);
		case Tdt4250casePackage.SCHEDULED_ACTIVITY:
			return validateScheduledActivity((ScheduledActivity) value, diagnostics, context);
		case Tdt4250casePackage.DEPARTMENT:
			return validateDepartment((Department) value, diagnostics, context);
		case Tdt4250casePackage.PERSON:
			return validatePerson((Person) value, diagnostics, context);
		case Tdt4250casePackage.COURSE_ROLE:
			return validateCourseRole((CourseRole) value, diagnostics, context);
		case Tdt4250casePackage.SEMESTER:
			return validateSemester((Semester) value, diagnostics, context);
		case Tdt4250casePackage.TIMESLOT:
			return validateTimeslot((Timeslot) value, diagnostics, context);
		case Tdt4250casePackage.EXAMINATION_ACTIVITY_WEIGHT:
			return validateExaminationActivityWeight((ExaminationActivityWeight) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseCreditReduction(CourseCreditReduction courseCreditReduction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseCreditReduction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyprogram(Studyprogram studyprogram, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyprogram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseInstance(CourseInstance courseInstance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExamination(Examination examination, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(examination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExaminationActivity(ExaminationActivity examinationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(examinationActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimetable(Timetable timetable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timetable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimetable_noOverlappingTimeslots(timetable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noOverlappingTimeslots constraint of '<em>Timetable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTimetable_noOverlappingTimeslots(Timetable timetable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean hasOverlap = false;
		EList<ScheduledActivity> activities = timetable.getScheduledActivity();
		int activitiesSize = activities.size();
		for (int i = 0; i < activitiesSize; i++) {
			Timeslot timeslot = activities.get(i).getTimeslot();
			for (int j = i + 1; j < activitiesSize; j++) {
				if (timeslot.overlaps(activities.get(j).getTimeslot())) {
					hasOverlap = true;
					break;
				}
			}
			if (hasOverlap) break;
		}
		if (hasOverlap) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "noOverlappingTimeslots", getObjectLabel(timetable, context) },
								new Object[] { timetable }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduledActivity(ScheduledActivity scheduledActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scheduledActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseRole(CourseRole courseRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeslot(Timeslot timeslot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExaminationActivityWeight(ExaminationActivityWeight examinationActivityWeight,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Tdt4250caseValidator
